import java.util.Arrays;
import java.util.Scanner;

public class q {
    static double[] arrSinhVien;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Nhập và hiển thị danh sách điểm: ");
            System.out.println("2: Tính toán thống kê điểm: ");
            System.out.println("3: Tìm kiếm điểm: ");
            System.out.println("4: Phân loại học lực: ");
            System.out.println("5 (nâng cao): Sắp xếp danh sách điểm: ");
            System.out.println("0: Thoát: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    danhSachDiem(sc);
                    break;
                case 2:
                    thongKeDiem();
                    break;
                case 3:
                    timKiemDiem(sc);
                    break;
                case 4:
                    phanLoaiHocLuc();
                    break;
                case 5:
                    sapXepDiem();
                    break;
                case 0:
                    System.out.print("Kết thúc");
                default:
                    System.out.print("Lựa chọn không hợp lệ");
            }
        } while (choice != 0);
        sc.close();
    }

    public static void danhSachDiem(Scanner sc) {
        System.out.print("Nhập số lượng sinh viên (1 - 100): ");
        int sinhVien = sc.nextInt();

        if (sinhVien <= 0 || sinhVien > 100) {
            System.out.print("Số lượng không hợp lệ");
            return;
        }

        arrSinhVien = new double[sinhVien];
        for (int i = 0; i < arrSinhVien.length; i++) {
            System.out.print("Nhập điểm sinh viên ở vị trí " + (i + 1) + ": ");
            arrSinhVien[i] = sc.nextDouble();
        }
        System.out.print("Danh sách điểm sinh viên: " + Arrays.toString(arrSinhVien));
    }

    public static void thongKeDiem() {
        if (arrSinhVien == null) {
            System.out.println("Vui lòng nhập danh sách điểm trước (chọn 1).");
            return;
        }
        double sum = 0;
        double min = arrSinhVien[0];
        double max = arrSinhVien[0];
        int countPass = 0;

        for (double diem : arrSinhVien) {
            if (diem < min) min = diem;
            if (diem > max) max = diem;
            sum += diem;
            if (diem >= 5) countPass++;
        }

        double avg = sum / arrSinhVien.length;
        System.out.println("Điểm trung bình: " + avg);
        System.out.println("Số sinh viên đạt điểm >= 5: " + countPass);
        System.out.println("Điểm cao nhất là " + max + " và điểm thấp nhất là " + min);
    }

    public static void timKiemDiem(Scanner sc) {
        if (arrSinhVien == null) {
            System.out.println("Vui lòng nhập danh sách điểm trước (chọn 1).");
            return;
        }
        System.out.print("Nhập số điểm bạn muốn tìm: ");
        double soDiem = sc.nextDouble();
        boolean found = false;

        System.out.println("Điểm " + soDiem + " ở các vị trí: ");
        for (int i = 0; i < arrSinhVien.length; i++) {
            if (arrSinhVien[i] == soDiem) {
                System.out.print(i + "\t");
                found = true;
            }
        }

        if (!found) {
            System.out.print("Không có số điểm bạn nhập");
        }
    }

    public static void phanLoaiHocLuc() {
        if (arrSinhVien == null) {
            System.out.println("Vui lòng nhập danh sách điểm trước (chọn 1).");
            return;
        }
        System.out.println("Danh sách phân loại học lực sinh viên: ");
        for (int i = 0; i < arrSinhVien.length; i++) {
            if (arrSinhVien[i] >= 8){
                System.out.println("Sinh viên thứ " + (i + 1) + " xếp loại Giỏi");
            } else if (arrSinhVien[i] >= 6.5){
                System.out.println("Sinh viên thứ " + (i + 1) + " xếp loại Khá");
            } else if (arrSinhVien[i] >= 5){
                System.out.println("Sinh viên thứ " + (i + 1) + " xếp loại Trung Bình");
            } else {
                System.out.println("Sinh viên thứ " + (i + 1) + " xếp loại Yếu");
            }
        }
    }

    public static void sapXepDiem() {
        if (arrSinhVien == null) {
            System.out.println("Vui lòng nhập danh sách điểm trước (chọn 1).");
            return;
        }

        for (int i = 0; i < arrSinhVien.length - 1; i++) {
            for (int j = 0; j < arrSinhVien.length - 1 - i; j++) {
                if (arrSinhVien[j] > arrSinhVien[j + 1]) {
                    double temp = arrSinhVien[j];
                    arrSinhVien[j] = arrSinhVien[j + 1];
                    arrSinhVien[j + 1] = temp;
                }
            }
        }

        System.out.println("Danh sách điểm sau khi sắp xếp tăng dần:");
        for (double diem : arrSinhVien) {
            System.out.print(diem + "\t");
        }
    }
}
