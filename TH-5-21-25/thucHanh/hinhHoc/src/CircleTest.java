import java.util.Arrays;
import java.util.Comparator;

public class CircleTest {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c);

        c = new Circle(3.5);
        System.out.println(c);

        c = new Circle("indigo", false, 3.5);
        System.out.println(c);

        System.out.println();
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(5.5);
        circles[1] = new Circle("Veri Puri", false,6.5);
        circles[2] = new Circle();

        System.out.println("Before sort");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Comparator comparator = new CircleComparator();
        Arrays.sort(circles, comparator);
        System.out.println("After sort");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        System.out.println();
        Circle[] circles2 = new Circle[3];
        circles2[0] = new Circle(5.5);
        circles2[1] = new Circle(10);
        circles2[2] = new Circle(8);

        for (Circle circle : circles2) {
            int random = (int)(Math.random() * 100) + 1;
            circle.resize(random);
        }
    }
}
