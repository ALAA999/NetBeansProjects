
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class facte2 extends JPanel {

    static facteframe frame;
    JButton button1;
    JTextField field1, field2, field3;
    JLabel jLabel1;

    public facte2() {
        setLayout(null);
        jLabel1 = new JLabel("Number");
        jLabel1.setBounds(20, 20, 100, 30);
        field1 = new JTextField();
        field1.setBounds(140, 20, 100, 30);
        field2 = new JTextField();
        field2.setBounds(140, 60, 100, 30);
        button1 = new JButton("Fact!");
        button1.setBounds(100, 180, 100, 30);
        setBounds(200, 100, 300, 300);
        field2.setEditable(false);
        add(jLabel1);
        add(field1);
        add(field2);
        add(button1);
        setVisible(true);
        button1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String num = field1.getText();
                int n = Integer.parseInt(num);
                field2.setText("" + facte.fact(n));
            }
        });
    }
}
