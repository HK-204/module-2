package advanced;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ProductImporter {
    public static void importFromFile(String fileName) {
        try (
                BufferedReader reader = new BufferedReader(new FileReader(fileName));
                FileWriter writer = new FileWriter("products.txt", true)
                ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line + "\n");
                Logger.log("Imported: " + line);
            }

            System.out.println("Imported: " + fileName);
            FileBackup.backup();
        } catch (IOException e) {
            System.err.println("Error while reading file: " + fileName);
        }
    }
}
