public class AppConfig {
    private static AppConfig instance;

    private String storeName;
    private String language;
    private String currency;
    private double defaultTaxRate;

    private AppConfig() {
        this.storeName = "shop ABC";
        this.language = "vi";
        this.currency = "VND";
        this.defaultTaxRate = 0.05;
    }

    public static synchronized AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }

    public String getStoreName() {
        return storeName;
    }

    public String getLanguage() {
        return language;
    }

    public String getCurrency() {
        return currency;
    }

    public double getDefaultTaxRate() {
        return defaultTaxRate;
    }
}
