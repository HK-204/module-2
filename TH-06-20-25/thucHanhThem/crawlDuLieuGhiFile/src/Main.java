import java.io.*;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String url = "https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html";
        String outputFile = "output.txt";

        try {
            StringBuilder htmlContent = new StringBuilder();
            Scanner scanner = new Scanner(new URL(url).openStream(), "UTF-8");
            while (scanner.hasNextLine()) {
                htmlContent.append(scanner.nextLine());
            }
            scanner.close();

            Pattern pattern = Pattern.compile("<a[^>]*class=\"avatar_song\"[^>]*title=\"([^\"]+)\"", Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(htmlContent.toString());

            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            while (matcher.find()) {
                String title = matcher.group(1).trim();
                writer.write(title);
                writer.newLine();
            }
            writer.close();

            System.out.println("Danh sách tiêu đề đã lưu:");
            BufferedReader reader = new BufferedReader(new FileReader(outputFile));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}