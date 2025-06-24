package product.checkFile;

import product.Product;
import product.checkFile.reader.*;

import java.util.List;

public class LoadProducts {
    public static List<Product> loadProducts() {
        List<Product> products = ReadFromBinaryFile.readFromBinaryFile("products.dat");
        if (products.isEmpty()) {
            products = ReadFromTextFile.readFromTextFile("products.txt");
        }
        return products;
    }
}
