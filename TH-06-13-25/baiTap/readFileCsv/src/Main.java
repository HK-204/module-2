import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("country.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Country country = parseCountry(line);
                System.out.println(country);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Country parseCountry(String csvLine) {
        if (csvLine != null) {
            String[] tokens = csvLine.split(",");
            int id = Integer.parseInt(tokens[0]);
            String code = tokens[1];
            String name = tokens[2];
            return new Country(id, code, name);
        }
        return null;
    }
}