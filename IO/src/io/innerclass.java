
public class innerclass {

    static String name = "Alaa";

    static class inside {

       static  void print() {
            System.out.println(name);
        }
    }
}

class MAIN {

    public static void main(String[] args) {
        innerclass.inside i = new innerclass.inside();
        i.print();
    }
}
