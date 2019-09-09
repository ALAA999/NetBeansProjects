/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

import java.awt.BasicStroke;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Alaa
 */
public class drawRect extends JFrame {

    JButton btChangeColor;
    int r, g, b;

    public drawRect() {
        btChangeColor = new JButton("Change Color");
        btChangeColor.setBounds(0, 0, 150, 50);
        add(btChangeColor);
        btChangeColor.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Random random = new Random();
                r = random.nextInt(255);
                g = random.nextInt(255);
                b = random.nextInt(255);
                repaint();
            }
        });
        setLayout(null);
        setSize(400, 400);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics graphics) {
        /*  g.drawLine(50, 50, 150, 50);
         g.drawLine(50, 150, 150, 150);
         g.drawLine(50, 50, 50, 150);
         g.drawLine(150, 50, 150, 150); // This will draw a rect
         super.paint(g);*/
        graphics.setColor(new Color(r, g, b));
        Graphics2D g2 = (Graphics2D) graphics;
        g2.setStroke(new BasicStroke(10));
        g2.drawRect(150, 150, 100, 100); // This will draw the same rect like above
    }

    public static void main(String[] args) {
        new drawRect().setVisible(true);
    }
}
