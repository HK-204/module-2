public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(4, 5);
        System.out.println(rectangle);

        rectangle = new Rectangle("orange", true, 4, 5);
        System.out.println(rectangle);
    }
}
