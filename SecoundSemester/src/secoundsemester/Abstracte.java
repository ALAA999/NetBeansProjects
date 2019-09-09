
public class Abstracte {

    public static void main(String[] args) {
        circle c = new circle(30);
        regtangel r = new regtangel(2, 3);
        traeangel t = new traeangel(5, 6);
        r.area();
        c.area();
        t.area();
    }
}

abstract class shape {

    public shape() {//we can make a constarctor on the abstraced methode but we can not make a normal methode! Also we can defined varabels
        //We can make an extend on the abstraced class and implements
    }

    abstract void area();
}

class circle extends shape {

    double kotor;

    public circle(double kotor) {
        this.kotor = kotor;
    }

    @Override
    public void area() {
        System.out.println("The area of the Circle is:" + Math.PI * kotor * kotor);
    }
}

class regtangel extends shape {

    double x, y;

    public regtangel(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void area() {
        System.out.println("The area of the Regtangel is: " + x * y);
    }
}

class traeangel extends shape {

    double x, y;

    public traeangel(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void area() {
        System.out.println("The area of the traeangel is:" + 0.5 * x * y);
    }
}
