import java.util.Scanner;

public class duongCheoChinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số hàng và cột (lưu ý hàng bằng cột, tối đa 10)");
        System.out.print("Số hàng, cột: ");
        int rows, cols;
        rows = sc.nextInt();
        cols = rows;

        if (rows <= 0 || rows > 10) {
            System.out.print("Ma trận không hợp lệ!");
            return;
        }

        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Phần tử ở vị trí " + "[" + i + "]" + "[" + j + "]" + " là: ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Ma trận bạn vừa nhập: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int sumMajor = 0;
        for (int i = 0; i < rows; i++) {
            sumMajor += arr[i][i];
        }
        System.out.print("Tổng đường chéo chính: " + sumMajor);
    }
}
