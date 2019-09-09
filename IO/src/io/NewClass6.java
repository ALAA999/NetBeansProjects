
import java.util.logging.Level;
import java.util.logging.Logger;

 class NewClass6 {
   public static void main(String[] args) {
       
           System.err.println("alaa");
           System.out.println("aldeab");
           System.err.println("zzzz");
           try {
           Thread.sleep(3000);
           throw new NullPointerException("allosh");
       } catch (InterruptedException ex) {
           Logger.getLogger(NewClass6.class.getName()).log(Level.SEVERE, null, ex);
       }
}
 
}
