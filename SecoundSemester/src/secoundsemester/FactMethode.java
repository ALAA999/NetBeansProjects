
import java.util.Scanner;

class facte{
    public static void main(String[] args) {
        //System.out.println("Enter hte number to be facted: ");
        Scanner  s = new Scanner(System.in);
       // long i = s.nextInt();
        //System.out.println(fact(i));
        System.out.println(sumSequance(5, 10));
}
    static long fact(long i){
        if(i == 0 || i == 1)
        return 1;
        else 
            return i*fact(i-1);
    }
   static int sumSequance(int m,int n){
       int middle;
       if(m == n ){
           return m*m;
       }
       else{
           middle = (m+n)/2;
           return sumSequance(m, middle)+sumSequance(middle+1,n);
       }
    }
}