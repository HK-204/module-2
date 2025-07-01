public class VipCustomer implements Customer{
    public double getDiscount(double amount) {
        return amount * 0.9;
    }
}
