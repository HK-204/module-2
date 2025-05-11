import java.util.Scanner;

public class tinhTienLai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double tienVay = 1.0;
        double laiSuat = 1.0;
        int thangVay = 1;

        System.out.println("Nhap so tien vay: ");
        tienVay = sc.nextDouble();
        System.out.println("Nhap lai suat: ");
        laiSuat = sc.nextDouble();
        System.out.println("Nhap so thang vay: ");
        thangVay = sc.nextInt();

        double total = 0;
        for (int i = 0; i < thangVay; i++) {
            total += tienVay * (laiSuat / 100) / 12 * thangVay;
        }
        System.out.println("Tong tien lai: " + total);
    }
}
