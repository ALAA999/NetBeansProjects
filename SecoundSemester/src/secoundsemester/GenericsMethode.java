
public class GenericsMethode {
    public static void main(String[] args) {
        Integer x [] = {1,2,3,4,5};
        Integer y [];
        y = print(x);
        String a[] = {"a","b","c"};
        print(a);
        System.out.println(y[2]);
    }
    public static <T> T[] print(T array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        return array;
    }
}
