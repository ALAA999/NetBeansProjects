
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class tabbedpanee extends JFrame {// The panles on the tabbedpane should be extending from JPanel

    JTabbedPane jtp;
    Container c;

    public tabbedpanee() {
        super("TabbedPane");
        c = getContentPane();
      //  setLayout(null);   لا يجوز تضع لي اوت فيها    null  
        setLayout(new GridLayout());
        jtp = new JTabbedPane();
        jtp.add("clculater", new Addition());
        jtp.add("Fact", new facte2());
        setBounds(300, 300, 300, 300);
        //setSize(400, 400);     أو هاي الطريقة للحجم بتنفع بردو
        c.add(jtp);
        setVisible(true);
    }

    public static void main(String[] args) {
        new tabbedpanee();
    }
}
