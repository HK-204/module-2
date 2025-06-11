import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("=== Calculate area menu ===");
            System.out.println("1. Triangle Area");
            System.out.println("2. Rectangle Area");
            System.out.println("3. Circle Area");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    new Triangle().run();
                    break;
                case 2:
                    new Rectangle().run();
                    break;
                case 3:
                    new Circle().run();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.err.println("Invalid choice");
            }
        } while (choice != 0);
        sc.close();
    }
}
