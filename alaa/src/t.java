
public class t {

    public static void main(String[] args) {
        child e = new child("Alaa", 10, 90);
        supere[] f = new supere[1];
        f[0] = e;
        view v = new view();
        v.view(e);
    }
}

class supere {

    String Name;
    int Num;

    supere(String name, int num) {
        this.Name = name;
        this.Num = num;
    }

    public String getname() {
        return Name+"k";
    }
}

class child extends supere {

    String avarage;

    public child(String name, int num, int avarage) {
        super(name, num);
    }

   /* @Override
    public String getname() {
        return Name;
    }*/
}

class view {

    public void view(supere s) {
        if (s instanceof child) {
            System.out.println("True");
            System.out.println(s.getname());
        }
    }
}
