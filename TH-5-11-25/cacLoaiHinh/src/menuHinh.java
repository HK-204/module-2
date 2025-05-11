import java.util.Scanner;

public class menuHinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("0. Exit");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                for (int i = 1; i <= 4; i++) {
                    for (int j = 1; j <= 6; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (int i = 1; i <= 4; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                System.out.println();
                for (int i = 1; i <= 4; i++) {
                    for (int space = 4 - i; space > 0; space--) {
                        System.out.print("  ");
                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print(" *");
                    }
                    System.out.println();
                }
                System.out.println();
                for (int i = 1; i <= 4; i++) {
                    for (int j = 5 - i; j >= 1; j--) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                System.out.println();
                for (int i = 1; i <= 4; i++) {
                    for (int space = 1; space < i; space++) {
                        System.out.print("  ");
                    }
                    for (int j = 5 - i; j >= 1; j--) {
                        System.out.print(" *");
                    }
                    System.out.println();
                }
                break;
            case 3:
                for (int i = 1; i <= 4; i++) {
                    for (int space = 4 - i; space >= 0; space--) {
                        System.out.print("  ");
                    }
                    for (int j = 1; j <= i * 2 - 1; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 0:
                System.exit(0);
        }
    }
}
