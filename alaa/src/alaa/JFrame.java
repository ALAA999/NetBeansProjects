import javax.swing.*;
class JFram{
    public static void main(String[] args) {
        JFrame F = new JFrame();
        JFrame F2 = new JFrame();
        JPanel P = new JPanel();
        
        JCheckBox B = new JCheckBox("OK");
        JLabel L = new JLabel("Enter your name:");
        JRadioButton G= new JRadioButton("WTF");
        
        P.add(B);
        P.add(G);
        P.add(L);
        F.add(P);
        F2.add(P);
        
        F.setTitle("Allosh");
        F.setSize(400,200);
        F.setLocation(500,100);
        F.setDefaultCloseOperation(F.EXIT_ON_CLOSE);
        F.setVisible(true);
        F2.setTitle("jave");
        F2.setLocation(1000,100);
        F2.setSize(400,200);
        F2.setVisible(true);
        F2.setDefaultCloseOperation(F2.EXIT_ON_CLOSE);
        
    }
}