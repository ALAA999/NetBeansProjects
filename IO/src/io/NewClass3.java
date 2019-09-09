
import java.util.logging.Level;
import java.util.logging.Logger;

 class NewClass3 {
   public static void main(String[] args) {
   A1 a = new A1();
   A1 a1 = new A1();
   a.setName("ALLOSH");
   a1.setName("MOMO");
   a.start();
   a1.start();
}
 
}

class A1 extends Thread{
    
    public void run(){
        cc.printt();
} 
}

class cc{
    public static synchronized void printt(){
       try {
            System.out.println("aaaa       "+Thread.currentThread().getName());
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(A1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}