
class testing {

    public static void main(String[] args) {
        n t = new n();
        secound s = new secound(t);
        s.start();
    }
}

class secound extends Thread {

    n s;

    secound(n t) {
        this.s = t;
    }

    public void run() {
        s.rune();
    }
}

class n {

    public void rune() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }
}
