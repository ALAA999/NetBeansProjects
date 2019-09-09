import java.util.*;
class cars{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the first car:");
        String A1 = input.next();
        System.out.println("Enter the name of the secound car:");
        String A2 = input.next();
        System.out.println("Enter the name of the third car:");
        String A3 = input.next();
        System.out.println("Enter the color of the first car:");
        String B1 = input.next();
        System.out.println("Enter the colr of the secound car:");
        String B2 = input.next();
        System.out.println("Enter the color of the third car:");
        String B3 = input.next();
        System.out.println("Enter the speed of the first car:");
        int C1 = input.nextInt();
        System.out.println("Enter the speed of the secound car:");
        int C2 = input.nextInt();
        System.out.println("Enter the speed of the third car:");
        int C3 = input.nextInt();
        carrtr c1 = new carrtr(A1,B1,C1);
        carrtr c2 = new carrtr(A2,B2,C2);
        carrtr c3 = new carrtr(A3,B3,C3);
        c1.Name(c1,c2,c3);
        c1.Color(c1,c2,c3);
        System.out.println("The fastest speed is: "+c1.Speed(c2,c3));
    }
}