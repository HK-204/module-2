public class Circle {
    private double radius;
    private String color = "red";

    public Circle() {}
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
//    protected, default

    public double getArea() {
        return Math.PI * radius * radius;
    }
//    protected, default

}
