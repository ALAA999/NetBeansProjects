
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Date {

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("Enter date: ");
        String date = i.nextLine();
        /* String real = "([a-z]{1,10})(/)([0-3][0-9]{1,2})(/)([0-2][1-9]{1,2})(/)([0-9]{4})";*/
        //String real = "^([0-9]{3})-([0-9]{3})-([0-9]{4})";          /*for phones    111-111-111*/
        String real = "^([0-9]{1,2})/([0-9]{1,2})/([0-9]{4})";
        Pattern p = Pattern.compile(real);
        Matcher m = p.matcher(date);
        if (m.find()) {
            System.out.println("Date is legal! ");
        } else {
            System.out.println("Date is not legal!");
        }
    }
}

class asda {

    public static void main(String[] args) {
        String pattern = "MM/dd/yyyy";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        try {
            java.util.Date date = format.parse("ssss12/31/2006");
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
