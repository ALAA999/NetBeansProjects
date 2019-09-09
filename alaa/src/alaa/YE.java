import java.util.*;
class TR{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first name of student 1: ");
        String q = input.next();
        System.out.println("Enter the last name of student 1: ");
         String w = input.next();
         System.out.println("Enter the number of of student 1: ");
         int  t = input.nextInt();
         System.out.println("Enter the avarage of of student 1:");
         int  y = input.nextInt();
          System.out.println("Enter the first name of student 2: ");
        String Q = input.next();
        System.out.println("Enter the last name of student 2: ");
         String W = input.next();
         System.out.println("Enter the number of student 2: ");
         int  T = input.nextInt();
         System.out.println("Enter the avarage of student 2:");
         int  Y = input.nextInt();
          System.out.println("Enter the first name of student 3: ");
        String U = input.next();
        System.out.println("Enter the last name of student 3: ");
         String P = input.next();
         System.out.println("Enter the number of student 3: ");
         int  O = input.nextInt();
         System.out.println("Enter the avarage of student 3:");
         int  G = input.nextInt();
         CLASSQUIZ I1 = new CLASSQUIZ(q,w,t,y);
         CLASSQUIZ I2 = new CLASSQUIZ(Q,W,T,Y);
         CLASSQUIZ I3 = new CLASSQUIZ(U,U,O,G);
         I1.print(I1,I2,I3);
         I1.max( I1,I2,I3);
    }
}}