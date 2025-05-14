import java.util.Scanner;

public class ptLonNhat2Chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so hang: ");
        int rows = sc.nextInt();
        System.out.print("Nhap so cot: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.print("Nhap cac phan tu mang: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("arr[%d][%d] = ", i, j);
                arr[i][j] = sc.nextInt();
            }
        }

        int max = arr[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }

        System.out.println(max);
    }
}
