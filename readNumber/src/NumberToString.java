import java.util.Scanner;

public class NumberToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (1 - 999): ");
        int num = sc.nextInt();

        if (num <= 0 || num > 999) {
            System.out.println("Invalid number");
            return;
        }

        int hundreds = num / 100;
        int tensUnits = num % 100;
        int tens = tensUnits / 10;
        int units = tensUnits % 10;

        if (hundreds > 0){
            System.out.print(switchWord(hundreds) + "hundreds");
            if (tensUnits > 0) System.out.print(" and ");
        }

        if (tensUnits > 0){
            if (tensUnits < 10) {
                System.out.print(switchWord(tensUnits));
            } else if (tensUnits < 20) {
                System.out.print(teenWord(tensUnits));
            } else {
                System.out.print(tensWord(tens));
                if (units > 0) {
                    System.out.print("-" + switchWord(units));
                }
            }
        }
    }

    public static String switchWord(int num){
        return switch (num) {
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            case 6 -> "Six";
            case 7 -> "Seven";
            case 8 -> "Eight";
            case 9 -> "Nine";
            default -> "";
        };
    }

    public static String teenWord(int num){
        return switch (num) {
            case 10 -> "ten";
            case 11 -> "eleven";
            case 12 -> "twelve";
            case 13 -> "thirteen";
            case 14 -> "fourteen";
            case 15 -> "fifteen";
            case 16 -> "sixteen";
            case 17 -> "seventeen";
            case 18 -> "eighteen";
            case 19 -> "nineteen";
            default -> "";
        };
    }

    public static String tensWord(int num){
        return switch (num) {
            case 2 -> "twenty";
            case 3 -> "thirty";
            case 4 -> "forty";
            case 5 -> "fifty";
            case 6 -> "sixty";
            case 7 -> "seventy";
            case 8 -> "eighty";
            case 9 -> "ninety";
            default -> "";
        };
    }
}
