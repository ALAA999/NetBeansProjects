
import java.util.*;

public class tringbuilder {

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("Enter the equtation: ");
        String e = i.nextLine();
        String [] array= e.split(" ");
        int a = Integer.parseInt(array[0]);
        int b = Integer.parseInt(array[2]);
        int sum=0;
        switch(array[1].charAt(0)){
            case '+':sum = a+b;break;
            case '-':sum = a-b;break;
            case '*':sum = a*b;break;
            case '/':sum = a/b;break;
        }
         System.out.println(a+" "+array[1]+" "+b+" ="+" "+sum);   
    }
}
