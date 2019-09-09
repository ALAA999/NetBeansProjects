import java.util.*;
class TR{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String q[]= new String[6];
        String w[]= new String[6];
        int t[]= new int[6];
        int G[]= new int[6];
        for(int i=0;i<3;++i){
        System.out.println("Enter the first name of student 1: ");
        q[i] = input.next();
        System.out.println("Enter the last name of student 1: ");
        w[i] = input.next();
        System.out.println("Enter the number of of student 1: ");
        t[i] = input.nextInt();
        System.out.println("Enter the avarage of of student 1:");
        G[i] = input.nextInt();}
        STDDD I1 = new STDDD(q,w,t,G);
       /* I1.print(I1);*/
        I1.max(I1);
 
    
}}     