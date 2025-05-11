import java.util.Scanner;

public class dayInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the month of the year: ");
        int month = scanner.nextInt();

        String dayOfMonth;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayOfMonth = "31";
                break;
            case 2:
                dayOfMonth = "28 or 29";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayOfMonth = "30";
                break;
            default:
                dayOfMonth = "";
                break;
        }

        if (!dayOfMonth.equals("")) {
            System.out.printf("the month '%d' has %s day. ", month, dayOfMonth);
        } else {
            System.out.print("Invalid month");
        }
    }
}
