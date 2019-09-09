package test;

public class Test {

//    static Integer a = 5;
    static Box<Integer> a = new Box(5);
    static Double b = 5.5;
    static String c = "5.9";
    static Number d = 5;

    public static void main(String[] args) {
        calculate(a);
        calculate(b);
//        calculate(c);
        calculate(d);
    }

    public static void calculate(Box<? extends Number> t) {
        
    }
}
class Box<T> {
    T t;
    Box(T t) {
        this.t = t;
    }
}
