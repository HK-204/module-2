import java.util.Scanner;

public class bai4 {
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

            int total = 0;
            for (int i = 1; i <= number/2; i++) {
                if (number % i == 0) {
                    total += i;
                }
            }
            if (total == number) {
                System.out.println("This is the perfect number");
            } else {
                System.out.println("This is not the perfect number");
            }
        }
    }
}
