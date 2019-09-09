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
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author Alaa
 */
public class Symmetric extends JFrame implements ActionListener {

    Timer timer;
    int x, y, r = 100, xc = 250, yc = 250, a = 0;

    public Symmetric() {
        timer = new Timer(200, this);
        timer.start();
        setSize(500, 500);
        setVisible(true);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawLine(0, yc, 499, yc);
        g.drawLine(xc, 0, xc, 499);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        a++;
        if (a <= 45) {
            x = (int) Math.round(r * Math.cos(a * Math.PI / 180));
            y = (int) Math.round(r * Math.sin(a * Math.PI / 180));
            getGraphics().setColor(Color.red);
            getGraphics().drawLine(xc + x, yc + y, xc + x, yc + y);
            getGraphics().setColor(Color.BLUE);
            getGraphics().drawLine(xc + x, yc - y, xc + x, yc - y);
            getGraphics().setColor(Color.black);
            getGraphics().drawLine(xc + y, yc + x, xc + y, yc + x);
            getGraphics().setColor(Color.GREEN);
            getGraphics().drawLine(xc - y, yc + x, xc - y, yc + x);
            getGraphics().setColor(Color.CYAN);
            getGraphics().drawLine(xc - x, yc + y, xc - x, yc + y);
            getGraphics().setColor(Color.magenta);
            getGraphics().drawLine(xc - x, yc - y, xc - x, yc - y);
            getGraphics().setColor(Color.PINK);
            getGraphics().drawLine(xc - y, yc - x, xc - y, yc - x);
            getGraphics().setColor(Color.yellow);
            getGraphics().drawLine(xc + y, yc - x, xc + y, yc - x);
        }
    }
    public static void main(String[] args) {
        new Symmetric();
    }
}
