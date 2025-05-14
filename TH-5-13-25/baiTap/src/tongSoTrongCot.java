import java.util.Scanner;

public class tongSoTrongCot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter columns : ");
        int columns = sc.nextInt();
        int[][] arr = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Enter element "+i+"-"+j);
                arr[i][j] = sc.nextInt();
            }
        }

        boolean found = false;
        do {
            System.out.println("Choose column (0 - " + (columns - 1) + "): ");
            int column = sc.nextInt();
            if (column >= 0 && column < columns) {
                found = true;
                int sum = tongCot(arr, column);
                System.out.println("Sum of column " + column + " is: " + sum);
            } else {
                System.out.println("Invalid input");
            }
        } while (!found);
        sc.close();
    }

    public static int tongCot(int[][] arr, int column) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][column];
        }
        return sum;
    }
}
