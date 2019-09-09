/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author Alaa
 */
public class drawOval extends JFrame {

    @Override
    public void paint(Graphics g) {
        g.drawOval(10, 30, 100, 100);
        g.drawOval(390, 30, 100, 100);
        g.drawOval(200, 200, 100, 100);
        g.drawOval(10, 390, 100, 100);
        g.drawOval(390, 390, 100, 100);
    }

    public drawOval() {
        setSize(500, 500);
        setVisible(true);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new drawOval();
    }
}
