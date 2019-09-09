
public class Relation {

    protected int fo1, fo2;
    private int[] domain = new int[100];
    private int[] codomain = new int[100];
    private boolean[][] m = new boolean[100][100];
    private boolean[] ddef;
    private boolean[] range;

    public boolean[][] getM() {
        return m;
    }

    public int getFo1() {
        return fo1;
    }

    public int getFo2() {
        return fo2;
    }

    public Relation(int fo1, int fo2, boolean m[][]) {
        this.fo1 = fo1;
        this.fo2 = fo2;
        this.m = m;
    }

    public void Relation(int[] domains, int[] codomains) {//This fucking methode can not be a constractor because when you call it it makes a new elements up there
        this.domain = domains;
        this.codomain = codomains;
        /**/
    }

    public void setDomain(int[] domains) {
        int e = 0;
        for (int i = fo1; i < fo1 + domains.length; i++) {
            domain[i] = domains[e];
            ++e;
        }
        fo1 = fo1 + domains.length;
    }

    public void setcoDomain(int[] codomains) {
        int e = 0;
        for (int i = fo2; i < fo2 + codomains.length; i++) {
            codomain[i] = codomains[e];
            ++e;
        }
        fo2 = fo2 + codomains.length;
    }

    public void setDomain(int a, int b) {
        for (int i = a; i <= b; i++) {
            domain[fo1] = i;
            ++fo1;
        }
    }

    public void setcoDomain(int b, int a) {
        for (int i = b; i <= a; i++) {
            codomain[fo2] = i;
            ++fo2;
        }
    }

    public void domainOfDef() {

    }

    public void range() {

    }

    private int getPos(int a, int s[]) {
        int n = -1;
        for (int i = 0; i < s.length; ++i) {
            if (a == s[i]) {
                n = i + 1;
            }
        }
        return n;
    }

    public boolean addElement(int a, int b) {
        for (int i = 0; i < fo1; i++) {
            if (domain[i] == a) {
                a = i;
                break;
            }
        }
        for (int i = 0; i < fo2; i++) {
            if (codomain[i] == b) {
                b = i;
                break;
            }
        }
        m[b][a] = true;
        return true;
    }

    public String toString() {
        return null;
    }

    public String printm() {
        String statments = "";
        for (int i = 0; i < fo2; i++) {
            for (int j = 0; j < fo1; j++) {
                if (m[i][j] == true) {
                    statments = statments + "true     ";
                } else {
                    statments = statments + "false   ";
                }
            }
            statments = statments + "\n";
        }
        return statments;
    }

    public int[] getDomain() {
        return domain;
    }

    public int[] getCodomain() {
        return codomain;
    }
}
