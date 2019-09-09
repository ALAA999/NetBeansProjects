
/*class testing2 extends Thread {

    public static void main(String[] args) {

        rethread r = new rethread();
        t y = new t(r);
        t2 y1 = new t2(r);
        y.start();
        y1.start();

    }
}

class rethread {

    public synchronized void runes() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }
}

class t extends Thread {

    rethread r;

    t(rethread s) {
        this.r = s;
    }

    public void run() {
        r.runes();
    }
}

class t2 extends Thread {

    rethread r;

    t2(rethread s) {
        this.r = s;
    }

    public void run() {
        r.runes();
    }
}
*/
class mai{
    public static void main(String[] args) {
        ru r = new ru();
        r.start();
    }
}
class ru extends Thread{
    public void run(){
       for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        } 
    }
}