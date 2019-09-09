
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

class JMenueItems extends JFrame {

    Container c;
    JMenuBar bar;
    JMenu m1, m2, m3;
    JMenuItem item1, item2, item3, item4, item5;
    JButton b;

    public JMenueItems() {
        super("Menu");
        //c = getContentPane();
        add(bar = new JMenuBar(), BorderLayout.NORTH);
        /*bar.add(m1 = new JMenu("Menu 1"));
        m1.add(item1 = new JMenuItem("Fact"));
        m1.add(item2 = new JMenuItem("Add"));
        bar.add(m2 = new JMenu("Menu 2"));
        m2.add(m3 = new JMenu("tasks"));
        m3.add(item4 = new JMenuItem("Task 1"));
        m3.add(item5 = new JMenuItem("Task 2"));
        item4.setEnabled(false);*/
        setVisible(true);
        b = new JButton("btn");
        b.setBounds(20, 30, 30, 44);
        c.add(b);
        setLayout(null);
        setBounds(150, 200, 200, 200);
        addWindowListener(new WindowAdapter() { //you can do Action when we click on the closing window!

            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("ssas");
            }
            
        });
        item1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                facteframe.instance();
            }
        });
        item2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new calculateTowNumbers();
            }
        });
    }
    public static void main(String[] args) {
        new JMenueItems();
    }
}
