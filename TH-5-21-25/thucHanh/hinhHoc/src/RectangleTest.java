import java.util.Comparator;
import java.util.Arrays;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(4, 5);
        System.out.println(rectangle);

        rectangle = new Rectangle("orange", true, 4, 5);
        System.out.println(rectangle);

        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle(15, 18);
        rectangles[1] = new Rectangle(6, 12);
        rectangles[2] = new Rectangle(9, 11);

        System.out.println("Before sort");
        for (Rectangle r : rectangles) {
            System.out.println(r);
        }

        Comparator comparator = new RectangleComparator();
        Arrays.sort(rectangles, comparator);
        System.out.println("After sort");
        for (Rectangle r : rectangles) {
            System.out.println(r);
        }

        System.out.println();
        for (Rectangle r : rectangles) {
            int random = (int)(Math.random() * 100) + 1;
            r.resize(random);
        }
    }
}
