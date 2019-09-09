
import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class calculateTowNumbers extends JFrame {
    Container c;
    JButton button1;
    JTextField field1,field2,field3;
    JLabel jLabel1,jLabel2,jLabel3;
    public calculateTowNumbers() {
        super("Calculate");
        c = getContentPane();
        c.setLayout(null);
        jLabel1 = new JLabel("First number");
        jLabel1.setBounds(20, 20, 100,30);
        jLabel2 = new JLabel("Secound number");
        jLabel2.setBounds(20, 70, 100,30);
        jLabel3 = new JLabel("Result");
        jLabel3.setBounds(20, 110, 100,30);
        field1 = new JTextField();
        field1.setBounds(140,20, 100, 30);
        field2 = new JTextField();
        field2.setBounds(140,70, 100, 30);
        field3 = new JTextField();
        field3.setBounds(140,110, 100, 30);
        field3.setEditable(false);
        button1 = new JButton("Calculate");  
        button1.setBounds(100,180,100,30);
        setBounds(200, 100, 300, 300);
        button1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               String f1 = field1.getText();
               int  num1 = Integer.parseInt(f1);
               String f2 = field2.getText();
               int  num2 = Integer.parseInt(f2);
               String m = String.valueOf(num1+num2);
               field3.setText(m);
               //field3.setText(""+(num1+num2));
            }
        });
        button1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("hello world");
                JOptionPane.showMessageDialog(calculateTowNumbers.this, "HI");
            }
        });
        c.add(button1);c.add(field1);c.add(field2);c.add(field3);c.add(jLabel1);c.add(jLabel2);c.add(jLabel3);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);          /*هادي بتطفي الفريمات كلها*/
        setVisible(true);
    }
    public static void main(String[] args) {
        new calculateTowNumbers();
    }
}
