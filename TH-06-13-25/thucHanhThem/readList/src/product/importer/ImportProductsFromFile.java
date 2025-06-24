package product.importer;

import product.Product;

import java.util.List;
import java.util.Scanner;

public class ImportProductsFromFile {
    public static void execute(List<Product> currentProducts) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file name to import (.txt or .dat): ");
        String fileName = scanner.nextLine();

        ProductImportStrategy importStrategy;

        if (fileName.endsWith(".txt")) {
            importStrategy = new TextFileImportStrategy();
        } else if (fileName.endsWith(".dat")) {
            importStrategy = new BinaryFileImportStrategy();
        } else {
            System.out.println("Unsupported file type.");
            return;
        }

        ProductMergeStrategy mergeStrategy = new AskUserMergeStrategy();
        ProductImporter importer = new ProductImporter(fileName, currentProducts, importStrategy, mergeStrategy);
        importer.start();

        try {
            importer.join();
            List<Product> resultList = importer.getResultList();
            currentProducts.clear();
            currentProducts.addAll(resultList);
            System.out.println("Products imported successfully.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
