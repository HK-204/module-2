import java.util.Scanner;

public class tinhTienDien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of kwh: ");
        float kwh = scanner.nextFloat();

        if (kwh < 0){
            System.out.println("invalid input");
        }

        float donGia;
        if (kwh >= 0 && kwh <= 50) {
            donGia = kwh * 1800;
        } else if (kwh >= 51 && kwh <= 100) {
            donGia = 50*1800 + (kwh - 50) * 2300;
        } else {
            donGia = 50 * 1800 + 50 * 2300 + (kwh - 100) * 3000;
        }
        System.out.println("Tong tien dien: " + donGia);
    }
}
