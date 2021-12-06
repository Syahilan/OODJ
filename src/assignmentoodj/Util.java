/*
 * This is proprietary code written by Syahilan A/L Selvarajoo [TP062031] & Darshini Dakshyani Beerachee [TP060519]
 * APD2F2109CS(DA) || CT038-3-2-OODJ-LAB-18
 */
package assignmentoodj;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
    // Converts string with date content to Date object

    public static Date str2Date(String str, String format) {
        try {
            Date d = new SimpleDateFormat(format).parse(str);
            return d;
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
