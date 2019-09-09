/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InternetGame;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.logging.Level;

/**
 *
 * @author Alaa
 */
public class NewClass {

    public static void main(String[] args) {
        String[] strings = "١٢.٧٦٥٣٨,١٢.٧٦٥٣٨".split(",\\s*");
        NumberFormat fmt = NumberFormat.getInstance(Locale.forLanguageTag("ar"));
        try {
            StringBuilder sb = new StringBuilder();
            for (String s : strings) {
                Number n = fmt.parse(s);
                if (sb.length() != 0) {
                    sb.append(",");
                }
                sb.append(n);
            }
            System.out.println(sb.toString());
        } catch (ParseException ex) {
        }
    }
}
