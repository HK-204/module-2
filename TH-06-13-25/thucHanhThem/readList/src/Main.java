import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import advanced.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("========== MENU ==========");
            System.out.println("1. Products list");
            System.out.println("2. Add product");
            System.out.println("3. Show products with price greater than 1000000");
            System.out.println("4. Edit product price by id");
            System.out.println("5. Search product by name");
            System.out.println("6. Remove product by id");
            System.out.println("7. Import data from another file");
            System.out.println("0. Exit");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    showProductsList();
                    break;

                case 2:
                    addProduct();
                    break;

                case 3:
                    showProductsHavePriceGreaterThan1000000();
                    break;

                case 4:
                    editProductPriceById();
                    break;

                case 5:
                    System.out.println("Enter keyword to search for product: ");
                    String keyword = sc.nextLine();
                    ProductSearcher.searchByName(keyword);
                    break;

                case 6:
                    System.out.println("Enter id to remove product: ");
                    String id = sc.nextLine();
                    ProductRemover.removeById(id);
                    break;

                case 7:
                    System.out.println("Enter file name to import: ");
                    String filename = sc.nextLine();
                    ProductImporter.importFromFile(filename);
                    break;

                case 0:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 0);
    }

    public static void showProductsList() {
        try (BufferedReader reader = new BufferedReader(new FileReader("products.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean checkPrice(double price) {
        if (price < 0) {
            System.out.println("Invalid price");
            return false;
        }
        return true;
    }

    public static void addProduct() {
        try {
            System.out.println("Enter product id: ");
            String newProductId = sc.nextLine();
            System.out.println("Enter product name: ");
            String newProductName = sc.nextLine();
            double newProductPrice;
            while (true) {
                try {
                    System.out.println("Enter product price: ");
                    String input = sc.nextLine().trim();
                    newProductPrice = Double.parseDouble(input);

                    if (checkPrice(newProductPrice)) {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid price");
                }
            }
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("products.txt", true))) {
                writer.write(newProductId + "," + newProductName + "," + newProductPrice);
                writer.newLine();
                Logger.log("Added " + newProductId + "," + newProductName + "," + newProductPrice);
                System.out.println("Added successfully");
            } catch (IOException e) {
                System.err.println("Error adding product to file");
            }
        } catch (Exception e) {
            System.err.println("Exception " + e.getMessage());
        }
    }

    public static void showProductsHavePriceGreaterThan1000000() {
        try (BufferedReader reader = new BufferedReader(new FileReader("products.txt"))) {
            String line;
            boolean found = false;
            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty()) continue;
                String[] parts = line.split(",");
                if (parts.length != 3) continue;

                String productId = parts[0];
                String productName = parts[1];
                double productPrice = Double.parseDouble(parts[2]);

                if (productPrice > 1000000) {
                    Product product = new Product(productId, productName, productPrice);
                    System.out.println(product);
                    found = true;
                }
            }

            if (!found) {
                System.out.println("No products found with price greater than 1000000");
            }
        } catch (IOException e) {
            System.err.println("Error reading file " + e.getMessage());
        }
    }

    public static void editProductPriceById() {
        List<Product> products = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("products.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty()) continue;
                String[] parts = line.split(",");
                if (parts.length != 3) continue;

                String productId = parts[0];
                String productName = parts[1];
                double productPrice = Double.parseDouble(parts[2]);
                Product product = new Product(productId, productName, productPrice);
                products.add(product);
            }
        } catch (IOException e) {
            System.err.println("Error reading file " + e.getMessage());
            return;
        }

        System.out.println("Enter product id: ");
        String targetProductId = sc.nextLine();

        boolean found = false;
        for (Product product : products) {
            if (product.getId().equals(targetProductId)) {
                double oldPrice = product.getPrice();
                double newProductPrice;
                while (true) {
                    try {
                        System.out.print("Enter new price: ");
                        String input = sc.nextLine().trim();
                        newProductPrice = Double.parseDouble(input);
                        if (checkPrice(newProductPrice)) {
                            break;
                        }
                    } catch (NumberFormatException e) {
                        System.err.println("Invalid price");
                    }
                }

                product.setPrice(newProductPrice);
                Logger.log(product.getId() + " " + oldPrice + " -> " + newProductPrice);
                System.out.println("Price updated successfully");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No product found with id " + targetProductId);
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("products.txt"))) {
            for (Product product : products) {
                writer.write(product.getId() + "," + product.getName() + "," + product.getPrice());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error updating file " + e.getMessage());
        }
    }
}