import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankSystem bank = new BankSystem();
        int choice;

        while (true) {
            System.out.println("1. Add customers");
            System.out.println("2. Counter finish serving, next customer");
            System.out.println("3. Show queue");
            System.out.println("4. Counters status");
            System.out.println("0. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    bank.addNewCustomer(10);
                    System.out.println("Some new customers added");
                    break;
                case 2:
                    System.out.println("Number of counter just finish serving (1 - 5)");
                    int counter = sc.nextInt() - 1;
                    bank.finishServingCustomer(counter);
                    bank.serveNextCustomer();
                    break;
                case 3:
                    System.out.println("Waiting list");
                    bank.showQueue();
                    break;
                case 4:
                    System.out.println("Counters status");
                    bank.counterStatus();
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}