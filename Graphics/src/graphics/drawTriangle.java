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
public class drawTriangle extends JFrame {

    public drawTriangle() {
        setLayout(null);
        setSize(500, 500);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        drawT(200, 100, 150, g);
        drawT(50, 50, 80, g);
    }

    public void drawT(int x, int y, int l, Graphics g){
        int x1 = (int) Math.round(x - 0.5 * l);
        int x2 = (int) Math.round(x + 0.5 * l);
        int y1 = (int) Math.round(y + (Math.sqrt(3)* l/ 2));
        int y2 = (int) y1;
        g.drawLine(x, y, x1, y1);
        g.drawLine(x, y, x2, y2);
        g.drawLine(x1, y1, x2, y2);
    }
    
    public static void main(String[] args) {
        new drawTriangle();
    }
}
