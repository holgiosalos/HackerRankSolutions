import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    private static final String AM = "AM";
    private static final String RESULT_FORMAT = "%02d:%s:%s";

    private static int convertHour(final int hour, final String amPM) {
        int result = hour;
        if (AM.equalsIgnoreCase(amPM) && (hour == 12)) {
            result = 0;
        }
        else if (!AM.equalsIgnoreCase(amPM) && !(hour == 12)) {
            result = hour + 12;
        }
        return result;
    }

    private static String timeConversion(String s) {
        // (\d{1,2}):(\d{1,2}):(\d{1,2})(AM|PM)
        Pattern pattern = Pattern.compile("(\\d{2}):(\\d{2}):(\\d{2})(AM|PM)");
        Matcher matcher = pattern.matcher(s);

        String result;
        if (matcher.matches()) {
            int hours = convertHour(Integer.parseInt(matcher.group(1)), matcher.group(4));
            String minutes = matcher.group(2);
            String seconds = matcher.group(3);

            result = String.format(RESULT_FORMAT, hours, minutes, seconds);
        }
        else {
            result = "Invalid Input";
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
