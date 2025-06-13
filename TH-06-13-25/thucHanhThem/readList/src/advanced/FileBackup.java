package advanced;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileBackup {
    public static void backup() {
        try {
            String timeStamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
            Path source = Paths.get("products.txt");
            Path backup = Paths.get("products_backup_" + timeStamp + ".txt");
            Files.copy(source, backup, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Backup complete: " + backup.getFileName());
        } catch (IOException e) {
            System.err.println("Backup failed: " + e.getMessage());
        }
    }
}
