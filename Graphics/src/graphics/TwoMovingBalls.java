/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author Alaa
 */
public class TwoMovingBalls extends JFrame {

    int x1 = 10, y1 = 250, x2 = 490, y2 = 250;

    public TwoMovingBalls() {
        setSize(500, 500);
        setVisible(true);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.red);
        g.fillOval(x1, y1, 20, 20);
        g.setColor(Color.black);
        g.fillOval(x2, y2, 20, 20);
        if (x1 >= 9 && x1 <= 250 &&  y1 <= 251 && y1 >= 10) {
             ++x1;
            --y1;
            --x2;
            --y2;
        } else if (x1 >= 250 && x1 <= 490 && y1 >= 9 && y1 <= 250) {
            ++x1;
            ++y1;
            --x2;
            ++y2;
        }else if (x1 <= 491 && x1 >= 250 && y1 >= 249 && y1 <= 490) {
            --x1;
            ++y1;
            ++x2;
            ++y2;
        }else if (x1 >= 10 && x1 <= 251 && y1 <= 491 && y1 >= 250) {
            --x1;
            --y1;
            ++x2;
            --y2;
        }
        System.out.println("x1: " + x1 + " x2: " + x2 +" y1: " + y1 + " y2: " + y2);
        try {
            Thread.sleep(1);
        } catch (InterruptedException ex) {
        }
        repaint();
    }

    public static void main(String[] args) {
        new TwoMovingBalls();
    }
}
