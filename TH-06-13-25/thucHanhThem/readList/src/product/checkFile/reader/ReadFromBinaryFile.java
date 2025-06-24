package product.checkFile.reader;

import product.Product;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class ReadFromBinaryFile {
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
}
