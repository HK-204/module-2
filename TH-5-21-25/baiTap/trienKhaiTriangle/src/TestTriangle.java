public class TestTriangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);

        Triangle triangle1 = new Triangle(3, 4, 5);
        System.out.println(triangle1);

        Triangle triangle2 = new Triangle(3, 4, 5, "Very Peri");
        System.out.println(triangle2);
    }
}
