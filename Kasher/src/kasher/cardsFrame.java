
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class cardsFrame extends JFrame implements MouseListener {

    Container c;
    JLabel label[] = new JLabel[60];
    ImageIcon icon[] = new ImageIcon[60];
    // JButton show, hide;
    JButton startbtn, shuffle, sort, hint;
    ArrayList<cards> a = new ArrayList();
    int shown = 0;
    String color, color2;
    int rank, rank2;
    ImageIcon v, v1;
    JLabel b1, b2,Scoore;
    Timer time;
    int num = 0;
    JPanel panel, panel2;

    public cardsFrame() {
        c = getContentPane();
        panel = new JPanel();
        panel.setBounds(0, 0, 700, 650);
        panel.setLayout(new GridLayout(6,13));       
        panel2 = new JPanel();
        panel2.setBounds(700, 0, 300, 650);
        panel2.setLayout(null);
        Scoore = new JLabel("النتيجة");
        Scoore.setBounds(770, 20, 160, 100);
        Scoore.setFont(new java.awt.Font("Arial", 0, 24));
        startbtn = new JButton("Start");
        startbtn.setBounds(720, 180, 160, 50);
        shuffle = new JButton("Shuffle");
        shuffle.setBounds(720, 260, 160, 50);
        sort = new JButton("Sort");
        sort.setBounds(720, 340, 160, 50);
        hint = new JButton("Hint");
        hint.setBounds(720, 420,160, 50);
        setBounds(150, 20, 900, 640);
        panel2.add(startbtn);
        panel2.add(shuffle);
        panel2.add(sort);
        panel2.add(hint);
        panel2.add(Scoore);
        /*show = new JButton("Show");
         c.add(show);
         hide = new JButton("hide");
         c.add(hide);*/
        setTitle("لعبة الذاكرة");

        for (int i = 0; i < 54; i++) {
            icon[i] = new ImageIcon(getClass().getResource((i + 1) + ".png"));
            label[i] = new JLabel();
            panel.add(label[i]);
            label[i].setIcon(new ImageIcon(getClass().getResource("b1fv.png")));
            label[i].addMouseListener(this);
        }
        int e = 0;
        for (int t = 14; t > 1; --t) {
            a.add(new cards("black", t, icon[e], false));
            a.add(new cards("black", t, icon[e + 1], false));
            a.add(new cards("red", t, icon[e + 2], false));
            a.add(new cards("red", t, icon[e + 3], false));
            ++e;
            ++e;
            ++e;
            ++e;
        }
        a.add(new cards("black", 1, icon[52], false));
        a.add(new cards("red", 1, icon[53], false));
        Collections.shuffle(a);
        setVisible(true);
        panel.setBackground(Color.YELLOW);
        panel2.setBackground(Color.red);
        c.add(panel);
        c.add(panel2);
        c.setBackground(Color.YELLOW);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        startbtn.addActionListener(new ActionListener() {
       
         @Override
         public void actionPerformed(ActionEvent e) {
         for (int j = 0; j < 54; j++) {
         label[j].setIcon(a.get(j).geticon());
         }
         }
         });
         /*hide.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
         for (int j = 0; j < 54; j++) {
         label[j].setIcon(new ImageIcon(getClass().getResource("b1fv.png")));
         }
         }
         });*/
    }

    public static void main(String[] args) {
        new cardsFrame();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        for (int i = 0; i < 54; i++) {
            if (e.getSource() == label[i] && shown == 0 && a.get(i).IsSelected() == false && b1==null&&b2==null) {
                ++shown;
                num = i;
                v = a.get(i).geticon();
                b1 = label[i];
                color = a.get(i).getColor();
                rank = a.get(i).getRank();
                label[i].setIcon(a.get(i).geticon());
            } else {
                if (e.getSource() == label[i] && shown == 1 && v != a.get(i).geticon() && a.get(i).IsSelected() == false && b1!=null&&b2==null) {
                    b2 = label[i];
                    color2 = a.get(i).getColor();
                    rank2 = a.get(i).getRank();
                    label[i].setIcon(a.get(i).geticon());
                    shown = 0;
                    if (color.equals(color2) && rank == rank2) {
                        a.get(num).setSelected(true);
                        a.get(i).setSelected(true);
                        time = new Timer(400, (ActionEvent ae) -> {
                            b1.setEnabled(false);
                            b2.setEnabled(false);
                            b1=null;
                    b2=null;
                        });
                        time.setRepeats(false);
                        time.start();
                    } else {
                        time = new Timer(400, (ActionEvent ae) -> {
                            b1.setIcon(new ImageIcon(getClass().getResource("b1fv.png")));
                            b2.setIcon(new ImageIcon(getClass().getResource("b1fv.png")));
                            b1=null;
                            b2=null;
                        });
                        time.setRepeats(false);
                        time.start();
                    }
                    
                }
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
/*@Override
     public void actionPerformed(ActionEvent e) {
     for (int i = 0; i < 54; i++) {
     if (e.getSource() == button[i] && shown == 0) {
     ++shown;
     b1 = button[i];
     color = a.get(i).getColor();
     rank = a.get(i).getRank();
     button[i].setIcon(a.get(i).geticon());
     } else {
     if (e.getSource() == button[i] && shown == 1) {
     b2 = button[i];
     color2 = a.get(i).getColor();
     rank2 = a.get(i).getRank();
     button[i].setIcon(a.get(i).geticon());
     if (color.equals(color2) && rank == rank2) {
     System.out.println("right");
     shown = 0;
     } else {
     System.out.println("wrong");
     shown = 0;
     }
     b1.setIcon(new ImageIcon(getClass().getResource("b1fv.png")));
     b2.setIcon(new ImageIcon(getClass().getResource("b1fv.png")));
     }
     }
     }
     if (e.getSource() == show) {
     for (int j = 0; j < 54; j++) {
     button[j].setIcon(a.get(j).geticon());
     }
     }
     }

     public static void sleepin() {
     try {
     TimeUnit.SECONDS.sleep(2);
     } catch (InterruptedException ex) {
     Logger.getLogger(cardsFrame.class.getName()).log(Level.SEVERE, null, ex);
     }
     }*/
