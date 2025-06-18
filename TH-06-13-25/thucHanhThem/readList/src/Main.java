import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
                    System.out.print("Enter filename to import (e.g., products.txt or products.dat): ");
                    String importFile = sc.nextLine();
                    List<Product> currentList = loadProducts();
                    List<Product> updatedList = ProductImporter.importFromFile(importFile, currentList);
                    writeToTextFile(updatedList, "products.txt");
                    writeToBinaryFile(updatedList, "products.dat");
                    System.out.println("Import completed.");
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

    public static List<Product> readFromTextFile(String filePath) {
        List<Product> products = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String id = parts[0].trim();
                    String name = parts[1].trim();
                    double price = Double.parseDouble(parts[2].trim());
                    products.add(new Product(id, name, price));
                }
            }
        } catch (IOException e) {
            System.out.println("Failed to read text file: " + e.getMessage());
        }
        return products;
    }

    @SuppressWarnings("unchecked")
    public static List<Product> readFromBinaryFile(String filePath) {
        List<Product> products = new ArrayList<>();
        File file = new File(filePath);
        if (!file.exists()) {
            return products;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            Object obj = ois.readObject();
            if (obj instanceof List<?>) {
                products = (List<Product>) obj;
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Failed to read binary file: " + e.getMessage());
        }

        return products;
    }

    public static void writeToTextFile(List<Product> products, String filePath) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (Product p : products) {
                String line = p.getId() + "," + p.getName() + "," + p.getPrice();
                bw.write(line);
                bw.newLine();
            }
            bw.flush();
        } catch (IOException e) {
            System.out.println("Error writing to text file: " + e.getMessage());
        }
    }

    public static void writeToBinaryFile(List<Product> products, String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(products);
        } catch (IOException e) {
            System.out.println("Error writing to binary file: " + e.getMessage());
        }
    }

    public static List<Product> loadProducts() {
        List<Product> products = readFromBinaryFile("products.dat");
        if (products.isEmpty()) {
            products = readFromTextFile("products.txt");
        }
        return products;
    }

    public static void addProduct() {
        List<Product> products = loadProducts();

        System.out.print("Enter product ID: ");
        String id = sc.nextLine();

        boolean exists = products.stream().anyMatch(p -> p.getId().equalsIgnoreCase(id));
        if (exists) {
            System.out.println("ID already exists. Cannot add product.");
            return;
        }

        System.out.print("Enter product name: ");
        String name = sc.nextLine();

        double price;
        while (true) {
            try {
                System.out.println("Enter product price: ");
                String input = sc.nextLine().trim();
                price = Double.parseDouble(input);

                if (checkPrice(price)) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid price");
            }
        }

        Product newProduct = new Product(id, name, price);
        products.add(newProduct);
        Logger.log("Added " + id + "," + name + "," + price);

        writeToTextFile(products, "products.txt");
        writeToBinaryFile(products, "products.dat");

        System.out.println("Product added successfully.");
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
        List<Product> products = loadProducts();

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

        writeToTextFile(products, "products.txt");
        writeToBinaryFile(products, "products.dat");
    }
}