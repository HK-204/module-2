import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String index = sc.nextLine();

        if (index.trim().isEmpty()) {
            System.out.println("You entered an empty number");
        } else {
            int number = Integer.parseInt(index.trim());
            if (number < 0) {
                System.out.println("You entered a negative number");
                return;
            }

            int n = 1;
            for (int i = 1; i <= number; i++) {
                n *= i;
            }
            System.out.println(n);
        }
    }
}
