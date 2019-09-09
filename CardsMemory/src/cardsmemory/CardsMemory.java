
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.util.Collections;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;
import javax.swing.border.LineBorder;

public class CardsMemory extends JFrame implements MouseListener, ActionListener {

    Container c;
    static JLabel label[] = new JLabel[60];
    ImageIcon icon[] = new ImageIcon[60];
    JButton startbtn, shuffle, sort, hint;
    ArrayList<Cards> a = new ArrayList();
    int shown = 0;
    int e1 = 0;
    String color, color2;
    int rank, rank2;
    ImageIcon v, v1;
    JLabel b1, b2, Scoore, ScooreText, numOfHints, Hints, counter;
    Timer time;
    int num = 0;
    JPanel panel, panel2;
    String cardType1, cardType2;
    int limitHint = 3;
    JMenuBar bar;
    JMenu m1, m2, m3;
    JMenuItem item1, item2, item3, item4, item5;
    int secounds = 0;
    int minutes = 0;
    int hours = 0;

    public CardsMemory() {
        c = getContentPane();
        panel = new JPanel();
        panel.setBounds(0, 20, 700, 650);
        panel.setLayout(new GridLayout(6, 13));
        panel2 = new JPanel();
        panel2.setBounds(670, 20, 300, 650);
        panel2.setLayout(null);
        c.add(bar = new JMenuBar(), BorderLayout.NORTH);
        bar.add(m1 = new JMenu("Show/Hide"));
        m1.add(item1 = new JMenuItem("Show"));
        m1.add(item3 = new JMenuItem("Hide"));
        bar.add(m2 = new JMenu("Set background"));
        m2.add(item2 = new JMenuItem("Change background color"));
        ScooreText = new JLabel("النتيجة");
        ScooreText.setBounds(760, 10, 160, 100);
        ScooreText.setFont(new java.awt.Font("Arial", 0, 36));
        Scoore = new JLabel("0");
        Scoore.setBounds(750, 80, 100, 100);
        Scoore.setFont(new java.awt.Font("Arial", 0, 36));
        Scoore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        counter = new JLabel("0:0:0");
        counter.setBounds(740, 500, 110, 50);
        counter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        counter.setFont(new java.awt.Font("Arial", 0, 24));
        counter.setBorder(new LineBorder(Color.darkGray, 5));
        startbtn = new JButton("Start");
        startbtn.setBounds(720, 180, 160, 50);
        shuffle = new JButton("Shuffle");
        shuffle.setBounds(720, 260, 160, 50);
        sort = new JButton("Sort");
        sort.setBounds(720, 340, 160, 50);
        hint = new JButton("Hint");
        hint.setBounds(720, 420, 160, 50);
        Hints = new JLabel(" Number of Hints");
        Hints.setBounds(700, 560, 200, 50);
        Hints.setFont(new java.awt.Font("Arial", 0, 24));
        numOfHints = new JLabel("3");
        numOfHints.setBounds(790, 600, 200, 50);
        numOfHints.setFont(new java.awt.Font("Arial", 0, 24));
        setBounds(240, 20, 900, 695);
        panel2.add(startbtn);
        panel2.add(shuffle);
        panel2.add(sort);
        panel2.add(hint);
        panel2.add(ScooreText);
        panel2.add(Hints);
        panel2.add(numOfHints);
        panel2.add(Scoore);
        panel2.add(counter);
        //setIconImage(Toolkit.getDefaultToolkit().getImage(CardsMemory.class.getResource("b1fv.png")));
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
            a.add(new Cards("black", t, icon[e], false, "shere"));
            a.add(new Cards("black", t, icon[e + 1], false, "bastone"));
            a.add(new Cards("red", t, icon[e + 2], false, "koba"));
            a.add(new Cards("red", t, icon[e + 3], false, "denare"));
            ++e;
            ++e;
            ++e;
            ++e;
        }
        a.add(new Cards("red", 1, icon[52], false, "shere"));
        a.add(new Cards("red", 1, icon[53], false, "koba"));
        Collections.shuffle(a);
        setVisible(true);
        panel.setBackground(Color.YELLOW);
        panel2.setBackground(Color.red);
        c.add(panel);
        c.add(panel2);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setResizable(false);
        hint.addActionListener(this);
        shuffle.addActionListener(this);
        sort.addActionListener(this);
        startbtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                for (int j = 0; j < 54; j++) {
                    label[j].setIcon(a.get(j).geticon());
                }
            }
        });
        item1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                for (int j = 0; j < 54; j++) {
                    label[j].setIcon(a.get(j).geticon());
                }
            }
        });
        item2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JColorChooser chooser = new JColorChooser();
                Color c = chooser.showDialog(null, "Please,select the Color", Color.yellow);
                panel.setBackground(c);
            }
        });
        item3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               for (int j = 0; j < 54; j++) {
                    label[j].setIcon(new ImageIcon(getClass().getResource("b1fv.png")));
                }
            }
        });
        thred();
    }

    public static void main(String[] args) {
        new CardsMemory();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        for (int i = 0; i < 54; i++) {
            if (e.getSource() == label[i] && shown == 0 && a.get(i).IsSelected() == false && b1 == null && b2 == null) {
                dofirstturn(i);
            } else {
                if (e.getSource() == label[i] && shown == 1 && v != a.get(i).geticon() && a.get(i).IsSelected() == false && b1 != null && b2 == null) {
                    dosecoundturn(i);
                    check(i);
                    checkiffull();
                }
            }
        }
    }

    public void thred() {
        try {
            Thread.sleep(1000);
        } catch (Exception ex) {
        }
        secounds = secounds + 1;
        counter.setText("" + hours + ":" + minutes + ":" + secounds);
        if (secounds == 60) {
            secounds = 0;
            ++minutes;
        }
        if (minutes == 60) {
            minutes = 0;
            ++hours;
        }
        thred();
    }

    public void dofirstturn(int i) {
        ++shown;
        num = i;
        v = a.get(i).geticon();
        b1 = label[i];
        color = a.get(i).getColor();
        rank = a.get(i).getRank();
        cardType1 = a.get(i).getCardType();
        label[i].setIcon(a.get(i).geticon());
    }

    public void dosecoundturn(int i) {
        b2 = label[i];
        color2 = a.get(i).getColor();
        rank2 = a.get(i).getRank();
        cardType1 = a.get(i).getCardType();
        label[i].setIcon(a.get(i).geticon());
        shown = 0;
    }

    public void check(int i) {
        if (color.equals(color2) && rank == rank2) {
            a.get(num).setSelected(true);
            a.get(i).setSelected(true);
            int score = Integer.parseInt(Scoore.getText());
            score = score + 50;
            Scoore.setText("" + score);
            time = new Timer(400, (ActionEvent ae) -> {
                b1.setEnabled(false);
                b2.setEnabled(false);
                b1 = null;
                b2 = null;
            });
            time.setRepeats(false);
            time.start();
        } else {
            int score = Integer.parseInt(Scoore.getText());
            score = score - 5;
            Scoore.setText("" + score);
            time = new Timer(400, (ActionEvent ae) -> {
                b1.setIcon(new ImageIcon(getClass().getResource("b1fv.png")));
                b2.setIcon(new ImageIcon(getClass().getResource("b1fv.png")));
                b1 = null;
                b2 = null;
            });
            time.setRepeats(false);
            time.start();
        }
    }

    public void checkiffull() {
        int full = 0;
        for (int j = 0; j < 54; j++) {
            if (a.get(j).IsSelected()) {
                full = full + 1;
            }
        }
        if (full == 54) {
            JOptionPane.showMessageDialog(null, "You won!\nTime spent(" + hours + ":" + minutes + ":" + secounds + ")");
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == hint) {
            if (limitHint == 0) {
                JOptionPane.showMessageDialog(null, "Sorry,Your Hints are over!");
            }
            if (b1 == null && limitHint != 0) {
                JOptionPane.showMessageDialog(null, "You have to open card.");
            } else {
                for (int i = 0; i < 54; i++) {
                    if (color.equals(a.get(i).getColor()) && rank == a.get(i).getRank() && a.get(i).getCardType() != cardType1 && limitHint >= 1) {
                        label[i].setBorder(new LineBorder(Color.darkGray, 5));
                        e1 = i;
                        --limitHint;
                    }
                    numOfHints.setText("" + limitHint);
                }
            }
            time = new Timer(400, (ActionEvent ae) -> {
                label[e1].setBorder(null);
            });
            time.setRepeats(false);
            time.start();
        } else if (e.getSource() == shuffle) {
            Collections.shuffle(a);
            limitHint = 3;
            numOfHints.setText("3");
            hours = 0;
            minutes = 0;
            secounds = 0;
            for (int i = 0; i < 54; i++) {
                a.get(i).setSelected(false);//لو ما ضفنا السطر هادا هنا سعتها لو جبت كرتين صح وعملت شفل وحاولت تفتح تفس الكرت مش حيرضى
                label[i].setEnabled(true);
                label[i].setIcon(new ImageIcon(getClass().getResource("b1fv.png")));
            }
        } else if (e.getSource() == sort) {
            hours = 0;
            minutes = 0;
            secounds = 0;
            limitHint = 3;
            sorting();
        }
    }

    public void sorting() {
        a.removeAll(a);
        int e = 3;

        a.add(new Cards("red", 1, icon[53], false, "koba"));
        for (int i = 13; i >= 1; i--) {
            a.add(new Cards("red", i, icon[e], false, "denare"));
            e = e + 4;
        }
        int e1 = 0;
        for (int i = 13; i >= 1; i--) {
            a.add(new Cards("black", i, icon[e1], false, "shere"));
            e1 = e1 + 4;
        }
        int e3 = 2;
        for (int i = 13; i >= 1; i--) {
            a.add(new Cards("red", i, icon[e3], false, "koba"));
            e3 = e3 + 4;
        }
        int e4 = 1;
        for (int i = 13; i >= 1; i--) {
            a.add(new Cards("black", i, icon[e4], false, "bastone"));
            e4 = e4 + 4;
        }
        a.add(new Cards("red", 1, icon[52], false, "koba"));
        for (int i = 0; i < 54; i++) {
            label[i].setEnabled(true);
            label[i].setIcon(new ImageIcon(getClass().getResource("b1fv.png")));
        }
    }
}
