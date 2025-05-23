package Product;

import Interface.Discount;

public class Clothes extends Product implements Discount {
    int discountPercent;

    public Clothes(){}

    public Clothes(String name, double originalPrice) {
        super(name, originalPrice);
    }

    public Clothes(String name, double originalPrice, int discountPercent) {
        super(name, originalPrice);
        this.discountPercent = discountPercent;
    }

    public double shippingFee() {
        return 20000;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public double priceAfterDiscount() {
        return getOriginalPrice() * (getDiscountPercent()/100);
    }

    public double originalPriceWithShipping() {
        return getOriginalPrice() + shippingFee();
    }

    @Override
    public double finalPrice() {
        return priceAfterDiscount() + shippingFee();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
