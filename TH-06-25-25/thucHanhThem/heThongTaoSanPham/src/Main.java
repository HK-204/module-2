import config.AppConfig;
import factory.*;
import product.*;

public class Main {
    public static void main(String[] args) {
        Product product1 = ProductFactory.createProduct("hat");
        Product product2 = ProductFactory.createProduct("shoe");
        Product product3 = ProductFactory.createProduct("shirt");

        product1.displayInfo();
        product2.displayInfo();
        product3.displayInfo();
    }
}