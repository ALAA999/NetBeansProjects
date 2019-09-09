
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class btn extends JFrame{
    Container c;
    JPanel jPanel = new JPanel();
    JButton b[] = new JButton[16];
    JTextField field = new JTextField(null);
    public btn(){
        super("Calculater");      
        jPanel.setLayout(new GridLayout(4,4));
        c = getContentPane();
        field.setSize(200, 100);
        jPanel.add(field);
        for (int i = 0; i < 16; i++) {
            b[i] = new JButton(""+(i+1));
            jPanel.add(b[i]);
        }
        field.setEditable(false);
        c.add(field,BorderLayout.NORTH);
        c.add(jPanel);
        setSize(200, 200);
        setVisible(true);
        setResizable(false);
    }
    public static void main(String[] args) {
        new btn();
    }
}