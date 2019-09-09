
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;
import javax.swing.JPanel;

public class MainDisply extends JFrame implements MouseListener {
//num_ofPlayer_played is for the current lotsh||||||| player_playing to get player turn

    int CardSelected, max_talba = 0, talba_turn = 0, num_passed = 0, ltosh = 0, num_ofPlayer_played = 0, player_playing;
    String player_WhoOrdered, player0_tarneb, player1_tarneb, player2_tarneb, tarneb, card_type_each_lotsh = "";
    boolean player_passed[] = new boolean[4];
    card c1, c2, c3, c4;
    boolean Is_AllowedToPlay = false, IsOutOfTarneb = false;
    JLabel p[] = new JLabel[53];
    JPanel panels[] = new JPanel[4];
    JButton newgame;
    ImageIcon icon[] = new ImageIcon[53];
    JLabel jLabels[] = new JLabel[24];
    ArrayList<card> arrayList, player1, player2, player3, player4;

    public MainDisply() {
        setSize(885, 700);
        setLayout(null);
        for (int i = 0; i < 4; i++) {
            panels[i] = new JPanel();
        }
        panels[0].setBounds(10, 20, 85, 620);
        panels[2].setBounds(780, 20, 85, 620);
        panels[3].setBounds(132, 5, 620, 75);
        jLabels[0] = new JLabel();
        jLabels[0].setBounds(160, 330, 75, 100);
        jLabels[0].addMouseListener(this);
        jLabels[1] = new JLabel();
        jLabels[1].setBounds(122, 100, 170, 150);
        jLabels[6] = new JLabel(); // tarneb each lotsh above them and us
        jLabels[6].setBounds(170, 90, 100, 50);
        jLabels[6].setFont(new java.awt.Font("Arial", 0, 20));
        jLabels[2] = new JLabel("هم");
        jLabels[2].setBounds(130, 110, 70, 50);
        jLabels[2].setFont(new java.awt.Font("Arial", 0, 36));
        jLabels[3] = new JLabel("نحن");
        jLabels[3].setBounds(225, 110, 70, 50);
        jLabels[3].setFont(new java.awt.Font("Arial", 0, 36));
        jLabels[4] = new JLabel("0");
        jLabels[4].setBounds(130, 160, 70, 50);
        jLabels[4].setFont(new java.awt.Font("Arial", 0, 36));
        jLabels[8] = new JLabel("الإجمالي");
        jLabels[8].setBounds(170, 160, 80, 50);
        jLabels[8].setFont(new java.awt.Font("Arial", 0, 20));
        jLabels[5] = new JLabel("0"); // our total score
        jLabels[5].setBounds(250, 160, 70, 50);
        jLabels[5].setFont(new java.awt.Font("Arial", 0, 36));
        jLabels[7] = new JLabel("0"); // thier score each lotsh
        jLabels[7].setBounds(130, 200, 70, 50);
        jLabels[7].setFont(new java.awt.Font("Arial", 0, 36));
        jLabels[13] = new JLabel("الان");
        jLabels[13].setBounds(190, 200, 70, 50);
        jLabels[13].setFont(new java.awt.Font("Arial", 0, 20));
        jLabels[14] = new JLabel("0"); // our score each lotsh
        jLabels[14].setBounds(250, 200, 70, 50);
        jLabels[14].setFont(new java.awt.Font("Arial", 0, 36));
        newgame = new JButton("لعبة جديدة");
        newgame.setBounds(620, 120, 130, 50);
        newgame.setFont(new java.awt.Font("Tahoma", 0, 16));
        newgame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //new_game();
            }
        });
        jLabels[15] = new JLabel();// current user card will be put here
        jLabels[15].setBounds(420, 330, 75, 100);
        jLabels[16] = new JLabel();//player 0
        jLabels[16].setBounds(530, 210, 75, 100);
        jLabels[17] = new JLabel("");// player 1
        jLabels[17].setBounds(420, 100, 75, 100);
        jLabels[18] = new JLabel("");// player 2
        jLabels[18].setBounds(310, 210, 75, 100);
        jLabels[19] = new JLabel("");
        jLabels[19].setBounds(300, 410, 150, 50);
        jLabels[9] = new JLabel();
        jLabels[9].setBounds(320, 380, 50, 50);
        jLabels[9].setFont(new java.awt.Font("Arial", 0, 30));
        jLabels[20] = new JLabel("");
        jLabels[20].setBounds(660, 250, 150, 50);
        jLabels[10] = new JLabel();
        jLabels[10].setBounds(720, 290, 50, 50);
        jLabels[10].setFont(new java.awt.Font("Arial", 0, 30));
        jLabels[22] = new JLabel("");
        jLabels[22].setBounds(300, 80, 150, 50);
        jLabels[11] = new JLabel("");
        jLabels[11].setBounds(370, 120, 50, 50);
        jLabels[11].setFont(new java.awt.Font("Arial", 0, 30));
        jLabels[21] = new JLabel("");
        jLabels[21].setBounds(100, 270, 150, 50);
        jLabels[12] = new JLabel();
        jLabels[12].setBounds(180, 270, 50, 50);
        jLabels[12].setFont(new java.awt.Font("Arial", 0, 30));
        jLabels[19].setFont(new java.awt.Font("Arial", 0, 30));
        jLabels[20].setFont(new java.awt.Font("Arial", 0, 30));
        jLabels[22].setFont(new java.awt.Font("Arial", 0, 30));
        jLabels[21].setFont(new java.awt.Font("Arial", 0, 30));
        jLabels[15].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabels[16].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabels[17].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabels[18].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabels[1].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabels[0].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panels[0].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panels[2].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panels[3].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(panels[0]);
        add(panels[2]);
        add(panels[3]);
        add(jLabels[0]);
        add(jLabels[1]);
        add(jLabels[2]);
        add(jLabels[3]);
        add(jLabels[4]);
        add(jLabels[6]);
        add(jLabels[5]);
        add(jLabels[7]);
        add(jLabels[14]);
        add(jLabels[8]);
        add(jLabels[13]);
        add(jLabels[12]);
        add(jLabels[11]);
        add(jLabels[10]);
        add(jLabels[9]);
        add(jLabels[15]);
        add(jLabels[16]);
        add(jLabels[17]);
        add(jLabels[18]);
        add(jLabels[19]);
        add(jLabels[20]);
        add(jLabels[21]);
        add(jLabels[22]);
        add(newgame);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        start_new_dak();
    }

    public void start_new_dak() {
        c1 = null;
        c2 = null;
        c3 = null;
        c4 = null;
        jLabels[19].setText("");
        jLabels[20].setText("");
        jLabels[21].setText("");
        jLabels[22].setText("");
        jLabels[6].setText("");
        remove(panels[1]);
        panels[1] = null;
        panels[1] = new JPanel();
        panels[1].setBounds(160, 455, 555, 210);
        panels[1].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(panels[1]);
        arrayList = new ArrayList<>();
        player1 = new ArrayList<>();
        player2 = new ArrayList<>();
        player3 = new ArrayList<>();
        player4 = new ArrayList<>();
        max_talba = num_passed = ltosh = num_ofPlayer_played = player_playing = 0;
        player_WhoOrdered = player0_tarneb = player1_tarneb = player2_tarneb = tarneb = card_type_each_lotsh = "";
        player_passed = new boolean[4];
        Is_AllowedToPlay = IsOutOfTarneb = false;
        jLabels[7].setText("0");
        jLabels[14].setText("0");
        for (int i = 0; i < 13; i++) {
            p[i] = new JLabel();
            p[i].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            panels[1].add(p[i]);
            icon[i] = new ImageIcon(getClass().getResource((i + 1) + ".png"));
            p[i].addMouseListener(this);
        }
        for (int i = 13; i < 26; i++) {
            p[i] = new JLabel();
            p[i].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            p[i].setIcon(new ImageIcon(getClass().getResource("b1fv1.png")));
            panels[3].add(p[i]);
            icon[i] = new ImageIcon(getClass().getResource((i + 1) + ".png"));
        }
        for (int i = 26; i < 39; i++) {
            p[i] = new JLabel();
            p[i].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            p[i].setIcon(new ImageIcon(getClass().getResource("b1fv2.png")));
            panels[0].add(p[i]);
            icon[i] = new ImageIcon(getClass().getResource((i + 1) + ".png"));
        }
        for (int i = 39; i < 52; i++) {//Make Players that have Varable card on them!
            p[i] = new JLabel();
            p[i].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            p[i].setIcon(new ImageIcon(getClass().getResource("b1fv2.png")));
            panels[2].add(p[i]);
            icon[i] = new ImageIcon(getClass().getResource((i + 1) + ".png"));
        }
        for (int i = 0; i < 4; i++) {
            player_passed[i] = false;
        }
        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Adding cards to arrayList
        int e = 0, c = 52;
        for (int t = 14; t > 1; --t) {
            arrayList.add(new card(t, icon[e], false, "Clubs", c - 39));
            arrayList.add(new card(t, icon[e + 1], false, "Spade", c - 13));
            arrayList.add(new card(t, icon[e + 2], false, "Hearts", c - 26));
            arrayList.add(new card(t, icon[e + 3], false, "Dimonds", c));
            e = e + 4;
            --c;
        }
        Collections.shuffle(arrayList);
        SortCards();
        for (int i = 12; i >= 0; i--) {
            p[i].setIcon(arrayList.get(i).geticon());
        }
        for (int i = 0; i < 13; i++) {
            player1.add(arrayList.get(i));
        }
        for (int i = 13; i < 26; i++) {
            player2.add(arrayList.get(i));
        }
        for (int i = 26; i < 39; i++) {
            player3.add(arrayList.get(i));
        }
        for (int i = 39; i < 52; i++) {
            player4.add(arrayList.get(i));
        }
        Talba_loop();
    }

    public void SortCards() {// we have sorted the whole arraylist to make sure that the copmuter will chose the best card onec he searches for it.
        for (int i = 0; i < 13; i++) {
            for (int j = i + 1; j < 13; j++) {
                if (arrayList.get(i).getValue() > arrayList.get(j).getValue()) {
                    card c1 = arrayList.get(i);
                    arrayList.set(i, arrayList.get(j));
                    arrayList.set(j, c1);
                }
            }
        }
        for (int i = 13; i < 26; i++) {
            for (int j = i + 1; j < 26; j++) {
                if (arrayList.get(i).getValue() > arrayList.get(j).getValue()) {
                    card c1 = arrayList.get(i);
                    arrayList.set(i, arrayList.get(j));
                    arrayList.set(j, c1);
                }
            }
        }
        for (int i = 26; i < 39; i++) {
            for (int j = i + 1; j < 39; j++) {
                if (arrayList.get(i).getValue() > arrayList.get(j).getValue()) {
                    card c1 = arrayList.get(i);
                    arrayList.set(i, arrayList.get(j));
                    arrayList.set(j, c1);
                }
            }
        }
        for (int i = 39; i < 52; i++) {
            for (int j = i + 1; j < 52; j++) {
                if (arrayList.get(i).getValue() > arrayList.get(j).getValue()) {
                    card c1 = arrayList.get(i);
                    arrayList.set(i, arrayList.get(j));
                    arrayList.set(j, c1);
                }
            }
        }
    }

    public static void main(String[] args) {
        new MainDisply();
    }

    //this mathode is to make players order tarneb
    public void Talba(int player_turn) {
        int p1, p2, p3, p4 = 0;
        switch (player_turn) {
            case 0:
                p1 = ChenckCardsForTalba(player2);
                if (p1 > max_talba) {
                    max_talba = p1;
                    jLabels[20].setText(max_talba + "");
                    player_WhoOrdered = "p0";
                    player0_tarneb = tarneb;
                } else {
                    jLabels[20].setText("Pass");
                    player_passed[0] = true;
                    ++num_passed;
                }
                break;
            case 1:
                p2 = ChenckCardsForTalba(player3);
                if (p2 > max_talba) {
                    max_talba = p2;
                    jLabels[22].setText(max_talba + "");
                    player_WhoOrdered = "p1";
                    player1_tarneb = tarneb;
                } else {
                    jLabels[22].setText("Pass");
                    player_passed[1] = true;
                    ++num_passed;
                }
                break;
            case 2:
                p3 = ChenckCardsForTalba(player4);
                if (p3 > max_talba) {
                    max_talba = p3;
                    jLabels[21].setText(max_talba + "");
                    player_WhoOrdered = "p2";
                    player2_tarneb = tarneb;
                } else {
                    jLabels[21].setText("Pass");
                    player_passed[2] = true;
                    ++num_passed;
                }
                break;
            case 3:
                int num = 1;
                for (int i = 0; i < num; i++) {
                    try {
                        p4 = Integer.parseInt(JOptionPane.showInputDialog("شو طلبتك؟", (max_talba + 1) + " / pass"));
                        if (p4 < 7 || p4 <= max_talba || p4 > 13) {
                            JOptionPane.showMessageDialog(this, "اطلب طلبة صحيحة");
                            ++num;
                        } else {
                            if (p4 > max_talba) {
                                max_talba = p4;
                                jLabels[19].setText(max_talba + "");
                                player_WhoOrdered = "p3";
                            }
                        }
                    } catch (Exception e) {
                        jLabels[19].setText("Pass");
                        player_passed[3] = true;
                        ++num_passed;
                    }
                }
                break;
        }
    }

    public void Talba_loop() {
        int loops_num = 0;
        boolean Has_ended = false;
        for (int i = talba_turn; i < 4; i++) {
            if ((num_passed == 3 && loops_num >= 4)) {//if this is the first loop and 3 persons passed game will not end, it'll let the last player chack his cards || we check if all players have passed it will bereak.
                break;
            }
            if (num_passed == 4) {
                Has_ended = true;
                break;
            }
            if (!player_passed[i]) {
                Talba(i);
            }
            ++loops_num;
            if (i == 3) { // mostly after this one will be making a break from the first if 
                i = -1;
            }
            try {
                Thread.sleep(600);
            } catch (InterruptedException ex) {
            }
        }
        if (!Has_ended) {
            switch (player_WhoOrdered) {
                case "p0":
                    //playr  has orederd
                    jLabels[20].setText(player0_tarneb);
                    tarneb = player0_tarneb;
                    set_tarmeb_rank();
                    Start_Playing(0);
                    break;
                case "p1":
                    jLabels[22].setText(player1_tarneb);
                    tarneb = player1_tarneb;
                    set_tarmeb_rank();
                    Start_Playing(1);
                    break;
                case "p2":
                    jLabels[21].setText(player2_tarneb);
                    tarneb = player2_tarneb;
                    set_tarmeb_rank();
                    Start_Playing(2);
                    break;
                case "p3":
                    int num = 1;
                    for (int i = 0; i < num; i++) {
                        String current_player_talba = JOptionPane.showInputDialog("شو طرنيبك؟", "Clubs/Spade/Hearts/Dimonds");
                        if ((current_player_talba.equals("Clubs")) || (current_player_talba.equals("Spade")) || (current_player_talba.equals("Hearts")) || (current_player_talba.equals("Dimonds"))) {
                            jLabels[19].setText(current_player_talba);
                            tarneb = current_player_talba;
                            set_tarmeb_rank();
                            Start_Playing(3);
                        } else {
                            JOptionPane.showMessageDialog(this, "اطلب طلبة صحيحة");
                            ++num;
                        }
                    }
                    break;
            }
            jLabels[6].setText(tarneb + "  " + max_talba);
        } else {
            start_new_dak(); // In case all players have passed
        }
    }
//this methode is to make the tarned orderd the strongest card in this game1

    public void set_tarmeb_rank() {
        for (int i = 0; i < 52; i++) {
            if (arrayList.get(i).getCardType().equals(tarneb)) {
                arrayList.get(i).setRank(arrayList.get(i).getRank() + 60);
            }
        }
        for (int i = 0; i < 13; i++) {
            if (player1.get(i).getCardType().equals(tarneb)) {
                player1.get(i).setRank(player1.get(i).getRank() + 60);
            }
            if (player2.get(i).getCardType().equals(tarneb)) {
                player2.get(i).setRank(player2.get(i).getRank() + 60);
            }
            if (player3.get(i).getCardType().equals(tarneb)) {
                player3.get(i).setRank(player3.get(i).getRank() + 60);
            }
            if (player4.get(i).getCardType().equals(tarneb)) {
                player4.get(i).setRank(player4.get(i).getRank() + 60);
            }
        }
    }

    public void last_clicked(boolean last_lotsh) {// once a lotsh is over
        int who_ate = get_who_ate();
        int total_thems = Integer.parseInt(jLabels[7].getText());
        int total_uss = Integer.parseInt(jLabels[14].getText());
        switch (who_ate) {
            case 1:
                jLabels[11].setText("+1");
                ++total_uss;
                jLabels[14].setText(total_uss + "");
                break;
            case 2:
                jLabels[12].setText("+1");
                ++total_thems;
                jLabels[7].setText(total_thems + "");
                break;
            case 3:
                jLabels[9].setText("+1");
                ++total_uss;
                jLabels[14].setText(total_uss + "");
                break;
            case 0:
                jLabels[10].setText("+1");
                ++total_thems;
                jLabels[7].setText(total_thems + "");
                break;
        }
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                clear_icons();
                ++ltosh;
                if (!last_lotsh) {
                    Start_Playing(who_ate);
                } else {
                    start_new_dak();
                }
            }
        }, 800);
    }

    public void set_Text_For_Winner_Team() {
        boolean winOrLost = false;
        if (talba_turn == 4) {
            talba_turn = 0;
        }
        int thier_scoore = Integer.parseInt(jLabels[7].getText());
        int our_scoore = Integer.parseInt(jLabels[14].getText());
        int thier_old_scoore = Integer.parseInt(jLabels[4].getText());
        int our_old_scoore = Integer.parseInt(jLabels[5].getText());
        if (player_WhoOrdered.equals("p0") || player_WhoOrdered.equals("p2")) { // if they oreded it
            if (thier_scoore >= max_talba) {
                thier_old_scoore = thier_old_scoore + thier_scoore;
            } else {
                thier_old_scoore = thier_old_scoore - max_talba;
                our_old_scoore = our_old_scoore + our_scoore;
            }
        } else {
            if (our_scoore >= max_talba) {
                our_old_scoore = our_old_scoore + our_scoore;
            } else {
                our_old_scoore = our_old_scoore - max_talba;
                thier_old_scoore = thier_old_scoore + thier_scoore;
            }
        }
        jLabels[4].setText(thier_old_scoore + "");
        jLabels[5].setText(our_old_scoore + "");
        if (thier_old_scoore >= 31) {
            jLabels[6].setText("خسرت");
            winOrLost = true;
        } else if (our_old_scoore >= 31) {
            jLabels[6].setText("فزت");
            winOrLost = true;
        }
        if (winOrLost) {
            talba_turn = 0;
            new Timer().schedule(new TimerTask() {
                @Override
                public void run() {
                    jLabels[4].setText("0");
                    jLabels[5].setText("0");
                }
            }, 5000);
        }
    }

    public void Start_Playing(int player_turn) {
        Is_AllowedToPlay = false;
        player_playing = player_turn;
        if (player_playing == 0) {//player 0
            new Timer().schedule(new TimerTask() {
                @Override
                public void run() {
                    System.out.println("player 0");
                    c2 = Serch_for_card_toPlay(player2, jLabels[16], "p0");
                    ++num_ofPlayer_played;
                    ++player_playing;// what you need to make is to clear the varabiles after evey single lotsh!
                    p[ltosh + 39].setVisible(false);
                    if (num_ofPlayer_played == 4) {
                        if (ltosh == 12) {
                            ++talba_turn;
                            last_clicked(true);
                            set_Text_For_Winner_Team();
                        } else {
                            last_clicked(false);
                        }
                    } else {
                        Start_Playing(1);
                    }
                }
            }, 400);
        }
        if (player_playing == 1) {//player 1
            new Timer().schedule(new TimerTask() {
                @Override
                public void run() {
                    System.out.println("player 1");
                    c3 = Serch_for_card_toPlay(player3, jLabels[17], "p1");
                    ++num_ofPlayer_played;
                    ++player_playing;
                    p[ltosh + 13].setVisible(false);
                    if (num_ofPlayer_played == 4) {
                        if (ltosh == 12) {
                            ++talba_turn;
                            last_clicked(true);
                            set_Text_For_Winner_Team();
                        } else {
                            last_clicked(false);
                        }
                    } else {
                        Start_Playing(2);
                    }
                }
            }, 400);
        }
        if (player_playing == 2) {//player 2
            new Timer().schedule(new TimerTask() {
                @Override
                public void run() {
                    System.out.println("player 2");
                    c4 = Serch_for_card_toPlay(player4, jLabels[18], "p2");
                    ++num_ofPlayer_played;
                    ++player_playing;
                    p[ltosh + 26].setVisible(false);
                    if (num_ofPlayer_played == 4) {
                        if (ltosh == 12) {
                            ++talba_turn;
                            last_clicked(true);
                            set_Text_For_Winner_Team();
                        } else {
                            last_clicked(false);
                        }
                    } else {
                        Start_Playing(3);
                    }
                }
            }, 400);
        }
        if (player_playing == 3) {//player 3
            Is_AllowedToPlay = true;
        }
    }

    public void clear_icons() {
        jLabels[15].setIcon(null);
        jLabels[16].setIcon(null);
        jLabels[17].setIcon(null);
        jLabels[18].setIcon(null);
        if (!IsOutOfTarneb && card_type_each_lotsh.equals(tarneb)) {
            if (!c1.getCardType().equals(tarneb) && !c3.getCardType().equals(tarneb)) {
                IsOutOfTarneb = true;
            } else if (!c2.getCardType().equals(tarneb) && !c4.getCardType().equals(tarneb)) {
                IsOutOfTarneb = true;
            }
        }
        System.out.println("IsOutOfTarneb" + IsOutOfTarneb);
        arrayList.remove(c4);
        arrayList.remove(c3);
        arrayList.remove(c2);
        arrayList.remove(c1);
        player2.remove(c2);
        player3.remove(c3);
        player4.remove(c4);
        c1 = null;
        c2 = null;
        c3 = null;
        c4 = null;
        jLabels[9].setText("");
        jLabels[10].setText("");
        jLabels[11].setText("");
        jLabels[12].setText("");
        card_type_each_lotsh = "";
        num_ofPlayer_played = 0;
    }

    public int get_who_ate() {
        int location = 0;// if they are all out of the card_type_each_lotsh
        if (!(c1.getCardType().equals(card_type_each_lotsh) && c2.getCardType().equals(card_type_each_lotsh) && c3.getCardType().equals(card_type_each_lotsh) && c4.getCardType().equals(card_type_each_lotsh)) && !(c1.getCardType().equals(tarneb) || c2.getCardType().equals(tarneb) || c3.getCardType().equals(tarneb) || c4.getCardType().equals(tarneb))) { // if they all have the same color or someone played a tarneba
            if (!c1.getCardType().equals(card_type_each_lotsh)) {
                c1.setRank(0);
            }
            if (!c2.getCardType().equals(card_type_each_lotsh)) {
                c2.setRank(0);
            }
            if (!c3.getCardType().equals(card_type_each_lotsh)) {
                c3.setRank(0);
            }
            if (!c4.getCardType().equals(card_type_each_lotsh)) {
                c4.setRank(0);
            }
        } // cards have diffrents types or no one played a tarneb
        if (c1.getRank() > c2.getRank() && c1.getRank() > c3.getRank() && c1.getRank() > c4.getRank()) {
            location = 3;// current player user
        } else if (c2.getRank() > c1.getRank() && c2.getRank() > c3.getRank() && c2.getRank() > c4.getRank()) {
            location = 0;
        } else if (c3.getRank() > c1.getRank() && c3.getRank() > c2.getRank() && c3.getRank() > c4.getRank()) {
            location = 1;
        } else {
            location = 2;
        }
        return location;
    }

    public card Serch_for_card_toPlay(ArrayList<card> player_array, JLabel label, String player_turn) {
        card c = null;
        if (card_type_each_lotsh.equals("")) {// first open for this lotsh
            if ((player_turn.equals("p0") || player_turn.equals("p2")) && (player_WhoOrdered.equals("p0") || player_WhoOrdered.equals("p2")) && (!IsOutOfTarneb) && !Is_Out_Of_tarneb(player_array)) { // check if turn is on p0 Or p2 && player who_ordered is p0 Or 02 && tarneb is not out && current player will play is not out of tarneb in order to play it 
                card mine = get_highest_tarneba(player_array);
                if (Is_makel(get_highest_tarneba(player_array))) {
                    c = mine;
                    card_type_each_lotsh = c.getCardType();
                } else {
                    c = get_smallest_tarneba(player_array);
                    card_type_each_lotsh = c.getCardType();
                }
            } else if ((player_turn.equals("p1") || player_turn.equals("p3")) && (player_WhoOrdered.equals("p1") || player_WhoOrdered.equals("p3")) && (!IsOutOfTarneb) && !Is_Out_Of_tarneb(player_array)) { // The same condition like above but for the other team
                card mine = get_highest_tarneba(player_array);
                if (Is_makel(get_highest_tarneba(player_array))) {
                    c = mine;
                    card_type_each_lotsh = c.getCardType();
                } else {
                    c = get_smallest_tarneba(player_array);
                    card_type_each_lotsh = c.getCardType();
                }
            }
            if (c == null) { // If non of the above conditions has occurred
                for (int i = 0; i < player_array.size(); i++) {
                    if (!player_array.get(i).getCardType().equals(tarneb) && Is_makel(player_array.get(i))) { // Search for a card makel but not a Tarneba
                        c = player_array.get(i);
                        card_type_each_lotsh = player_array.get(i).getCardType();
                        break;
                    }
                }
            }
            if (c == null) {
                c = get_smallest_card(player_array); // If this player dose't have a makel card
                card_type_each_lotsh = c.getCardType();
            }
        } else {// not first open for this lotsh
            if (num_ofPlayer_played == 1) { // secound player turn
                if (c1 != null) { // Right Side player turn
                    c = make_checks_for_one_player_played(c1, player_array);
                } else if (c2 != null) { // Top Side player turn
                    c = make_checks_for_one_player_played(c2, player_array);
                } else if (c3 != null) { // left Side player turn
                    c = make_checks_for_one_player_played(c3, player_array);
                }
            } else if (num_ofPlayer_played == 2) { // third playerr turn
                if (c1 != null && c2 != null) { //Top Side player turn
                    c = make_check_for_two_player_played(c1, c2, player_array);
                } else if (c2 != null && c3 != null) { //left Side player turn
                    c = make_check_for_two_player_played(c2, c3, player_array);
                } else if (c4 != null && c1 != null) { //Right Side player turn
                    c = make_check_for_two_player_played(c4, c1, player_array);
                }
            } else if (num_ofPlayer_played == 3) { // Turn for 4th player 
                if (c2 == null) {
                    if (c4.getRank() > c3.getRank() && c4.getRank() > c1.getRank()) { //c2's turn then we will check if his friend will win this lotsh
                        c = get_smallest_Rank_same_Type(player_array);
                    } else {
                        c = get_higher_card(player_array, c3, c1);
                        if (c == null) {// i dont have a higher card from the same color
                            if (!Is_Out_Of_Color(player_array)) {
                                c = get_smallest_Rank_same_Type(player_array);
                            } else {
                                if (Is_Out_Of_tarneb(player_array)) {
                                    c = get_smallest_card(player_array);
                                } else {
                                    c = get_higher_tarneba(player_array, c3, c1);
                                }
                            }
                        }
                    }
                } else if (c3 == null) { // Same checks like above but for Top side player 
                    if (c1.getRank() > c2.getRank() && c1.getRank() > c4.getRank()) {
                        c = get_smallest_Rank_same_Type(player_array);
                    } else {
                        c = get_higher_card(player_array, c2, c4);
                        if (c == null) {
                            if (!Is_Out_Of_Color(player_array)) {
                                c = get_smallest_Rank_same_Type(player_array);
                            } else {
                                if (Is_Out_Of_tarneb(player_array)) {
                                    c = get_smallest_card(player_array);
                                } else {
                                    c = get_higher_tarneba(player_array, c2, c4);
                                }
                            }
                        }
                    }
                } else if (c4 == null) {// Same checks like above but for left side player 
                    if (c2.getRank() > c3.getRank() && c2.getRank() > c1.getRank()) {
                        c = get_smallest_Rank_same_Type(player_array);
                    } else {
                        c = get_higher_card(player_array, c3, c1);
                        if (c == null) {
                            if (!Is_Out_Of_Color(player_array)) {
                                c = get_smallest_Rank_same_Type(player_array);
                            } else {
                                if (Is_Out_Of_tarneb(player_array)) {
                                    c = get_smallest_card(player_array);
                                } else {
                                    c = get_higher_tarneba(player_array, c3, c1);
                                }
                            }
                        }
                    }
                }
            }
            if (c == null) {
                c = get_smallest_card(player_array);
            }
        }
        label.setIcon(c.geticon());
        System.out.println(c.getCardType() + c.getRank() + "value" + c.getValue());
        return c;
    }

    // this is the methode for the secound player to check his card & this card which has been sent in some cases we will check for higher than it
    public card make_checks_for_one_player_played(card card, ArrayList<card> player_array) {
        card c = null;
        if (Is_Out_Of_Color(player_array)) {
            if (Is_Out_Of_tarneb(player_array)) {
                c = get_smallest_card(player_array);
            } else {
                c = get_smallest_tarneba(player_array);
            }
        } else { // if not out of color
            c = get_higher_card(player_array, card);
            if (c == null) {
                c = get_smallest_Rank_same_Type(player_array);
            }
        }
        return c;
    }

    public card make_check_for_two_player_played(card player_one_card, card player_two_card, ArrayList<card> player_array) {
        card c = null;
        if (player_one_card.getRank() < player_two_card.getRank()) {
            c = get_highest_card_Same_type(player_array);
            if (c != null && c.getRank() < player_two_card.getRank()) {
                c = get_smallest_Rank_same_Type(player_array);
            }
            if (c == null) {
                c = get_higher_tarneba(player_array, player_one_card, player_two_card);
            }
        } else if (player_one_card.getRank() <= 9) {
            c = get_highest_card_Same_type(player_array);
            if (c == null) {
                c = get_smallest_tarneba(player_array);
            }
        } else {
            c = get_smallest_Rank_same_Type(player_array);
        }
        return c;
    }

    public card get_higher_card(ArrayList<card> player_array, card previous_player_card) {
        card c = null;
        for (int i = 0; i < player_array.size(); i++) {
            if (player_array.get(i).getRank() > previous_player_card.getRank() && player_array.get(i).getCardType().equals(card_type_each_lotsh)) {
                c = player_array.get(i);
                break;
            }
        }
        return c;
    }

    public card get_higher_card(ArrayList<card> player_array, card previous_player_card, card secoumf_previous_card) {
        card c = null;
        for (int i = 0; i < player_array.size(); i++) {
            if (player_array.get(i).getRank() > previous_player_card.getRank() && player_array.get(i).getRank() > secoumf_previous_card.getRank() && player_array.get(i).getCardType().equals(card_type_each_lotsh)) {
                c = player_array.get(i);
                break;
            }
        }
        return c;
    }

    public card get_highest_card_Same_type(ArrayList<card> player_array) {
        card c = null;
        for (int i = 0; i < player_array.size(); i++) {
            if (player_array.get(i).getCardType().equals(card_type_each_lotsh)) {
                c = player_array.get(i);
                break;
            }
        }
        if (c != null) {
            for (int i = 0; i < player_array.size(); i++) {
                if (player_array.get(i).getRank() > c.getRank() && player_array.get(i).getCardType().equals(card_type_each_lotsh)) {
                    c = player_array.get(i);
                }
            }
        }
        return c;
    }

    public boolean Is_Out_Of_Color(ArrayList<card> player_array) {
        boolean Is_Out = true;
        for (int i = 0; i < player_array.size(); i++) {
            if (player_array.get(i).getCardType().equals(card_type_each_lotsh)) {
                Is_Out = false;
                break;
            }
        }
        return Is_Out;
    }

    public boolean Is_Out_Of_tarneb(ArrayList<card> player_array) {
        boolean Is_Out = true;
        for (int i = 0; i < player_array.size(); i++) {
            if (player_array.get(i).getCardType().equals(tarneb)) {
                Is_Out = false;
                break;
            }
        }
        return Is_Out;
    }

    public card get_highest_tarneba(ArrayList<card> arrayList) {
        card c = null;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getCardType().equals(tarneb)) {
                c = arrayList.get(i);
                break;
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getRank() > c.getRank()) {
                c = arrayList.get(i);
            }
        }
        return c;
    }

    public card get_higher_tarneba(ArrayList<card> arrayList, card previous_player_card, card secoumf_previous_card) {
        card c = null;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getCardType().equals(tarneb) && arrayList.get(i).getRank() > previous_player_card.getRank() && arrayList.get(i).getRank() > secoumf_previous_card.getRank()) {
                c = arrayList.get(i);
                break;
            }
        }
        return c;
    }

    public card get_smallest_tarneba(ArrayList<card> arrayList) {
        card c = null;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getCardType().equals(tarneb)) {
                c = arrayList.get(i);
                break;
            }
        }
        return c;
    }

    public card get_smallest_card(ArrayList<card> player_array) {
        card c = player_array.get(0);
        for (int i = 1; i < player_array.size(); i++) {
            if (c.getRank() > player_array.get(i).getRank()) {
                c = player_array.get(i);
            }
        }
        return c;
    }

    public card get_smallest_Rank_same_Type(ArrayList<card> player_array) {// if who ate want to play
        card c = null;// here we will check if user have the same card type if not we will go through another metohde
        for (int i = 0; i < player_array.size(); i++) {
            if (player_array.get(i).getCardType().equals(card_type_each_lotsh)) {
                c = player_array.get(i);
                break;
            }
        }
        return c;
    }

    public boolean Is_makel(card card) {
        boolean is_makel = true;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getCardType().equals(card.getCardType())) {
                if (arrayList.get(i).getRank() <= card.getRank()) {
                    is_makel = true;
                } else {
                    is_makel = false;
                    break;
                }
            }
        }
        return is_makel;
    }

    public int ChenckCardsForTalba(ArrayList<card> ar) {
        int clubs = 0, spade = 0, hearts = 0, dimonds = 0, talba = 0;
        for (card ar1 : ar) {
            switch (ar1.getCardType()) {
                case "Clubs":
                    ++clubs;
                    break;
                case "Spade":
                    ++spade;
                    break;
                case "Hearts":
                    ++hearts;
                    break;
                case "Dimonds":
                    ++dimonds;
                    break;
            }
        }
        if (clubs == 5) {
            talba = 7;
            tarneb = "Clubs";
        } else if (spade == 5) {
            talba = 7;
            tarneb = "Spade";
        } else if (hearts == 5) {
            talba = 7;
            tarneb = "Hearts";
        } else if (dimonds == 5) {
            talba = 7;
            tarneb = "Dimonds";
        }/////////////////////////////
        if (clubs == 6 || clubs == 7) {
            talba = 8;
            tarneb = "Clubs";
        } else if (spade == 6 || spade == 7) {
            talba = 8;
            tarneb = "Spade";
        } else if (hearts == 6 || hearts == 7) {
            talba = 8;
            tarneb = "Hearts";
        } else if (dimonds == 6 || dimonds == 7) {
            talba = 8;
            tarneb = "Dimonds";
        }/////////////////////////////
        if (clubs == 8) {
            talba = 9;
            tarneb = "Clubs";
        } else if (spade == 8) {
            talba = 9;
            tarneb = "Spade";
        } else if (hearts == 8) {
            talba = 9;
            tarneb = "Hearts";
        } else if (dimonds == 8) {
            talba = 9;
            tarneb = "Dimonds";
        }/////////////////////////////
        if (clubs == 9) {
            talba = 10;
            tarneb = "Clubs";
        } else if (spade == 9) {
            talba = 10;
            tarneb = "Spade";
        } else if (hearts == 9) {
            talba = 10;
            tarneb = "Hearts";
        } else if (dimonds == 9) {
            talba = 10;
            tarneb = "Dimonds";
        }/////////////////////////////
        if (clubs == 10 || clubs == 11) {
            talba = 11;
            tarneb = "Clubs";
        } else if (spade == 10 || spade == 11) {
            talba = 11;
            tarneb = "Spade";
        } else if (hearts == 10 || hearts == 11) {
            talba = 11;
            tarneb = "Hearts";
        } else if (dimonds == 10 || dimonds == 10) {
            talba = 11;
            tarneb = "Dimonds";
        }
        return talba;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (Is_AllowedToPlay) {
            for (int i = 0; i < 13; i++) {
                if (e.getSource() == p[i]) {
                    jLabels[0].setIcon(player1.get(i).geticon());
                    CardSelected = i;
                    break;
                }
            }
            if (e.getSource() == jLabels[0]) {
                try {
                    p[CardSelected].setVisible(false);
                    p[CardSelected] = null;
                    jLabels[0].setIcon(null);
                    jLabels[15].setIcon(player1.get(CardSelected).geticon());
                    c1 = player1.get(CardSelected);
                    player_playing = 0;// To let player 1 starts playing
                    ++num_ofPlayer_played;
                    if (num_ofPlayer_played == 4) {
                        if (ltosh == 12) {
                            ++talba_turn;
                            last_clicked(true);
                            set_Text_For_Winner_Team();
                        } else {
                            last_clicked(false);
                        }
                    } else if (num_ofPlayer_played == 1) {
                        card_type_each_lotsh = c1.getCardType();
                        Start_Playing(0);
                    } else {
                        Start_Playing(0);
                    }
                } catch (Exception ex) {

                }
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == newgame) {
            newgame.setFont(new java.awt.Font("Tahoma", 0, 20));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == newgame) {
            newgame.setFont(new java.awt.Font("Tahoma", 0, 16));
        }
    }
}
