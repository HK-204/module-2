import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorExample {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int num1 = 0, num2 = 0;
            System.out.print("Enter num1: ");
            num1 = sc.nextInt();
            System.out.print("Enter num2: ");
            num2 = sc.nextInt();

            CalculatorExample calc = new CalculatorExample();
            calc.calculate(num1, num2);
        } catch (InputMismatchException e) {
            System.err.println("Invalid input, please enter a number");
        } finally {
            System.out.println("Done");
        }

    }

    public void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Sum x + y = " + a);
            System.out.println("Subtract x - y = " + b);
            System.out.println("Multiply x * y = " + c);
            System.out.println("Divide x / y = " + d);
        } catch (ArithmeticException e) {
            System.err.println("Error, can't divide by zero ");
        }
    }
}
