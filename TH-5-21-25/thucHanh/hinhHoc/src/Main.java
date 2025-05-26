public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square();
        shapes[3] = new Circle();
        shapes[4] = new Rectangle();

        for (Shape shape : shapes) {
            System.out.println("This is one shape");
            if (shape instanceof Square) {
                ((Square) shape).howToColor();
            }
            System.out.println("----------");
        }
    }
}