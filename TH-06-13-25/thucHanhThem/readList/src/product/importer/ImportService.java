package product.importer;

import backup.FileBackup;
import product.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ImportService {
    private final ProductImportStrategy importStrategy;
    private final ProductMergeStrategy mergeStrategy;

    public ImportService(ProductImportStrategy importStrategy, ProductMergeStrategy mergeStrategy) {
        this.importStrategy = importStrategy;
        this.mergeStrategy = mergeStrategy;
    }

    public List<Product> importAndMerge(String fileName, List<Product> existingProducts) {
        List<Product> importedProducts = importStrategy.importFrom(fileName, existingProducts);
        List<Product> updatedList = new ArrayList<>(existingProducts);

        for (Product newProduct : importedProducts) {
            Optional<Product> existing = updatedList.stream()
                    .filter(p -> p.getId().equalsIgnoreCase(newProduct.getId()))
                    .findFirst();

            if (existing.isPresent()) {
                if (mergeStrategy.shouldReplace(existing.get(), newProduct)) {
                    updatedList.remove(existing.get());
                    updatedList.add(newProduct);
                    System.out.println("Replaced product with ID: " + newProduct.getId());
                } else {
                    System.out.println("Kept original product with ID: " + newProduct.getId());
                }
            } else {
                updatedList.add(newProduct);
            }
        }

        Thread backupThread = new Thread(new FileBackup());
        backupThread.start();
        try {
            backupThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return updatedList;
    }
}
