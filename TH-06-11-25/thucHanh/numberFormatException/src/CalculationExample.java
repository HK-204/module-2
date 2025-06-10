import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.println();
        System.out.print("Enter y: ");
        int y = sc.nextInt();
        System.out.println();
        CalculationExample calc = new CalculationExample();
        calc.calculate(x, y);
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
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }
}
