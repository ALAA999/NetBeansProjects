class Threadsleepgetsetname extends Thread {

    public static void main(String[] args) {
        Threadsleepgetsetname s1 = new Threadsleepgetsetname();
        Threadsleepgetsetname s2 = new Threadsleepgetsetname();
        s1.setName("Allosh");
        System.out.println(s1.getName());
        System.out.println("S1 ID is: "+s1.getId());
        System.out.println("S2 ID is: "+s2.getId());
        s1.start();
        s2.start();
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(500);
                System.out.println(i);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }
}
