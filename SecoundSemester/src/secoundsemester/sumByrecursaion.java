
public class sumByrecursaion {

    public static void main(String[] args) {
        System.out.println(suma(3, 5));
        System.out.println(suma2(2, 5));
        System.out.println(suma3(2, 5));
    }

    public static int suma(int a, int b) {
        if (b == a) {
            return a;
        } else {
            return b + suma(a, (b - 1));
        }
    }
//This methode gives us the sum of mulitple numbers in a specifc range not using Recursion.
    public static int suma2(int a, int b) {
        int e;
        int sum = 0;
        for (e = a; e <= b; ++e) {
            sum = sum + (e * e);
        }
        return sum;
    }
//This methode gives us the sum of mulitple numbers in a specifc range using Recursion.
    public static int suma3(int a, int b) {
        if (a == b) {
            return a * a;
        } else {
            return (a * a) + suma3(a + 1, b);
        }
    }
}
