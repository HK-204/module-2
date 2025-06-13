import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        try (
                BufferedReader reader = new BufferedReader(new FileReader("source.txt"));
                BufferedWriter writer = new BufferedWriter(new FileWriter("target.txt"))
                ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Have an error " + e.getMessage());
        }
    }
}
