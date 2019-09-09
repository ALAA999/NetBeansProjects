
class real {

     synchronized static void print(int n) {
        for (int i = 0; i < 5; i++) {
            System.out.println(n * i+"\t"+Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {

            }

        }
    }
}

class Main1 {

    public static void main(String[] args) {
        t2 a = new t2();
        t3 a1 = new t3();
        t4 a2 = new t4();
        t5 a3 = new t5();
        a.setName("Alaa");
        a1.setName("momo");
        a2.setName("abood");
        a3.setName("hamood");
        a.start();
        a1.start();
        a2.start();
        a3.start();

    }
}

class t2 extends Thread {

   /* real s;

    t2(real s) {
        this.s = s;
    }*/

    public void run() {
        real.print(100);
    }
}

class t3 extends Thread {

   /* real s;

    t3(real s) {
        this.s = s;
    }*/

    public void run() {
      /*  real t = new real();/*ما بنفع تكتب الاوبجكت للي رايح عليه لانه قبل ما يقرا الاوبجكت حيكون عمل ثريد للدالتين فحينفذ التنتين سوا*/
        real.print(10);
    }
}
 class t4 extends Thread{
     public void run(){
         real.print(1000);
     }
 }

class t5 extends Thread{
     public void run(){
         real.print(10000);
     }
 }