public class CircleTest {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c);

        c = new Circle(3.5);
        System.out.println(c);

        c = new Circle("indigo", false, 3.5);
        System.out.println(c);
    }
}
