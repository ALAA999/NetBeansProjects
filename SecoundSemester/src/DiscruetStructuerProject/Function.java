
public class Function extends Relation {

    boolean injectiveFlag;
    static boolean m[][] = new boolean[100][100];

    public Function() {
        super(0, 0, m);
    }

    /*public Function(int[] domain, int[] codomain) {

     }*/
    public int getImage(int x) {
        int n = -1;
        for (int i = 0; i < getFo2(); ++i) {
            if (m[i][x]) {
                n = i;
                break;
            }
        }
        return n;
    }

    public int getPreImage(int y) {
        int n = -1;
        for (int i = 0; i < getFo1(); ++i) {
            if (m[y][i]) {
                n = i;
                break;
            }
        }
        return n;
    }

    public boolean isLeftTotal() {
        return true;
    }

    public boolean isRightTotal() {
        return true;
    }

    public boolean isInjective() {
        boolean statment = true;
        for (int i = 0; i < getFo1(); i++) {
            int k = 0;
            for (int j = 0; j < getFo2(); j++) {
                if (m[j][i] == true) {
                    k += 1;
                }
            }
            if (k != 1) {
                statment = false;
                break;
            }
        }
        return statment;
    }

    public boolean isSerjective() {
        boolean statment = true;

        for (int i = 0; i < getFo2(); i++) {
            int k = 0;
            for (int j = 0; j < getFo1(); j++) {
                if (m[i][j] == true) {
                    k += 1;
                }
            }
            if (k != 1) {
                statment = false;
                break;
            }
        }
        return statment;
    }

    public boolean isBijective() {
        if (isSerjective() && isInjective()) {
            return true;
        } else {
            return false;
        }
    }

    public Function composite(Function g) {
        return g;
    }
}
