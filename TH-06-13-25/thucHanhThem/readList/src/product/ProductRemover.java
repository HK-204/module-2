package product;

import backup.FileBackup;
import log.Logger;
import product.checkFile.LoadProducts;
import product.checkFile.writer.WriteToBinaryFile;
import product.checkFile.writer.WriteToTextFile;

import java.util.Iterator;
import java.util.List;

public class ProductRemover {
    public static void removeById(String id) {
        List<Product> products = LoadProducts.loadProducts();

        boolean removed = false;
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product p = iterator.next();
            if (p.getId().equalsIgnoreCase(id)) {
                iterator.remove();
                removed = true;
                Logger.log("Removed " + id);
                break;
            }
        }

        if (removed) {
            WriteToTextFile.writeToTextFile(products, "products.txt");
            WriteToBinaryFile.writeToBinaryFile(products, "products.dat");
            System.out.println("Removed " + id);

            Thread backupThread = new Thread(new FileBackup());
            backupThread.start();
            try {
                backupThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.err.println("product.Product with ID '" + id + "' not found.");
        }
    }
}
