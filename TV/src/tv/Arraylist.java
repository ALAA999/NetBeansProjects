import java.util.*;

class Tries {

    void print() {
        System.out.println("Alaa aldean");
    }
}

class beginmain extends Tries {

    public static void main(String[] args) {
        String a;
        int y;
        Scanner input = new Scanner(System.in);
        beginmain t = new beginmain();
        t.print();
        ArrayList A = new ArrayList();
        for (int i = 0; i < 3; ++i) {
            System.out.println("Enter name num" + (i + 1));
            a = input.next();
            System.out.println("Enter number " + (i + 1));
            y = input.nextInt();
            A.add(a);
            A.add(y);
        }
        /*  System.out.println(A.contains("ali"));
         System.out.println(A.get(3));
         System.out.println(A.isEmpty());
         System.out.println(A.remove("alaa"));
         System.out.println(A.size());
         A.set(4, "allosh");
         System.out.println(A);*/

        System.out.println(ArrayLisst(A));
        if (ArrayLisst(A) instanceof String) {
            System.out.println(ArrayLisst(A) + ": is Strign type");
        } else {
            System.out.println(ArrayLisst(A) + ": isInteger type");
        }
       long x = 0;
        System.out.println(x);
    } 

    public static String ArrayLisst(ArrayList A) {
        return (String) A.get(0);
            
    }
}
