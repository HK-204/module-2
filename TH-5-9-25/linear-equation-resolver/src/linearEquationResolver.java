import java.util.Scanner;

public class linearEquationResolver {
    public static void main(String[] args) {
        System.out.println("a * x + b = c");
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();

        System.out.print("c: ");
        double c = scanner.nextDouble();

        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("x = %f", answer);
        } else {
            if (b == c) {
                System.out.print("Solution with all x");
            } else {
                System.out.print("No solution");
            }
        }
    }
}
