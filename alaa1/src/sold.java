import java.util.*;
class bik{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name1");
        String f1 = input.next();
        System.out.println("Enter name2");
        String f2 = input.next();
        System.out.println("Enter the speed of 1");
        int s1 = input.nextInt();
        System.out.println("Enter the speed of 2");
        int s2 = input.nextInt();
        System.out.println("Enter year of 1");
        int y1 = input.nextInt();
        System.out.println("Enter year of 2");
        int y2 = input.nextInt();
        sold2 b1 = new sold2(f1,s1,y1);
        sold2 b2 = new sold2(f2,s2,y2);
        b1.Speed(b2);
        b1.print(b1);
        b2.print(b2);
        
    }
}