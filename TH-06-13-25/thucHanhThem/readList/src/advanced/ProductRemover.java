package advanced;

import java.io.*;

public class ProductRemover {
    public static void removeById(String id) {
        File inputFile = new File("products.txt");
        File tempFile = new File("temp.txt");

        boolean removed = false;

        try (
                BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        if (!line.startsWith(id + ",")) {
                            writer.write(line + "\n");
                        } else {
                            removed = true;
                            Logger.log("Removed " + id);
                        }
                    }
        } catch (IOException e) {
            System.err.println("Error reading products.txt file");
        }

        if (removed) {
            inputFile.delete();
            tempFile.renameTo(inputFile);
            System.out.println("Removed " + id);
            FileBackup.backup();
        } else {
            System.err.println("Not found " + id);
        }
    }
}
