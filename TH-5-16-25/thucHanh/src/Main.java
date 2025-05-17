import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();
        lopChuNhat rectangle = new lopChuNhat(width, height);
        System.out.println("Your Rectangle \n"+ rectangle.hienThi());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.chuVi());
        System.out.println("Area of the Rectangle: "+ rectangle.dienTich());
    }
}

