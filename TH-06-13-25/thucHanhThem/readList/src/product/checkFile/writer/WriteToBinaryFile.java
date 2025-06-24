package product.checkFile.writer;

import product.Product;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class WriteToBinaryFile {
    public static void writeToBinaryFile(List<Product> products, String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(products);
        } catch (IOException e) {
            System.out.println("Error writing to binary file: " + e.getMessage());
        }
    }
}
