package advanced;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static final String LOG_FILE = "history.log";
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void log(String action) {
        String timeStamp = LocalDateTime.now().format(formatter);
        String logLine = String.format("[%s] %s\n", timeStamp, action);

        try (FileWriter writer = new FileWriter(LOG_FILE, true)) {
            writer.write(logLine);
        } catch (IOException e) {
            System.err.println("Could not write to log file");
        }
    }
}
