package homeworkno1;

/**
 * Created by ablazejewska on 10.09.16.
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork4 {

    public static void main(String[] args) {
        String text    = "ala ma kota i  kot ma ale aLe KoTa nie widziano";

        String patternString1 = "ala";
        String patternString2 = "kot";

        Pattern pattern1 = Pattern.compile(patternString1, Pattern.CASE_INSENSITIVE);
        Pattern pattern2 = Pattern.compile(patternString2, Pattern.CASE_INSENSITIVE);
        Matcher matcher1 = pattern1.matcher(text);
        Matcher matcher2 = pattern2.matcher(text);

        int count = 0;
        while(matcher1.find()) {
            count++;
            System.out.println(patternString1 + "- found: " + count + " : " + matcher1.start() + " - " + matcher1.end());
        }

        count = 0;
        while(matcher2.find()) {
            count++;
            System.out.println(patternString2 + "found: " + count + " : " + matcher2.start() + " - " + matcher2.end());
        }

    }

}