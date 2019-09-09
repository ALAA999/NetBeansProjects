import java.util.Scanner;
import java.util.regex.Pattern;
class Stringbuilder {
    public static void main(String[] args) {
       /* StringBuilder f = new StringBuilder("alaa");
        f.append("hamood");
        String s = "alaahamood";
        System.out.println(Pattern.matches(s, f));*/
        Scanner s = new Scanner(System.in);
        /*System.out.println("Enter URL: ");
        String c = s.next();
        if(Pattern.matches("(www.|WWW.)([\\w]+)(.com|.COM)",c))
            System.out.println("Correct URL!");
        else 
            System.out.println("Uncorrect URL!");*/
        System.out.println("Enter image!");
        String s1 = s.nextLine();
        if(imagechexk(s1))
            System.out.println("Right");
        else 
            System.out.println("False");
    }
   /* public static boolean imagechexk(String s){
        return Pattern.matches("([\\w|\\d|\\s]+)(\\.)(jpj|png|gif|bmp|html)",s);  /*v.important*/
   /* }*/
    public static boolean imagechexk(String s){
        return Pattern.matches("([\\d]{4}(-)[\\d]{4}(-)[\\d]{4}(-)[\\d]{4})",s);
}
}
