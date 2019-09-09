package DataBase;

import java.io.*;

class dfa implements Serializable {

    String initalState;
    String finalState;
    String data[][];

    public dfa() {
    }

    public dfa(String initalState, String finalState, String data[][]) {

        this.initalState = initalState;
        this.finalState = finalState;
        this.data = data;
    }

    dfa(String[][] data, String text, String text0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
