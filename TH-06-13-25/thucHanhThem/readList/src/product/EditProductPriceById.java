package product;

import backup.FileBackup;
import log.Logger;
import product.checkFile.LoadProducts;
import product.checkFile.writer.WriteToBinaryFile;
import product.checkFile.writer.WriteToTextFile;

import java.util.List;
import java.util.Scanner;

public class EditProductPriceById {
    static Scanner sc = new Scanner(System.in);
    public static void editProductPriceById() {
        List<Product> products = LoadProducts.loadProducts();

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
                        if (CheckValidPrice.checkPrice(newProductPrice)) {
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

        WriteToTextFile.writeToTextFile(products, "products.txt");
        WriteToBinaryFile.writeToBinaryFile(products, "products.dat");

        Thread backupThread = new Thread(new FileBackup());
        backupThread.start();
        try {
            backupThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
