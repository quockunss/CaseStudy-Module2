import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneExample {

    private static final String PHONE_REGEX =  "\\d{10}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}";

    public PhoneExample(){
    }

    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
