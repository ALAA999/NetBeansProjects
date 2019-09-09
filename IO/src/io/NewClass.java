
import java.util.logging.Level;
import java.util.logging.Logger;

/*
class NewClass extends Thread {
   public static void main(String[] args) {
   for(int i = 0; i < 10; i++) {
       try {
           Thread.sleep(500);
       } catch (InterruptedException ex) {
          
       }
               System.out.println(i);
           }
       
}
 
}*/
class mani extends Thread{
    
    public void run(){
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
            if(Thread.currentThread().isDaemon()){
                System.out.println("Demaon name is: "+Thread.currentThread().getName()+"  "+i);
            System.out.println("Demaon Id is: "+Thread.currentThread().getId());
            System.out.println("Demaon prioraty is: "+Thread.currentThread().getPriority());
            }else
            System.out.println("Thread name is: "+Thread.currentThread().getName()+"  "+i);
            System.out.println("Thread Id is: "+Thread.currentThread().getId());
            System.out.println("Thread prioraty is: "+Thread.currentThread().getPriority());
        }
    }
    
    public static void main(String[] args) {
        mani m1 = new mani();
        mani m2 = new mani();
        mani m3 = new mani();
        
        m1.setName("Allosh");
        m2.setName("Khaled");
        m3.setName("zed");
        
        m1.setPriority(1);
        m2.setPriority(5);
        m3.setPriority(10);
        
     /*   m1.setDaemon(true);*/
        
        m1.start();
        m2.start();
        m3.start();
    }
}



