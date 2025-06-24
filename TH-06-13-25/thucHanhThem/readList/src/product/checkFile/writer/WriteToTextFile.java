package product.checkFile.writer;

import product.Product;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteToTextFile {
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
}
