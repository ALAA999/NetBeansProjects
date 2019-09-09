
public class RST extends Relation {

    static boolean m[][] = new boolean[100][100];
    public void RSTs(int[] set) {

    }
    public RST(){
        super(0,0,m);
    }

    public boolean isReflexive() {
        boolean statment = true;
        for (int i = 0; i < getFo1(); i++) {
            if (m[i][i] == false) {
                statment = false;
            }
        }
        return statment;
    }

    public boolean isSemetric() {
        boolean statment = true;
        for (int i = 0; i < getFo1(); i++) {
            for (int j = 0; j < getFo2(); j++) {
                if (m[i][j] == true) {
                    if (m[j][i] == true) {

                    } else {
                        statment = false;
                        break;
                    }
                }
            }
        }
        return statment;
    }

    public boolean isTransitive() {
        boolean statment = true;
        for (int i = 0; i < getFo1(); i++) {
            for (int j = 0; j < getFo2(); j++) {
                for (int k = 0; k < getFo2(); k++) {
                    if (m[i][j] == true && m[j][k] == true) {
                        if (m[i][k] == true) {

                        } else {
                            statment = false;
                            break;
                        }
                    }
                }
            }
        }
        return statment;
    }

    public boolean isEquvelance() {
        boolean statment = true;
        if (isReflexive() && isSemetric() && isTransitive()) {

        } else {
            statment = false;
        }
        return statment;
    }

    public void printEQClasses() {
    }
}
