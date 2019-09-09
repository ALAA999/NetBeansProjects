
 class NewClass55 extends Thread{
    public  void run(){
       
           if(Thread.interrupted()){
                System.out.println("ss");
           }
           System.out.println("sssss"+Thread.currentThread().getName());
    }
}


class MMAIN5{
    public static void main(String[] args) {
        NewClass55 n = new NewClass55();
        NewClass55 n2 = new NewClass55();
        n.start();
        n.interrupt();
        n2.start();
        
    }
}
