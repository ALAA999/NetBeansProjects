
import java.util.*;

public class power {

    public static void main(String[] args) {
       alos a = new alos();
        System.out.println(a.name);
        a.add("zebda");
        System.out.println(a.name);
        /* Scanner a = new Scanner(System.in);
        int g,b;
         System.out.println("Enter two numbers: ");
         g=a.nextInt();
         b=a.nextInt();
         System.out.println(power(g,b));
         }
         public strictfp static double power(int a,int b){
         int sum=1;
         for(int i=0;i<b;++i){
         sum*=a;
         }
         return sum;
        /*String t;
        int w = 0;
        System.out.println("Enter the name: ");
        t = a.next();
        for (int i = t.length()-1, s = 0; i >= 0; --i, ++s) {
            if (t.charAt(i) == t.charAt(s)) {
                w = w + 1;
            } else {
                w = 0;break;
            }
            
        }
        if (w == 0) {
            System.out.println("Not");
        } else {
            System.out.println("yes");
        }
    }
*/}
}
class alos{
    String name = "alaa";
    
    public void add(String s){
        name = s;
    }
}