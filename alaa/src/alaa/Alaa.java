
import java.util.Scanner;

//import java.awt.event.KeyEvent;
//import java.awt.event.KeyListener;
//import javax.swing.*;
//class a implements KeyListener{
//    public static void main(String[] args) {
//        JFrame F =new JFrame();
//        JPanel P =new JPanel();
//        
//        JCheckBox B=new JCheckBox("OK");
//        JButton b=new JButton("Cancel");
//        JLabel L=new JLabel("Chose the color");
//        JRadioButton R=new JRadioButton("Red");
//        P.add(B);
//        P.add(b);
//        P.add(L);
//        P.add(R);
//        System.out.println("");
//        F.add(P);
//        
//        F.setTitle("Allosh");
//        F.setSize(400,200);
//        F.setLocation(500,100);
//        F.setDefaultCloseOperation(F.EXIT_ON_CLOSE);
//        F.setVisible(true);
//    }
//
//    @Override
//    public void keyTyped(KeyEvent e) {
//    }
//
//    @Override
//    public void keyPressed(KeyEvent e) {
//         if(e.getKeyCode() == KeyEvent.VK_ENTER){
//            System.out.println("sssa");
//        }
//    }
//
//    @Override
//    public void keyReleased(KeyEvent e) {
//        if(e.getKeyCode() == KeyEvent.VK_ENTER){
//            System.out.println("sssa");
//        }
//    }
////}
class a{
    public static void main(String[] args) {
        System.out.println(sum(2,5));
    }
    static int sum(int n, int m){
        if(n == m ){
            return n;}
            else{
                    return  n + sum(n+1,m);
                    }
        }
    }
//class factor {
//
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int fo = 1;
//        int num;
//        for (int i = 0; i < fo; i++) {
//            System.out.println("Enter the number: ");
//            num = s.nextInt();
//            if (num == 0 || num == -1) {
//                System.exit(0);
//            } else {
//                System.out.println(num / 2);
//                ++fo;
//            }
//        }
//    }
//}
