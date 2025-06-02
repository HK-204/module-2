import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Thập phân -> Nhị phân");
            System.out.println("2. Thập phân -> Hex (16)");
            System.out.println("3. Nhị phân -> Thập phân");
            System.out.println("4. Hex (16) -> Thập phân");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhập số thập phân: ");
                    int dec1 = sc.nextInt();
                    System.out.println("Nhị phân: " + decimalToBinary(dec1));
                    break;

                case 2:
                    System.out.print("Nhập số thập phân: ");
                    int dec2 = sc.nextInt();
                    System.out.println("Hex: " + decimalToHex(dec2));
                    break;

                case 3:
                    System.out.print("Nhập chuỗi nhị phân: ");
                    String bin = sc.nextLine();
                    System.out.println("Thập phân: " + binaryToDecimal(bin));
                    break;

                case 4:
                    System.out.print("Nhập chuỗi hex: ");
                    String hex = sc.nextLine();
                    System.out.println("Thập phân: " + hexToDecimal(hex));
                    break;

                case 0:
                    System.out.println("Tạm biệt!");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }

        } while (choice != 0);
    }

    public static String decimalToBinary(int decimal) {
        Stack<Integer> stack = new Stack<>();
        while (decimal != 0) {
            stack.push(decimal % 2);
            decimal /= 2;
        }

        StringBuilder binary = new StringBuilder();
        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }
        return binary.toString();
    }

    public static int binaryToDecimal(String binary) {
        Stack<Integer> stack = new Stack<>();
        for (char c : binary.toCharArray()) {
            stack.push(c - '0');
        }

        int power = 0;
        int decimal = 0;
        while (!stack.isEmpty()) {
            decimal += stack.pop() * Math.pow(2, power++);
        }
        return decimal;
    }

    public static String decimalToHex(int decimal) {
        Stack<Character> stack = new Stack<>();
        char[] hexChars = "0123456789ABCDEF".toCharArray();
        while (decimal != 0) {
            stack.push(hexChars[decimal % 16]);
            decimal /= 16;
        }

        StringBuilder hex = new StringBuilder();
        while (!stack.isEmpty()) {
            hex.append(stack.pop());
        }
        return hex.toString();
    }

    public static int hexToDecimal(String hex) {
        Stack<Integer> stack = new Stack<>();
        for (char c : hex.toUpperCase().toCharArray()) {
            if (c >= '0' && c <= '9') {
                stack.push(c - '0');
            } else {
                stack.push(c - 'A' + 10);
            }
        }

        int power = 0;
        int decimal = 0;
        while (!stack.isEmpty()) {
            decimal += stack.pop() * Math.pow(16, power++);
        }
        return decimal;
    }
}