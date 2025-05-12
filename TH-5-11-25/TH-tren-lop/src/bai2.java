import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String index = sc.nextLine();

        if (index.trim().isEmpty()) {
            System.out.println("You entered an empty number");
        } else {
            int number = Integer.parseInt(index.trim());
            int number1 = number;
            if (number < 0) {
                System.out.println("You entered a negative number");
                return;
            }

            int reversed = 0;
            while (number > 0) {
                int digit = number % 10;
                reversed = reversed * 10 + digit;
                number = number / 10;
            }

            if (reversed == number1) {
                System.out.println("This is a symmetric number.");
            } else {
                System.out.println("This is not a symmetric number.");
            }
        }
    }
}
