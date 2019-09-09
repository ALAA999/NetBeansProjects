import java.util.*;
class Switch{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1.Add\t2.tarh\t3.dev\t4.mult");
        int x = input.nextInt();
        System.out.println("Eter two num: ");
        double z = input.nextDouble();
        double r = input.nextDouble();
        switch(x){
            case 1:Add(z,r);break;
            case 2: tarh(z,r);break;
            case 3: dev(z,r);break;
            case 4: mult(z,r);break;
        }
    }
    public static void Add(double a,double q){
        double result = a+q;
        System.out.println("The sum is: "+result);
    }
     public static void tarh(double a,double q){
        double result = a-q;
        System.out.println("The tarh is: "+result);
    }
      public static void dev(double a,double q){
        double result = a/q;
        System.out.println("The dev is: "+result);
    }
       public static void mult(double a,double q){
        double result = a*q;
        System.out.println("The multe is: "+result);
    }
}