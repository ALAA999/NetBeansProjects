
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Whatthefuck extends Thread {

    private String name;

    Whatthefuck(String name) {
        super();
        this.name = name;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " Start named = " + name);
        m();
        System.out.println(Thread.currentThread().getName() + " full ");
    }

    public void m() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
    }

}

class Man1 {

    public static void main(String[] args) {
        ExecutorService e = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 10; i++) {
            Whatthefuck t = new Whatthefuck(" " + i);
            e.execute(t);
        }
       e.shutdown();
        while (!e.isTerminated()) {
        }
        System.out.println("Done!");
    }
}
