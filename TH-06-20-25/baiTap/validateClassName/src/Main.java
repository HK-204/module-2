public class Main {
    private static CheckClassName check;

    public static final String[] classNames = new String[] {"C0223G", "A0323K", "M0318G", "P0323A"};

    public static void main(String[] args) {
        check = new CheckClassName();
        for (String name : classNames) {
            boolean isValid = check.validate(name);
            System.out.println(name + " is valid: " + isValid);
        }
    }
}