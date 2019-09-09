
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MidComTirm extends JFrame implements ActionListener {

    Container c;
    JLabel label1, label2, label3, label4;
    JTextField field1, field2, field3;
    JComboBox box;
    JButton button;
    DefaultComboBoxModel model = new DefaultComboBoxModel(new String[]{"+", "-", "/", "*"});

    public MidComTirm() {
        super("Test");
        c = getContentPane();
        label1 = new JLabel("Number1");
        label1.setBounds(20, 20, 100, 30);
        label2 = new JLabel("Number2");
        label2.setBounds(20, 80, 100, 30);
        label3 = new JLabel("Oporation");
        label3.setBounds(20, 140, 100, 30);
        label4 = new JLabel("Result");
        label4.setBounds(20, 200, 100, 30);
        field1 = new JTextField();
        field1.setBounds(140, 20, 100, 30);
        field2 = new JTextField();
        field2.setBounds(140, 80, 100, 30);
        box = new JComboBox(model);
        box.setBounds(140, 140, 100, 30);
        field3 = new JTextField();
        field3.setBounds(140, 200, 100, 30);
        button = new JButton("Compute");
        button.setBounds(80, 250, 100, 30);
        setBounds(300, 300, 280, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        c.add(label1);
        c.add(label2);
        c.add(label3);
        c.add(label4);
        c.add(field1);
        c.add(field2);
        c.add(field3);
        c.add(box);
        c.add(button);
        setVisible(true);
        button.addActionListener(this);
    }

    public static void main(String[] args) {
        new MidComTirm();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int num1 = Integer.parseInt(field1.getText());
            int num2 = Integer.parseInt(field2.getText());
            if (box.getSelectedItem().equals("+")) {
                field3.setText("" + (num1 + num2));
            }
            if (box.getSelectedItem().equals("-")) {
                field3.setText("" + (num1 - num2));
            }
            if (box.getSelectedItem().equals("*")) {
                field3.setText("" + (num1 * num2));
            }
            if (box.getSelectedItem().equals("/")) {
                field3.setText("" + (num1 / num2));
            }
        } catch (Exception ex) {
            System.out.println("Enter Numbers");
        }
    }
}
