
import java.util.logging.Level;
import java.util.logging.Logger;


public class Threadgroup {

    public static void main(String[] args) {
        Group g = new Group();
        g.func();
    }

}

class Group extends Thread{

    public void func() {
        try {
            ThreadGroup pg = new ThreadGroup("Parent group");
            ThreadGroup cg = new ThreadGroup(pg, "Child group");  /*احنا هنا ضفنا الابو للولد*/
            Thread t1 = new Thread(pg,this);
            t1.setPriority(MAX_PRIORITY-2);
            System.out.println("Starting "+t1.getName());
            t1.start();
            
            
            Thread t2 = new Thread(cg,this);
            t2.setPriority(NORM_PRIORITY-2);
            System.out.println("Starting "+t2.getName());
            t2.start();
            
            t1.join();
            t2.join();   /*it stoppes Thread from working*/
            
            System.out.println("Active Threads are: "+pg.activeCount());
            
            
            cg.destroy();
            System.out.println(cg.getName()+" Destroyed");
            pg.destroy();
            System.out.println(pg.getName()+" Destroyed");
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
        
        

    }

    public void run() {
        System.out.println(Thread.currentThread().getName()+" Finished Exuecuting!"+" "+Thread.currentThread().getPriority());
    }
}
