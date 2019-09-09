import java.util.*;
class tanke{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of tank1: ");
        String o1 = input.next();
        System.out.println("Enter the name of tank2: ");
        String o2 = input.next();
        System.out.println("Enter the name of tank3: ");
        String o3 = input.next();
        System.out.println("Enter the rang of tank1: ");
        int l1 = input.nextInt();
        System.out.println("Enter the rang of tank2: ");
        int l2 = input.nextInt();
        System.out.println("Enter the rang of tank3: ");
        int l3 = input.nextInt();
        System.out.println("Enter the whieght of tank1: ");
        int z1 = input.nextInt();
        System.out.println("Enter the whieght of tank2: ");
        int z2 = input.nextInt();
        System.out.println("Enter the whieght of tank3: ");
        int z3 = input.nextInt();
        tank t1 = new tank(o1,l1,z1);
        tank t2 = new tank(o2,l2,z2);
        tank t3 = new tank(o3,l3,z3);
        t1.Name(t1,t2,t3);
        t1.Rang(t1,t2,t3);
    }
}