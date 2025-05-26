public class SquareTest {
    public static void main(String[] args) {
        Square s = new Square();
        System.out.println(s);

        s = new Square(5);
        System.out.println(s);

        s = new Square("blue", true, 5);
        System.out.println(s);

        Square[] squares = new Square[3];
        squares[0] = new Square(8);
        squares[1] = new Square(7);
        squares[2] = new Square(15);

        System.out.println();
        for (Square square : squares) {
            int random = (int)(Math.random() * 100) + 1;
            square.resize(random);
        }
    }
}
