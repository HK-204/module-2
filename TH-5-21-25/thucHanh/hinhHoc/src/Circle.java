public class Circle extends Shape implements Resizeable{
    private double radius = 1.0;

    public Circle(){}

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(String color, boolean filled ,double radius){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius=" + getRadius() + ", which is a subclass of " + super.toString();
    }

    @Override
    public void resize(double percent) {
        double oldArea = getArea();
        radius = radius * (1 + percent/100);
        double newArea = getArea();
        System.out.println("Percent: " + percent + "\nBefore resize: " + oldArea + "\nAfter resize: " + newArea);
    }
}
