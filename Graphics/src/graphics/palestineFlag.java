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
public class palestineFlag extends JFrame {

    public palestineFlag() {
        setLayout(null);
        setSize(500, 500);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawLine(100, 450, 100, 250);
        g.setColor(Color.green);
        g.fillPolygon(new int[]{100, 400, 400, 150}, new int[]{175, 175, 225, 225}, 4);
        g.setColor(Color.black);
        g.fillPolygon(new int[]{150, 400, 400, 100}, new int[]{275, 275, 325, 325}, 4);
        g.setColor(Color.white);
        g.fillPolygon(new int[]{150, 400, 400, 150}, new int[]{225, 225, 275, 275}, 4);
        g.setColor(Color.red);
        g.fillPolygon(new int[]{100, 200, 100}, new int[]{175, 250, 325}, 3);
    }

    public static void main(String[] args) {
        new palestineFlag();
    }
}
