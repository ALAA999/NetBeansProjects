/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Alaa
 */
public class palestineCircle extends JFrame {

    public palestineCircle() {
        setLayout(null);
        setSize(500, 500);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawOval(50, 50, 200, 200);
        g.setColor(Color.green);
        g.fillPolygon(new int[]{250, 225, 225}, new int[]{100, 150, 300}, 3);
        g.setColor(Color.black);
        g.fillPolygon(new int[]{150, 150}, new int[]{150, 300}, 2);
        g.setColor(Color.white);
        g.fillPolygon(new int[]{150, 150, 225, 225}, new int[]{150, 300, 300, 150}, 4);
        g.setColor(Color.red);
        g.fillPolygon(new int[]{100, 200, 250}, new int[]{100, 250, 100}, 3);
    }

    public static void main(String[] args) {
        new palestineCircle();
    }
}
