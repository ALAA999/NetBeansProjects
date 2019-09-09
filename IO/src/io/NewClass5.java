
import java.util.logging.Level;
import java.util.logging.Logger;

 class NewClass5 {
    public synchronized void rune(){
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(500);
                System.out.println(i);
            } catch (InterruptedException ex) {
                System.out.println("");
            }
        }
    }
}


class MMAIN{
    public static void main(String[] args) {
        NewClass5 n = new NewClass5();
        ssssssss s = new ssssssss(n);
        sssssssss s1 = new sssssssss(n);
        s.start();
        s1.start();
        s.interrupt();
    }
}

class ssssssss extends Thread{
    NewClass5 m;
    ssssssss(NewClass5 n){
        this.m = n;
    }
    public void run(){
      m.rune();
    }
}

class sssssssss extends Thread{
    NewClass5 m;
    sssssssss(NewClass5 n){
        this.m = n;
    }
    public void run(){
      m.rune();
    }
}