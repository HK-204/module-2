import java.util.Scanner;

public class daoSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        String input = sc.nextLine();

        if (input.trim().isEmpty()) {
            System.out.println("Invalid number");
        } else {
            int number = Integer.parseInt(input);
            if (number <= 0){
                System.out.println("Invalid number");
                return;
            }

            int reversed = 0;
            while (number > 0){
                int digit = number % 10;
                reversed = reversed * 10 + digit;
                number = number / 10;
            }
            System.out.println(reversed);
        }
    }
}
