import java.util.Scanner;

public class demKyTuChuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi bạn muốn: ");
        String str = sc.nextLine();
        System.out.print("Nhập ký tự bạn muốn đếm: ");
        char ch = sc.next().charAt(0);

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                count++;
            }
        }
        System.out.println("Ký tự " + ch + " có tổng " + count);
    }
}
