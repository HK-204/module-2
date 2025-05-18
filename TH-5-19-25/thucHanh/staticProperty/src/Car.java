public class Car {
    private String name;
    private String brand;
    public static int numberOfCars;

    public Car(String name, String brand) {
        this.name = name;
        this.brand = brand;
        numberOfCars++;
    }

}
