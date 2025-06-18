import java.io.*;
import java.util.Iterator;
import java.util.List;

public class ProductRemover {
    public static void removeById(String id) {
        List<Product> products = Main.loadProducts();

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
            Main.writeToTextFile(products, "products.txt");
            Main.writeToBinaryFile(products, "products.dat");
            System.out.println("Removed " + id);
            FileBackup.backup();
        } else {
            System.err.println("Product with ID '" + id + "' not found.");
        }
    }
}
