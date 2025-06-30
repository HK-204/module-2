package product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ShowProductsHavePriceGreaterThan1000000Command implements Command {
    @Override
    public void execute() {
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
}
