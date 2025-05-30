public class Square extends Rectangle implements Colorable {
    public Square() {}

    public Square(double side){
        super(side, side);
    }
    public Square(String color, boolean filled, double side){
        super(color, filled, side, side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }

    @Override
    public void resize(double percent) {
        double oldArea = getArea();
        setSide(getSide() * (1 + percent/100));
        double newArea = getArea();
        System.out.println("Percent: " + percent + "\nBefore resize: " + oldArea + "\nAfter resize: " + newArea);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four side");
    }
}
