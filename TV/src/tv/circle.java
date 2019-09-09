
abstract class shakel {

    String name;

    shakel(String name) {
        this.name = name;
    }

    public abstract void print();

}

class circle extends shakel {

    circle() {
        super("Circle");
    }

    public void print() {
        System.out.println("Circle");
    }
}

class rect extends shakel {

    rect() {
        super("rectangle");
    }

    public void print() {
        System.out.println("rectangle");
    }
}

class MMani {

    public static void main(String[] args) {
        rect s = new rect();
        circle c = new circle();
        s.print();
        c.print();
    }
}
