

import javax.swing.JOptionPane;

class JavaApplication1 {

  
    public static void main(String[] args) {
      
     String s=JOptionPane.showInputDialog("Enter your Name: ");
   String e=JOptionPane.showInputDialog("Enter your Password: ");
   String w=JOptionPane.showInputDialog("Sure your Password: "); 
   int q=Integer.parseInt(e);
   int d=Integer.parseInt(w);
   if(q==d)
   { JOptionPane.showMessageDialog(null,"Your Name is:   "+s+"\nYour Password is:   "+e);}
    else  
   {JOptionPane.showMessageDialog(null,"Rewite the Password !");
    }
    
}
}