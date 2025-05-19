public class Calculator {

    static int add(int a, int b) {
        return a + b;
    }
    static int subtract(int a, int b) {
        return a - b;
    }
    static int multiply(int a, int b) {
        return a * b;
    }
    static int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Not divisible by zero");
            return 0;
        }
        return a / b;
    }
}
