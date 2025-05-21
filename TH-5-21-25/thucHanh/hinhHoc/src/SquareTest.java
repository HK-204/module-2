public class SquareTest {
    public static void main(String[] args) {
        Square s = new Square();
        System.out.println(s);

        s = new Square(5);
        System.out.println(s);

        s = new Square("blue", true, 5);
        System.out.println(s);
    }
}
