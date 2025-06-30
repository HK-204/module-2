package product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ShowProductListCommand implements Command {
    @Override
    public void execute() {
        try (BufferedReader reader = new BufferedReader(new FileReader("products.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
