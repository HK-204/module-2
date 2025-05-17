import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 'start' to start watch, 'stop' to stop watch: ");
        StopWatch stopWatch = new StopWatch();

        while (true) {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("start")) {
                if (stopWatch.isRunning()) {
                    System.out.println("Stop watch is already running");
                } else {
                    stopWatch.start();
                    System.out.println("Watch started");
                }
            } else if (input.equalsIgnoreCase("stop")) {
                if (!stopWatch.isRunning()) {
                    System.out.println("Watch is not running");
                } else {
                    stopWatch.stop();
                    System.out.println("Watch stopped");
                    System.out.println("Your started time: " + stopWatch.getStartTime() + "ms");
                    System.out.println("Your ended time: " + stopWatch.getEndTime() + "ms");
                    System.out.println("Total time: " + stopWatch.getElapsedTime() + "ms");
                    break;
                }
            } else {
                System.out.println("Invalid input, please type 'start' or 'stop'.");
            }
        }
        sc.close();
    }
}