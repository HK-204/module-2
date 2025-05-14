import java.util.Scanner;

public class timPhanTu {
    public static void main(String[] args) {
        String[] index = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name's student: ");
        String name = sc.nextLine();

        boolean isExist = false;
        for (int i = 0; i < index.length; i++) {
            if (name.trim().equals(index[i])) {
                System.out.println("Student " + index[i] + " is exist at the position " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Student " + name + " is not exist");
        }
    }
}
