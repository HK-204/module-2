import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string to check: ");
        String str = sc.nextLine();
        boolean result = isIncreasingSubString(str);
        System.out.println(result);
    }

    static boolean isIncreasingSubString(String str) {
        if (str.length() <= 1) return true;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i + 1] - chars[i] !=1) {
                return false;
            }
        }
        return true;
    }
}