import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
    public static void main(String[] args) {
        System.out.println("Enter file link: ");
        Scanner sc = new Scanner(System.in);
        String filename = sc.nextLine();

        ReadFileExample readFileEx = new ReadFileExample();
        readFileEx.readFileText(filename);
    }

    public void readFileText(String filePath) {
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("Sum: " + sum);
        } catch (Exception e) {
            System.err.println("File not found or have error");
        }
    }
}
