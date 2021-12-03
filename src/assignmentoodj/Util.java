/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentoodj;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Darshini
 */
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
