import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckClassName {
    private static final String CLASSNAME_REGEX = "^[ACP]\\d{4}[GHIK]$";

    public CheckClassName() {}

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(CLASSNAME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
