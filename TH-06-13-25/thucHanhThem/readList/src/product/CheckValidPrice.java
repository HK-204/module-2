package product;

public class CheckValidPrice {
    public static boolean checkPrice(double price) {
        if (price < 0) {
            System.out.println("Invalid price");
            return false;
        }
        return true;
    }
}
