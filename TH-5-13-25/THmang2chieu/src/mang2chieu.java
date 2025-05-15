import java.util.Scanner;

public class mang2chieu {
    static int[][] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu");
            System.out.println("1. Nhập và hiển thị ma trận số nguyên");
            System.out.println("2: Tính tổng từng hàng và từng cột của ma trận");
            System.out.println("3: Tìm phần tử lớn nhất và nhỏ nhất trong ma trận");
            System.out.println("4: Tính tổng đường chéo chính và phụ");
            System.out.println("5: Kiểm tra ma trận đối xứng");
            System.out.println("0: Thoát");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    matrix(sc);
                    break;
                case 2:
                    sumRowCols();
                    break;
                case 3:
                    maxMin();
                    break;
                case 4:
                    majorMinorDiagonals();
                    break;
                case 5:
                    symmetricMatrix();
                    break;
                case 0:
                    System.out.print("Kết thúc chương trình");
            }
        } while (choice != 0);
        sc.close();
    }

    public static void matrix(Scanner sc) {
        System.out.println("Nhập số hàng và cột (lưu ý hàng bằng cột, tối đa 10)");
        System.out.print("Số hàng, cột: ");
        int rows, cols;
        rows = sc.nextInt();
        cols = rows;

        if (rows <= 0 || rows > 10) {
            System.out.print("Ma trận không hợp lệ!");
            return;
        }

        arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Phần tử ở vị trí " + "[" + i + "]" + "[" + j + "]" + " là: ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nMa trận bạn vừa nhập: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void sumRowCols() {
        if (arr == null) {
            System.out.print("Vui lòng nhập mảng hợp lệ trước (chọn 1)");
            return;
        }

        int rows = arr.length;
        int cols = arr[0].length;

        System.out.println("Tổng hàng:");
        for (int row = 0; row < rows; row++) {
            int sumRow = 0;
            for (int col = 0; col < cols; col++) {
                sumRow += arr[row][col];
            }
            System.out.println("Tổng hàng " + row + ": " + sumRow);
        }

        System.out.println("Tổng cột:");
        for (int col = 0; col < cols; col++) {
            int sumCol = 0;
            for (int row = 0; row < rows; row++) {
                sumCol += arr[row][col];
            }
            System.out.println("Tổng cột " + col + ": " + sumCol);
        }
    }

    public static void maxMin() {
        if (arr == null) {
            System.out.print("Vui lòng nhập mảng hợp lệ trước (chọn 1)");
            return;
        }

        int max = arr[0][0];
        int min = arr[0][0];
        int rowMax = 0;
        int colMax = 0;
        int rowMin = 0;
        int colMin = 0;

        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    rowMax = i;
                    colMax = j;
                }
                if (arr[i][j] < min) {
                    min = arr[i][j];
                    rowMin = i;
                    colMin = j;
                }
            }
        }
        System.out.print("Gía trị lớn nhất là " + max + " tại vị trí " + "[" + rowMax + "]" + "[" + colMax + "]");
        System.out.print("Gía trị nhỏ nhất là " + min + " tại vị trí " + "[" + rowMin + "]" + "[" + colMin + "]");
    }

    public static void majorMinorDiagonals() {
        if (arr == null) {
            System.out.print("Vui lòng nhập mảng hợp lệ trước (chọn 1)");
            return;
        }

        int sumMajor = 0;
        int sumMinor = 0;

        for (int row = 0; row < arr.length; row++) {
            sumMajor += arr[row][row];
            sumMinor += arr[row][arr.length - 1 - row];
        }

        System.out.print("Tổng đường chéo chính: " + sumMajor);
        System.out.print("Tổng đường chéo phụ: " + sumMinor);
    }

    public static void symmetricMatrix() {
        if (arr == null) {
            System.out.print("Vui lòng nhập mảng hợp lệ trước (chọn 1)");
            return;
        }

        boolean isSymmetric = true;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] != arr[col][row]) {
                    isSymmetric = false;
                    break;
                }
            }
            if (!isSymmetric) break;
        }

        if (isSymmetric) {
            System.out.print("Đây là mảng đối xứng");
        } else {
            System.out.print("Đây không phải là mảng đối xứng");
        }
    }
}
