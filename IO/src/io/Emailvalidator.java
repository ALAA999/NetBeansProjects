
import org.apache.commons.validator.routines.EmailValidator;

public class Emailvalidator {

    public static void main(String[] args) {

        EmailValidator e =  EmailValidator.getInstance();
        boolean s = e.isValid("alaa079996@gmail.com");
        System.out.println(s);

    }
}
