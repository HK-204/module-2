import java.util.Arrays;
import java.util.List;

public class ProxyProductAccess implements ProductAccess {
    private RealProductAccess realAccess = new RealProductAccess();
    private List<String> validAffiliates = Arrays.asList("aff001", "aff002");

    private String affiliateId;

    public ProxyProductAccess(String affiliateId) {
        this.affiliateId = affiliateId;
    }

    @Override
    public void viewProduct(String productId) {
        if (validAffiliates.contains(affiliateId)) {
            logAccess();
            realAccess.viewProduct(productId);
        } else {
            System.out.println("Access denied for affiliate: " + affiliateId);
        }
    }

    private void logAccess() {
        System.out.println("[LOG] Affiliate " + affiliateId + " accessed product.");
    }
}
