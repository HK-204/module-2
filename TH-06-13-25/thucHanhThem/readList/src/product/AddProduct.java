package product;

import log.Logger;
import backup.FileBackup;
import product.checkFile.LoadProducts;
import product.checkFile.writer.WriteToBinaryFile;
import product.checkFile.writer.WriteToTextFile;

import java.util.List;
import java.util.Scanner;

public class AddProduct {
    static Scanner sc = new Scanner(System.in);
    public static void addProduct() {
        List<Product> products = LoadProducts.loadProducts();

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

                if (CheckValidPrice.checkPrice(price)) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid price");
            }
        }

        Product newProduct = new Product(id, name, price);
        products.add(newProduct);
        Logger.log("Added " + id + "," + name + "," + price);

        WriteToTextFile.writeToTextFile(products, "products.txt");
        WriteToBinaryFile.writeToBinaryFile(products, "products.dat");

        Thread backupThread = new Thread(new FileBackup());
        backupThread.start();
        try {
            backupThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("product.Product added successfully.");
    }
}
