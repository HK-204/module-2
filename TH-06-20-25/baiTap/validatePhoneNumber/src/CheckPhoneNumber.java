import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckPhoneNumber {
    private static final String PHONENUMBER_REGEX = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";

    public CheckPhoneNumber() {}

    public boolean validate(String phoneNumber) {
        Pattern pattern = Pattern.compile(PHONENUMBER_REGEX);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
}
