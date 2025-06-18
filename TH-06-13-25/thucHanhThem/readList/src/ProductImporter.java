import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class ProductImporter {
    public static List<Product> importFromFile(String fileName, List<Product> existingProducts) {
        List<Product> importedProducts = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        if (fileName.endsWith(".txt")) {
            importedProducts = Main.readFromTextFile(fileName);
        } else if (fileName.endsWith(".dat")) {
            importedProducts = Main.readFromBinaryFile(fileName);
        } else {
            System.out.println("Unsupported file type. Please use .txt or .dat files.");
            return existingProducts;
        }

        List<Product> updatedList = new ArrayList<>(existingProducts);

        for (Product newProduct : importedProducts) {
            Optional<Product> existingProductOpt = updatedList.stream()
                    .filter(p -> p.getId().equalsIgnoreCase(newProduct.getId()))
                    .findFirst();

            if (existingProductOpt.isPresent()) {
                System.out.printf("Product with ID %s already exists. Do you want to replace it? (y/n): ", newProduct.getId());
                String choice = sc.nextLine().trim().toLowerCase();
                if (choice.equals("y")) {
                    updatedList.remove(existingProductOpt.get());
                    updatedList.add(newProduct);
                    System.out.println("Replaced product with ID " + newProduct.getId());
                } else {
                    System.out.println("Kept original product with ID " + newProduct.getId());
                }
            } else {
                updatedList.add(newProduct);
            }
        }

        return updatedList;
    }
}
