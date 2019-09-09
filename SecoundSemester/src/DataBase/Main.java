package DataBase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

public class Main extends JFrame implements ActionListener {

    JButton neww, load, save, accept;
    JLabel initalState, finalState, input, output, function;
    JTextField iState, fState, input_text;
    JTextArea out;
    String data[][] = new String[30][3];
    String title[] = {"States", "Input Symbol", "Next State"};
    JTable table;
    JScrollPane pane;
    dfa dfa;
    String items[][];
    static File mainFile;
    ObjectOutputStream ou = null;
    JFileChooser filechoose;
    int rowsCount;

    public Main() {
        super("Deterministic Finite Automata ( DFA )");
        Container c = getContentPane();
        c.setLayout(null);

        // --------------------- JLabel ---------------------------
        initalState = new JLabel("Initial State : ");
        initalState.setBounds(455, 110, 80, 25);
        c.add(initalState);

        finalState = new JLabel("Final State : ");
        finalState.setBounds(455, 160, 80, 25);
        c.add(finalState);

        input = new JLabel("Input : ");
        input.setBounds(455, 230, 80, 25);
        c.add(input);

        output = new JLabel("Output : ");
        output.setBounds(300, 500, 80, 25);
        c.add(output);

        function = new JLabel("Transition Function");
        function.setBounds(160, 80, 180, 20);
        c.add(function);

        //------------------------- JButton -------------------------
        neww = new JButton("New");
        neww.setBounds(30, 30, 100, 30);
        c.add(neww);

        load = new JButton("Load");
        load.setBounds(125, 30, 100, 30);
        c.add(load);

        save = new JButton("Save");
        save.setBounds(220, 30, 100, 30);
        c.add(save);

        accept = new JButton("Accepted ?");
        accept.setBounds(450, 280, 230, 30);
        c.add(accept);

        //------------------------- JTextField -------------------------
        iState = new JTextField();
        iState.setBounds(540, 110, 100, 25);
        c.add(iState);

        fState = new JTextField();
        fState.setBounds(540, 160, 100, 25);
        c.add(fState);

        input_text = new JTextField();
        input_text.setBounds(540, 230, 150, 25);
        c.add(input_text);

        //------------------------- JTextArea -------------------------
        out = new JTextArea();
        out.setBounds(20, 530, 650, 100);
        out.setEditable(false);
        c.add(out);

        //------------------------- JTable -------------------------
        table = new JTable(data, title);
        for (int i = 0; i < 30; ++i) {
            for (int j = 0; j < 3; ++j) {
                table.setValueAt("", i, j);
            }
        }

        //------------------------- JScrollPane -------------------------
        pane = new JScrollPane(table);
        pane.setBounds(30, 110, 400, 350);
        c.add(pane);

        setSize(700, 700);
        setLocation(200, 10);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        neww.addActionListener(this);
        load.addActionListener(this);
        save.addActionListener(this);
        accept.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {

        //------------------------- New -------------------------
        if (e.getSource() == neww) {
            clearAll();
            out.setText(" ");
        }
        //------------------------- Load -------------------------
        if (e.getSource() == load) {
            try {
                BufferedReader br = new BufferedReader(new FileReader("file.txt"));

                StringBuilder sb = new StringBuilder();
                String line = br.readLine();

                while (line != null) {
                    sb.append(line);
                    sb.append(System.lineSeparator());
                    line = br.readLine();
                }
                String everything = sb.toString();
                String itemsSplited[] = everything.split(" ");
                DefaultTableModel model = new DefaultTableModel(title, 0);
                table.setModel(model);
                for (int count = 0; count <= itemsSplited.length; count++) {
                    model.addRow(new Object[]{itemsSplited[count], itemsSplited[count + 1], itemsSplited[count + 2]});
                    count = count + 2;
                }
                rowsCount = itemsSplited.length / 3;
                System.out.println("" + rowsCount);
            } catch (Exception ex) {
                System.out.println("" + ex.getMessage());
            }
        }
        //------------------------- Save -------------------------
        if (e.getSource() == save) {
            Writer writer = null;
            setDataFromTable();
            String textSaved = items[0][0] + " " + items[0][1] + " " + items[0][2]; // Get first
            for (int i = 1; i < rowsCount; i++) {
                textSaved = textSaved + " " + items[i][0] + " " + items[i][1] + " " + items[i][2];
            }
                            textSaved = textSaved + " " + " " + " ";
            FileOutputStream f = null;
            try {
                f = new FileOutputStream("file.txt");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            PrintStream p = new PrintStream(f);
            p.append(textSaved);
        }

//------------------------- Accept -------------------------
        if (e.getSource() == accept) {
            out.setText(" ");

            dfa = new dfa(iState.getText(), fState.getText(), data);
            isAccepted(dfa, input_text.getText());

        }

    }

    private void setDataFromTable() {
        rowsCount = 0;
        for (int i = 0; i < 30; i++) {
            try {
                if (!table.getValueAt(i, 0).equals("")) {
                    ++rowsCount; // In order to know the size of array which we will create
                }
            } catch (Exception e) {
                break;
            }
        }
        items = new String[rowsCount][3];
        for (int i = 0; i < 30; i++) {
            try {
                if (!((String) table.getValueAt(i, 0)).equals("")) {
                    items[i][0] = (String) table.getValueAt(i, 0);
                    items[i][1] = (String) table.getValueAt(i, 1);
                    items[i][2] = (String) table.getValueAt(i, 2);
                } else {
                    break;
                }

            } catch (Exception e) {
                break;
            }
        } // get data from table and lay it in the items array
    }

    public void isAccepted(dfa dfa, String dfaWord) {
        String Start = dfa.initalState;
        setDataFromTable();
        out.append(Start);
        for (int i = 0; i < dfaWord.length(); i++) {
            char Letter = dfaWord.charAt(i);
            Start = checkLetter(Start, Letter);
        }

        if (Start.equals(dfa.finalState)) {
            out.append("\n" + dfa.finalState + " is final       ---------->     " + dfaWord + "      is accepted");
        } else {
            out.append("\n" + dfa.finalState + " is final       ---------->     " + dfaWord + "     is not accepted");
        }
        data = items;
    }

    private String checkLetter(String CurrentState, char Letter) {
        for (int k = 0; (k < items.length); k++) {
            String state = items[k][0],
                    input = items[k][1],
                    nextState = items[k][2];
            if (state.equals(CurrentState) && Letter == input.charAt(0)) {
                out.append(" -- " + Letter + " -->" + nextState);
                return nextState;
            }
        }
        return null;
    }

    public void clearAll() {

        this.setVisible(false);
        new Main();
    }

    public static void main(String[] args) {
        new Main();
    }

}
