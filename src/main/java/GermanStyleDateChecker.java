import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GermanStyleDateChecker {
    public static Matcher getMatcher(String dateString) {
        return Pattern
                .compile("^(31|[1-2][0-9]|0?[1-9])[. -](1[0-2]|0?[1-9])[. -]((19|[2-9][0-9])[0-9]{2,}|[0-9][1-9])$")
                .matcher(dateString);
    }
}
