import java.util.Scanner;

public class tinhTienDien {
    public static void main(String[] args) {
        float kwh;
        float donGia;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of kwh: ");
        kwh = scanner.nextFloat();

        if (kwh >= 0 && kwh <= 50) {
            donGia = kwh * 1800;
            System.out.println("Tong tien dien: " + donGia);
        } else if (kwh >= 51 && kwh <= 100) {
            donGia = 50*1800 + (kwh - 50) * 2300;
            System.out.println("Tong tien dien: " + donGia);
        } else if (kwh > 100) {
            donGia = 50*1800 + 50*2300 + (kwh - 100) * 3000;
            System.out.println("Tong tien dien: " + donGia);
        } else {
            System.out.println("invalid input");
        }
    }
}
