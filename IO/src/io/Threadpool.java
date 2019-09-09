
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool implements Runnable {

    private String name;

    ThreadPool(String name) {
        super();
        this.name = name;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " Start name = " + name);
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

class Man {

    public static void main(String[] args) {
        ExecutorService e = Executors.newFixedThreadPool(4);

        for (int i = 0; i < 10; i++) {
            Runnable t = new ThreadPool(" " + i);
            e.execute(t);
        }
       e.shutdown();
        while (!e.isTerminated()) {
        }
        System.out.println("Done!");
    }
}
