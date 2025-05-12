import java.util.Scanner;

public class bai1 {
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

            int max = 0;
            while (number > 0) {
                int temp = number % 10;
                if (max < temp) {
                    max = temp;
                }
                number = number / 10;
            }
            System.out.println(max);
        }
    }
}
