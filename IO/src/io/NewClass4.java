
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 class NewClass33 {
 public static void main(String[] args) {
 AB1 a = new AB1();
 AB2 a1 = new AB2();
 a.setName("ALLOSH");
 a1.setName("MOMO");
 a.start();
 a1.start();
 }
 
 }

 class AB1 extends Thread{
 ccc c1 = new ccc();
 public void run(){
 c1.printt();
 }          */                 /*this way is not allowed*/
/*}
 class AB2 extends Thread{
 ccc c1 = new ccc();
 public void run(){
 c1.printt();
 }
 }

 class ccc{
 public  synchronized void printt(){
 try {
 System.out.println("aaaa       "+Thread.currentThread().getName());
 Thread.sleep(1000);
 } catch (InterruptedException ex) {
 Logger.getLogger(A1.class.getName()).log(Level.SEVERE, null, ex);
 }
 }
 }*/


class NewClass33 {

    public static void main(String[] args) {
        ccc n = new ccc();
        AB1 a = new AB1(n);
        ABC a1 = new ABC(n);
        a.setName("ALLOSH");
        a1.setName("MOMO");
        a.start();
        a1.start();
    }

}

class AB1 extends Thread {

    ccc n;

    AB1(ccc n) {
        this.n = n;
    }

    public void run() {
        n.printt();
    }
}

class ABC extends Thread {

    ccc n;

    ABC(ccc n) {
        this.n = n;
    }

    public void run() {
        n.printt();
    }
}

class ccc {

    public void printt() {

        synchronized (this) {
            try {
                System.out.println("aaaa       " + Thread.currentThread().getName());
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(A1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
