
import java.util.logging.Level;
import java.util.logging.Logger;

class NewClass1 extends Thread {

    public void run() {
        throw new UnsupportedOperationException("not supported yet");
    }

}

class s {

    public static void main(String[] args) {
       try {
            NewClass1 n = new NewClass1();
            

            Runtime r = Runtime.getRuntime();
            r.addShutdownHook(new NewClass1());    /*المقصود بها اي كود تريد تنفذها قبل الانها*/

          Thread.sleep(2000);
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
        
    }
}
