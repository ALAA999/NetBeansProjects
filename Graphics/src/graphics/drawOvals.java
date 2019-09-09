/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

import java.awt.Graphics;
import javax.swing.JFrame;
import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alaa
 */
public class drawOvals extends JFrame {

    public drawOvals() {
        setLayout(null);
        setSize(400, 400);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
         for (int i = 10; i <= 150; i = i + 10) {
             try {
                 g.drawOval(200 - i, 200 - i, 2 * i, 2 * i);
                 Thread.sleep(100);
             } catch (InterruptedException ex) {
                 Logger.getLogger(drawOvals.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
         for (int i = 150; i >= 0; i = i - 5) {
             try {
                 g.drawOval(200 - i, 200 - i, 2 * i, 2 * i);
                 Thread.sleep(100);
             } catch (InterruptedException ex) {
                 Logger.getLogger(drawOvals.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
    }

    public static void main(String[] args) {
        new drawOvals();
    }
}
