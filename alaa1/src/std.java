import java.util.*;
class std{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the name of std1: ");
    String n1=input.next();
    System.out.println("Enter the name of std2: ");
    String n2=input.next();
    System.out.println("Enter the name of std3: ");
    String n3=input.next();
    System.out.println("Enter the avg1");
    int a1 = input.nextInt();
     System.out.println("Enter the avg2");
    int a2 = input.nextInt();
     System.out.println("Enter the avg3");
    int a3 = input.nextInt();
    System.out.println("Enter num of std 1");
    int t1 = input.nextInt();
    System.out.println("Enter num of std 2");
    int t2 = input.nextInt();
    System.out.println("Enter num of std 3");
    int t3 = input.nextInt();
    stdd s1=new stdd(n1,a1,t1);
    stdd s2=new stdd(n2,a2,t2);
    stdd s3=new stdd(n3,a3,t3);
    s1.avarage(s2,s3);
    stdd s4=new stdd(n1,t1);
    
}

}