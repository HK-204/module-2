package product.importer;

import product.Product;

import java.util.List;

public class ProductImporter extends Thread {
    private final String fileName;
    private final List<Product> existingProducts;
    private final ProductImportStrategy importStrategy;
    private final ProductMergeStrategy mergeStrategy;
    private List<Product> resultList;

    public ProductImporter(String fileName, List<Product> existingProducts,
                           ProductImportStrategy importStrategy, ProductMergeStrategy mergeStrategy) {
        this.fileName = fileName;
        this.existingProducts = existingProducts;
        this.importStrategy = importStrategy;
        this.mergeStrategy = mergeStrategy;
    }

    public List<Product> getResultList() {
        return resultList;
    }

    @Override
    public void run() {
        System.out.println("Importing products from file...");
        ImportService importService = new ImportService(importStrategy, mergeStrategy);
        resultList = importService.importAndMerge(fileName, existingProducts);
        System.out.println("Import complete.");
    }
}
