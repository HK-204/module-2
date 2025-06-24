import backup.FileBackup;
import product.ProductSearcher;

public class ThreadDemo {
    public static void main(String[] args) {
        Thread backupThread = new Thread(new FileBackup());
        ProductSearcher searchThread = new ProductSearcher();

        try {
            backupThread.start();
            backupThread.join();

            searchThread.start();
            searchThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
