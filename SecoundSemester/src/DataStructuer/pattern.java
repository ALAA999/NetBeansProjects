/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructuer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Alaa
 */
public class pattern {
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

public static boolean validate(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(emailStr);
        return matcher.find();
}
    public static void main(String[] args) {
        System.out.println(validate("alaa@hotmail.com"));
        String emails = "alaa201117@hotmail.comahmed1990@gmail.comali123@outlook.com";
        String[] spilted = emails.split(".com");
        for (int i = 0; i < spilted.length; i++) {
            spilted[i] = spilted[i] + ".com";
            System.out.println(spilted[i]);
        }
    }
}
