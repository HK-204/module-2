package advanced;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProductSearcher {
    public static void searchByName(String keyword) {
        keyword = keyword.toLowerCase();
        try (BufferedReader reader = new BufferedReader(new FileReader("products.txt"))) {
            String line;
            boolean found = false;
            System.out.println("Searching for: " + keyword);
            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().contains(keyword)) {
                    System.out.println(line);
                    found = true;
                }
            }

            if (!found) {
                System.out.println("No matching products found");
            }
        }catch (IOException e) {
            System.err.println("Error reading products.txt");
        }
    }
}
