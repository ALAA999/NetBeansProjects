
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.util.Collections;
import javax.swing.ButtonGroup;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.Timer;
import javax.swing.border.LineBorder;
import sun.java2d.*;

public class mycardframe extends JFrame implements MouseListener, KeyListener {

    static JLabel label[] = new JLabel[55];
    ImageIcon icon[] = new ImageIcon[55];
    JButton startbtn, shuffle, sort, hint;
    static ArrayList<mycard> a = new ArrayList();
    static int shown = 0, e1 = 0, secounds = 0, minutes = 0, hours = 0, limitHint = 3, num = 0, rank, rank2, key = 1, forSorted = 0;
    static String color, color2, cardType1, cardType2;
    ImageIcon v, v1;
    static JLabel b1, b2, Scoore, ScooreText, numOfHints, Hints, counter;
    Timer time;
    JPanel panel, panel2;
    JMenuBar bar;
    JMenu m1, m2, m3, m4;
    JMenuItem item1, item2, item3, item4, item5;
    JRadioButtonMenuItem item6, item7;
    ButtonGroup bg;

    public mycardframe() {

        /////////////////////////////Panels/////////////////////////////////////
        panel = new JPanel();
        panel.setBounds(0, 23, 700, 660);
        panel.setLayout(new GridLayout(6, 13));
        panel2 = new JPanel();
        panel2.setBounds(650, 20, 300, 650);
        panel2.setLayout(null);

        ////////////////////////////////Menu////////////////////////////////////
        add(bar = new JMenuBar(), BorderLayout.NORTH);
        bar.add(m1 = new JMenu("Show/Hide"));
        m1.add(item1 = new JMenuItem("Show(s)"));
        m1.add(item3 = new JMenuItem("Hide(s)"));
        bar.add(m2 = new JMenu("Set background"));
        m2.add(item2 = new JMenuItem("Change background color"));
        bar.add(m3 = new JMenu("Cheating"));
        m3.add(item4 = new JMenuItem("Increase number of hints"));
        m3.add(item5 = new JMenuItem("Reduce number of hints"));
        bar.add(m2 = new JMenu("Statagy"));
        m2.add(item6 = new JRadioButtonMenuItem("Same Color&Rank"));
        m2.add(item7 = new JRadioButtonMenuItem("Same Rank"));
        item6.setSelected(true);
        bg = new ButtonGroup();

        ///////////////////////////////Lables///////////////////////////////////
        ScooreText = new JLabel("Score");
        ScooreText.setBounds(750, 10, 160, 80);
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

        ////////////////////////////////Buttons/////////////////////////////////
        startbtn = new JButton("Start new game");
        startbtn.setBounds(720, 180, 160, 50);
        shuffle = new JButton("Shuffle");
        shuffle.setBounds(720, 260, 160, 50);
        sort = new JButton("Sort");
        sort.setBounds(720, 340, 160, 50);
        hint = new JButton("Hint(q)");
        hint.setBounds(720, 420, 160, 50);
        Hints = new JLabel(" Number of Hints");
        Hints.setBounds(700, 560, 200, 50);
        Hints.setFont(new java.awt.Font("Arial", 0, 24));
        numOfHints = new JLabel("3");
        numOfHints.setBounds(790, 600, 200, 50);
        numOfHints.setFont(new java.awt.Font("Arial", 0, 24));
        panel2.add(startbtn);
        panel2.add(shuffle);
        panel2.add(sort);
        panel2.add(hint);
        panel2.add(ScooreText);
        panel2.add(Hints);
        panel2.add(numOfHints);
        panel2.add(Scoore);
        panel2.add(counter);
        setIconImage(Toolkit.getDefaultToolkit().getImage(mycardframe.class.getResource("b1fv.png")));

        ////////////////////////// Defining Lables & ArrayList ///////////////////////////////
        for (int i = 0; i < 54; i++) {
            label[i] = new JLabel();
            icon[i] = new ImageIcon(getClass().getResource((i + 1) + ".png"));
            label[i].setIcon(new ImageIcon(getClass().getResource("b1fv.png")));
            label[i].addMouseListener(this);
            panel.add(label[i]);
        }
        int e = 0;
        for (int t = 14; t > 1; --t) {
            a.add(new mycard("black", t, icon[e], false, "shere", new SamecolorandRank()));
            a.add(new mycard("black", t, icon[e + 1], false, "bastone", new SamecolorandRank()));
            a.add(new mycard("red", t, icon[e + 2], false, "koba", new SamecolorandRank()));
            a.add(new mycard("red", t, icon[e + 3], false, "denare", new SamecolorandRank()));
            e = e + 4;
        }
        a.add(new mycard("joker", 1, icon[52], false, "denare", new SamecolorandRank()));
        a.add(new mycard("joker", 15, icon[53], false, "bastone", new SamecolorandRank()));
        Collections.shuffle(a);
        panel.setBackground(Color.green);
        panel2.setBackground(Color.red);
        add(panel);
        add(panel2);
        setResizable(false);
        setBounds(240, 15, 900, 710);
        setTitle("لعبة الذاكرة");
        setVisible(true);

        ///////////////////////////////Listenres////////////////////////////////
        hint.addMouseListener(this);
        shuffle.addMouseListener(this);
        startbtn.addMouseListener(this);
        sort.addMouseListener(this);//In order to allow the button the change the size the mounse Entered
        startbtn.addKeyListener(this);
        shuffle.addKeyListener(this);
        sort.addKeyListener(this);
        hint.addKeyListener(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        ///////////////////////////////////////////Listeners Methdes///////////////////////////////////////
        item1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Show();
            }
        });
        item2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Keep in mind that the Hint Border Color is Black!");
                JColorChooser chooser = new JColorChooser();
                Color c = chooser.showDialog(null, "Please,select the Color", Color.yellow);
                panel.setBackground(c);
            }
        });
        item3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Hide();
            }
        });
        item4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                limitHint = 100;
                numOfHints.setText("100");
            }
        });
        item5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                limitHint = 3;
                numOfHints.setText("3");
            }
        });
        item6.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < 54; i++) {
                    a.get(i).setStratagy(new SamecolorandRank());
                }
                shuffle();
                JOptionPane.showMessageDialog(null, "The Stratagy is:Same Color and Rank,enjoy!");
                item7.setSelected(false);
                item6.setSelected(true);
            }
        });
        item7.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < 54; i++) {
                    a.get(i).setStratagy(new Samerank());
                    item6.setSelected(false);
                    item7.setSelected(true);
                }
                shuffle();
                JOptionPane.showMessageDialog(null, "The Stratagy is:Same Rank,enjoy!");
                item6.setSelected(false);
            }
        });
        thred();
    }

    /////////////////////////////////////Thread///////////////////////////////////////
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

/////////////////////////////////////Main///////////////////////////////////////
    public static void main(String[] args) {
        new mycardframe();
    }

/////////////////////////////////////First Turn///////////////////////////////////////
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

/////////////////////////////////////Secound Turn///////////////////////////////
    public void dosecoundturn(int i) {
        b2 = label[i];
        color2 = a.get(i).getColor();
        rank2 = a.get(i).getRank();
        cardType1 = a.get(i).getCardType();
        label[i].setIcon(a.get(i).geticon());
        shown = 0;
    }

/////////////////////////////////////Check///////////////////////////////////////
    public void check(int i) {
        a.get(i).stratagy.play(i);
    }

    public void checkiffull() {
        int full = 0;
        for (int j = 0; j < 54; j++) {
            if (a.get(j).IsSelected()) {
                full = full + 1;
            }
        }
        if (full == 54) {
            JOptionPane.showMessageDialog(null, "You won!\nTime spent(" + hours + "h:" + minutes + "m:" + secounds + "s)");
        }
    }

    /////////////////////////////////////MouseClicked///////////////////////////////////////
    @Override
    public void mouseClicked(MouseEvent e) {
        for (int i = 0; i < 54; i++) {
            if (e.getSource() == label[i] && shown == 0 && a.get(i).IsSelected() == false && b1 == null && b2 == null) {
                if (forSorted == 0) {
                    ++forSorted;
                }
                dofirstturn(i);//In our project if the program finds the hint card the loop shold break; And do that for the rest of loops if it exists
                break;
            } else {
                if (e.getSource() == label[i] && shown == 1 && v != a.get(i).geticon() && a.get(i).IsSelected() == false && b1 != null && b2 == null) {
                    dosecoundturn(i);
                    check(i);
                    checkiffull();
                    break;
                }
            }
        }
        if (e.getSource() == hint) {
            Hint();
        } else if (e.getSource() == shuffle || e.getSource() == startbtn) {
            shuffle();
        } else if (e.getSource() == sort) {
            sorting();//When we call this method the forstored has to be 0 which means that the player has not started playing yet becuse we can not sort after start playing...
        }
    }

/////////////////////////////////////MousePressed///////////////////////////////////////
    @Override
    public void mousePressed(MouseEvent e) {
        for (int i = 0; i < 54; i++) {
            if (e.getSource() == label[i]) {
                label[i].setBorder(new LineBorder(Color.RED, 2));
                break;
            }
        }
    }

/////////////////////////////////////MouseReleased///////////////////////////////////////
    @Override
    public void mouseReleased(MouseEvent e) {

    }

/////////////////////////////////////MouseEntered///////////////////////////////////////
    @Override
    public void mouseEntered(MouseEvent e) {
        for (int i = 0; i < 54; i++) {
            if (e.getSource() == label[i]) {
                label[i].setBorder(new LineBorder(Color.LIGHT_GRAY, 2));
                break;
            }
        }
        if (e.getSource() == hint) {
            hint.setFont(new java.awt.Font("Tahoma", 1, 18));
        }
        if (e.getSource() == sort) {
            sort.setFont(new java.awt.Font("Tahoma", 1, 20));
        }
        if (e.getSource() == shuffle) {
            shuffle.setFont(new java.awt.Font("Tahoma", 1, 22));
        }
        if (e.getSource() == startbtn) {
            startbtn.setFont(new java.awt.Font("Tahoma", 1, 15));
        }
    }

/////////////////////////////////////MouseExited///////////////////////////////////////
    @Override
    public void mouseExited(MouseEvent e) {
        for (int i = 0; i < 54; i++) {
            if (e.getSource() == label[i]) {
                label[i].setBorder(null);
                break;
            }
        }
        if (e.getSource() == hint) {
            hint.setFont(new java.awt.Font("Tahoma", 0, 12));
        }
        if (e.getSource() == sort) {
            sort.setFont(new java.awt.Font("Tahoma", 0, 12));
        }
        if (e.getSource() == shuffle) {
            shuffle.setFont(new java.awt.Font("Tahoma", 0, 12));
        }
        if (e.getSource() == startbtn) {
            startbtn.setFont(new java.awt.Font("Tahoma", 0, 12));
        }
    }

/////////////////////////////////////Hide///////////////////////////////////////
    public void Hide() {
        b1 = null;
        b2 = null;
        shown = 0;
        for (int j = 0; j < 54; j++) {
            if (a.get(j).IsSelected() == true) {
            } else {
                label[j].setIcon(new ImageIcon(getClass().getResource("b1fv.png")));
            }
        }
        key = 1;
    }

    /////////////////////////////////////Show///////////////////////////////////////
    public void Show() {
        if (key == 1) {
            for (int j = 0; j < 54; j++) {
                label[j].setIcon(a.get(j).geticon());
            }
            key = 0;
        } else {
            Hide();
        }
    }

/////////////////////////////////////Hint///////////////////////////////////////
    public void Hint() {
        if (limitHint == 0) {
            JOptionPane.showMessageDialog(null, "Sorry,Your Hints are over!");
        }
        if (b1 == null && limitHint != 0) {
            JOptionPane.showMessageDialog(null, "You have to open card.");
        } else {
            if (item6.isSelected()) {
                for (int i = 0; i < 54; i++) {
                    if ((color.equals(a.get(i).getColor()) && rank == a.get(i).getRank() && a.get(i).getCardType() != cardType1) && limitHint >= 1) {
                        label[i].setBorder(new LineBorder(Color.darkGray, 5));
                        e1 = i;
                        --limitHint;
                        numOfHints.setText("" + limitHint);
                        break;
                    }
                }
            } else {
                for (int i = 0; i < 54; i++) {
                    if (rank == a.get(i).getRank() && a.get(i).getCardType() != cardType1 && limitHint >= 1 && a.get(i).IsSelected() == false) {
                        label[i].setBorder(new LineBorder(Color.darkGray, 5));
                        e1 = i;
                        --limitHint;
                        numOfHints.setText("" + limitHint);
                        break;
                    }

                }
            }
            time = new Timer(400, (ActionEvent ae) -> {
                label[e1].setBorder(null);
            });
            time.setRepeats(false);
            time.start();
        }
    }

/////////////////////////////////////Shuffle///////////////////////////////////////
    public void shuffle() {
        forSorted = 0;
        b1 = null;
        b2 = null;
        shown = 0;
        Collections.shuffle(a);
        limitHint = 3;
        numOfHints.setText("3");
        hours = 0;
        minutes = 0;
        secounds = 0;
        Scoore.setText("0");
        for (int i = 0; i < 54; i++) {
            a.get(i).setSelected(false);//لو ما ضفنا السطر هادا هنا سعتها لو جبت كرتين صح وعملت شفل وحاولت تفتح تفس الكرت مش حيرضى
            label[i].setEnabled(true);
            //label[i].setIcon(new ImageIcon(getClass().getResource("b1fv.png")));
        }
        Hide();
        Show();
    }

/////////////////////////////////////Storing///////////////////////////////////////
    public void sorting() {
        if (forSorted == 1) {//It equals 1 when the user starts playing.
            JOptionPane.showMessageDialog(null, "Sorry,You have to Start new Game or shuffle the Cards!");
        } else {
            mycard card;
            int reached = 0;
            for (int e = 0; e < 54; e++) {
                for (int i = e; i < e + 9; i++) {
                    for (int j = i + 1; j < e + 9; j++) {
                        if (a.get(i).getCardType().equals("bastone") && a.get(j).getCardType().equals("bastone")) {
                            if (a.get(j).getRank() > a.get(i).getRank()) {
                                card = a.get(i);
                                a.set(i, a.get(j));
                                a.set(j, card);
                            }
                        }
                    }
                }
                for (int i = e; i < e + 9; i++) {
                    if (a.get(i).getCardType().equals("bastone")) {
                        card = a.get(reached);
                        a.set(reached, a.get(i));
                        a.set(i, card);
                        ++reached;
                    }
                }
                //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

                for (int i = e; i < e + 9; i++) {
                    for (int j = i + 1; j < e + 9; j++) {
                        if (a.get(i).getCardType().equals("koba") && a.get(j).getCardType().equals("koba")) {
                            if (a.get(j).getRank() > a.get(i).getRank()) {
                                card = a.get(i);
                                a.set(i, a.get(j));
                                a.set(j, card);
                            }
                        }
                    }
                }
                for (int i = e; i < e + 9; i++) {
                    if (a.get(i).getCardType().equals("koba")) {
                        card = a.get(reached);
                        a.set(reached, a.get(i));
                        a.set(i, card);
                        ++reached;
                    }
                }
                //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
                for (int i = e; i < e + 9; i++) {
                    for (int j = i + 1; j < e + 9; j++) {
                        if (a.get(i).getCardType().equals("shere") && a.get(j).getCardType().equals("shere")) {
                            if (a.get(j).getRank() > a.get(i).getRank()) {
                                card = a.get(i);
                                a.set(i, a.get(j));
                                a.set(j, card);
                            }
                        }
                    }
                }
                for (int i = e; i < e + 9; i++) {
                    if (a.get(i).getCardType().equals("shere")) {
                        card = a.get(reached);
                        a.set(reached, a.get(i));
                        a.set(i, card);
                        ++reached;
                    }
                }
                //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> 
                for (int i = e; i < e + 9; i++) {
                    for (int j = i + 1; j < e + 9; j++) {
                        if (a.get(i).getCardType().equals("denare") && a.get(j).getCardType().equals("denare")) {
                            if (a.get(j).getRank() > a.get(i).getRank()) {
                                card = a.get(i);
                                a.set(i, a.get(j));
                                a.set(j, card);
                            }
                        }
                    }
                }
                for (int i = e; i < e + 9; i++) {
                    if (a.get(i).getCardType().equals("denare")) {
                        card = a.get(reached);
                        a.set(reached, a.get(i));
                        a.set(i, card);
                        ++reached;
                    }
                }
                e = e + 8;
            }
            Hide();
            Show();
//        a.removeAll(a);
//        int e = 3;
//        a.add(new mycard("red", 1, icon[52], false, "shre", new SamecolorandRank()));
//        for (int i = 14; i > 1; i--) {
//            a.add(new mycard("red", i, icon[e], false, "denare", new SamecolorandRank()));
//            e = e + 4;
//        }
//        int e1 = 0;
//        for (int i = 14; i > 1; i--) {
//            a.add(new mycard("black", i, icon[e1], false, "shere", new SamecolorandRank()));
//            e1 = e1 + 4;
//        }
//        int e3 = 2;
//        for (int i = 14; i > 1; i--) {
//            a.add(new mycard("red", i, icon[e3], false, "koba", new SamecolorandRank()));
//            e3 = e3 + 4;
//        }
//        int e4 = 1;
//        for (int i = 14; i > 1; i--) {
//            a.add(new mycard("black", i, icon[e4], false, "bastone", new SamecolorandRank()));
//            e4 = e4 + 4;
//        }
//
//        a.add(new mycard("red", 1, icon[53], false, "koba", new SamecolorandRank()));
//        for (int i = 0; i < 54; i++) {
//            label[i].setEnabled(true);
//            label[i].setIcon(new ImageIcon(getClass().getResource("b1fv.png")));
//            if (item6.isSelected()) {
//                a.get(i).setStratagy(new SamecolorandRank());
//            } else {
//                a.get(i).setStratagy(new Samerank());
//            }
//        }
        }
    }

/////////////////////////////////////Keys Listenrs///////////////////////////////////////
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_Q) {
            Hint();
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            Show();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
