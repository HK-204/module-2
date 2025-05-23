import java.util.ArrayList;
import Product.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<>();
        list.add(new Books("Harry Potter", 80000, 20));
        list.add(new Clothes("T-Shirt", 120000, 27));
        list.add(new Books("Pride and Prejudice", 100000, 15));
        list.add(new Electronics("Honor Magic 7 Pro", 17000000, 30, 12));
        list.add(new Electronics("MSI GF63", 19500000, 28, 12));

        for (Product product : list) {
            if (product instanceof Books) {
                Books books = (Books) product;
                System.out.println(books.toString());
                System.out.println("Shipping fee is " + books.shippingFee());
                System.out.println("Final price is " + books.finalPrice());
                System.out.println("Price with shipping fee is " + books.originalPriceWithShipping());
                System.out.println("Discount percent is " + books.getDiscountPercent() + "%");
                System.out.println("Final price is " + books.finalPrice());
                System.out.println();
            } else if (product instanceof Clothes) {
                Clothes clothes = (Clothes) product;
                System.out.println(clothes.toString());
                System.out.println("Shipping fee is " + clothes.shippingFee());
                System.out.println("Final price is " + clothes.finalPrice());
                System.out.println("Price with shipping fee is " + clothes.originalPriceWithShipping());
                System.out.println("Discount percent is " + clothes.getDiscountPercent() + "%");
                System.out.println("Final price is " + clothes.finalPrice());
                System.out.println();
            } else if (product instanceof Electronics) {
                Electronics electronics = (Electronics) product;
                System.out.println(electronics.toString());
                System.out.println("Shipping fee is " + electronics.shippingFee());
                System.out.println("Final price is " + electronics.finalPrice());
                System.out.println("Price with shipping fee is " + electronics.originalPriceWithShipping());
                System.out.println("Number of month you need to pay your installment is " + electronics.getNumberOfMonths());
                System.out.println("Price you need to pay per month is " + electronics.getPricePerMonth());
                System.out.println("Final price is " + electronics.finalPrice());
                System.out.println();
            }
        }
    }
}