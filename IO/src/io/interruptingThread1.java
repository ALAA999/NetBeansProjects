
 class interruptingThread1 extends Thread{
  public void run(){
      try {
          Thread.sleep(5000);
      } catch (InterruptedException ex) {
           System.out.println("InterruptedException");
      }
      System.out.println("Thread is running...");
  }  
}

class mAin {
    public static void main(String[] args) {
      interruptingThread1 t = new interruptingThread1();
      t.start();
      /*    اللي بصير انه الثريد اشتغل ثم وضع في حالة سليب ثم انت صحيته من السليب عن طريق كلمة    لكن ضل الثريد شغال بعد تراي كاتش بلوك  اما لما ما يكون في سليب او ويتنج وعملت انتربت كانك عملت للثريد اشارة فقط interrupt*/
      t.interrupt();
    }
}
