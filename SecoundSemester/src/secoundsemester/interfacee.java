
class interfacee implements x, y, z {//Or class interface implements xx

    public void f1() {
        System.out.println("f1 method");
    }

    public void f2() {
        System.out.println("f2 method");
    }

    public void f3() {
        System.out.println("f3 method");
    }
}
 

interface xx extends x,y,z{
    
}

interface x {

    int A = 5;

    void f1();                  /*public static final will be declered by defult*/

}

interface y {

    int A = 6;

    void f2();                  /*public static final will be declered by defult*/

}

interface z {

    int A = 7;

    void f3();                  /*public static final will be declered by defult*/

}

class main {

    public static void main(String[] args) {
        interfacee c = new interfacee();
        c.f1();
        x c2 = new interfacee();
        c2.f1();/*only f1 is avaliable*/
//take a look at the other examle below*/

    }
}

class A implements x {

    @Override
    public void f1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

class interfacees implements x {

    @Override
    public void f1() {
        System.out.println("f1 method");
    }
}

class mains {

    public static void main(String[] args) {
        interfacee c = new interfacee();
        c.f1();
        x c2 = new interfacee();
        c2.f1();/*only f1 is avaliable*/
        /*take a look at the other examle below*/

        y c3 = new interfacee();
        c3.f2();
    }
}
