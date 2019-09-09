import java.util.*;
class T{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
   cont I = new cont(18,"Alaa");
        System.out.println(I.getage());
        System.out.println(I.getName());
        System.out.println("Enter new age: ");
        int x = input.nextInt();
        I.setage(x);
        System.out.println("Enter new name:");
        String x2 = input.next();
        I.setName(x2);
        System.out.println(I.getage());
        System.out.println(I.getName());
}
}