package Product;

import Interface.Installment;

public class Electronics extends Product implements Installment {
    int installmentPercent;
    int numberOfMonths;

    public Electronics(){}

    public Electronics(String name, int originalPrice){
        super(name, originalPrice);
    }

    public Electronics(String name, int originalPrice, int installmentPercent, int numberOfMonths){
        super(name, originalPrice);
        this.installmentPercent = installmentPercent;
        this.numberOfMonths = numberOfMonths;
    }

    public double shippingFee() {
        return 100000;
    }

    public double getInstallmentPercentage() {
        return installmentPercent;
    }
    public void setInstallmentPercentage(int installmentPercent) {
        this.installmentPercent = installmentPercent;
    }

    public int getNumberOfMonths() {
        return numberOfMonths;
    }
    public void setNumberOfMonths(int numberOfMonths) {
        this.numberOfMonths = numberOfMonths;
    }

    public double originalPriceWithShipping() {
        return getOriginalPrice() + shippingFee();
    }

    @Override
    public double finalPrice() {
        return getOriginalPrice() + (getOriginalPrice() * (getInstallmentPercentage()/100));
    }

    public double getPricePerMonth() {
        return finalPrice() / getNumberOfMonths();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
