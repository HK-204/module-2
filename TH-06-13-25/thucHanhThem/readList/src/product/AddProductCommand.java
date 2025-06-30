package product;

import log.Logger;
import backup.FileBackup;
import product.checkFile.LoadProducts;
import product.checkFile.writer.WriteToBinaryFile;
import product.checkFile.writer.WriteToTextFile;

import java.util.List;
import java.util.Scanner;

public class AddProductCommand implements Command {
    private final Product product;

    public AddProductCommand(Product product) {
        this.product = product;
    }

    @Override
    public void execute() {
        List<Product> products = LoadProducts.loadProducts();

        boolean exists = products.stream().anyMatch(p -> p.getId().equalsIgnoreCase(product.getId()));
        if (exists) {
            System.out.println("ID already exists. Cannot add product.");
            return;
        }

        products.add(product);
        Logger.log("Added " + product.getId() + "," + product.getName() + "," + product.getPrice());

        WriteToTextFile.writeToTextFile(products, "products.txt");
        WriteToBinaryFile.writeToBinaryFile(products, "products.dat");

        Thread backupThread = new Thread(new FileBackup());
        backupThread.start();
        try {
            backupThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Product added successfully.");
    }
}
