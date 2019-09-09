
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
public class tttttttt extends JFrame implements MouseListener {
    Container c;
    JLabel[] labels = new JLabel[5];
    JPanel p;
    static int background;
    Timer time;
    double secounds = 00;
    double minutes = 00;
    double hours = 00;
    public tttttttt() {
        c = getContentPane();
        p = new JPanel();
        setBounds(440, 320, 480, 160);
        labels[1] = new JLabel("00 : 00 : 00");
        p.add(labels[1]);
        labels[0] = new JLabel();
        labels[0].setIcon(new ImageIcon(getClass().getResource("1.png")));
        p.add(labels[0]);
        c.add(p);
        setLayout(new GridLayout(1, 4));
        setTitle("خلفية البطاقة");
        setVisible(true);
        setResizable(false);
        labels[0].addMouseListener(this);
            thred();
            System.out.println("sadasd");
    }
    public void thred(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(tttttttt.class.getName()).log(Level.SEVERE, null, ex);
        }
                secounds = secounds + 0.1; 
        labels[1].setText(""+hours+" : "+minutes+" : "+secounds);
        if(secounds == 5 ){
            secounds = 0;
            ++minutes;
        }
            thred();
    }
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "sadas","Title",JOptionPane.WARNING_MESSAGE,null);
        JOptionPane.showMessageDialog(null,"You are reading something","FYI",JOptionPane.INFORMATION_MESSAGE,null);
        new tttttttt();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("asfaf");
        if (e.getSource() == labels[0]) {
            background = 1;
            System.out.println("dddd");
        } 
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
