/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author Alaa
 */
public class drawArc extends JFrame{
   public drawArc(){
        setLayout(null);
        setSize(500, 500);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
   }

    @Override
    public void paint(Graphics g) {
        super.paint(g); 
        g.setColor(new Color(255, 100, 100));
        g.drawRect(100, 100, 300, 300);
        g.drawArc(50, 50, 100, 100, 270, 90);
        g.drawArc(350, 50, 100, 100, 180, 90);
        g.drawArc(350, 350, 100, 100, 90, 90);
        g.drawArc(50, 350, 100, 100, 0, 90);
    }
   
    public static void main(String[] args) {
        new drawArc();
    }
}
