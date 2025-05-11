import java.util.Scanner;

public class menuGeometry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Rectangle");
        System.out.println("2. Triangle");
        System.out.println("3. Square");
        System.out.println("0. Exit");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                break;
            case 2:
                System.out.println("*");
                System.out.println("* *");
                System.out.println("* * *");
                System.out.println("* * * *");
                break;
            case 3:
                System.out.println("* * * *");
                System.out.println("* * * *");
                System.out.println("* * * *");
                System.out.println("* * * *");
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Invalid choice");
        }
    }
}
