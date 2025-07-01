public class RealProductAccess implements ProductAccess {
    @Override
    public void viewProduct(String productId) {
        System.out.println("Affiliate viewing product: " + productId);
    }
}
