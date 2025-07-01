public class Main {
    private static final String[] phoneNumbers = new String[] {"(84)-(0978489648)", "(a8)-(22222222)", "(84)-(22b22222)", "(84)-(9978489648)"};

    public static void main(String[] args) {
        CheckPhoneNumber checkPhoneNumber = new CheckPhoneNumber();
        for (String phoneNumber : phoneNumbers) {
            boolean isValid = checkPhoneNumber.validate(phoneNumber);
            System.out.println(phoneNumber + " is valid: " + isValid);
        }
    }
}