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
public class PolygonAndPolyline extends JFrame{
    public PolygonAndPolyline(){
         setLayout(null);
        setSize(500, 500);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        //int x[] = {100,200,100,200};
        //int y[] = {100,100,150,150};
        
        int x[] = {100,200,200,100, 150};
        int y[] = {100,100,200,200, 150};
        g.setColor(new Color(100, 59, 255));
        g.fillPolygon(x,y,5);
        
    }
    
    public static void main(String[] args) {
        new PolygonAndPolyline();
    }
}
