
import java.util.logging.Level;
import java.util.logging.Logger;


public class ThreadInOnClass extends Thread{
    public static void main(String[] args) {
        ThreadInOnClass newClass  = new ThreadInOnClass();
        ThreadInOnClass newClass2  = new ThreadInOnClass();
        newClass.start();
        newClass2.start();
    }
    public void run(){
        for (int i = 0; i < 10; i++) {
           try {
               Thread.sleep(1000);
           } catch (InterruptedException ex) {
               Logger.getLogger(LoopTry.class.getName()).log(Level.SEVERE, null, ex);
           }
           System.out.println(i+Thread.currentThread().getName());
       }
    }
}
