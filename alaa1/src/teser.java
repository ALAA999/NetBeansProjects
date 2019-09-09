import java.util.*;
class tester{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ok = true;
        while(n != 0){
            int t= n%10;
            if(t%2==1){
                ok = false;
                break;}
            n = n/10;}
        if(ok)
            System.out.println("yes");
        else
            System.out.println("no");
        }
    }
