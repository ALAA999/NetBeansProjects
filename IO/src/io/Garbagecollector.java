/*class Garbagecollector {
 @Override
 public void finalize(){
 System.out.println("Finalize");
 }
   
   
 public static void main(String[] args) {
 Garbagecollector g = new Garbagecollector();
 Garbagecollector g2 = new Garbagecollector();
   
 g = null;
 g2 = null;
 System.gc();
   
 }
 }*/
/*class Run {
 static Runnable r1 = new Runnable() {

 public void run() {
 System.out.println("1");
 }
 };
    
 static  Runnable r2 = new Runnable() {

 public void run() {
 System.out.println("2");
 }
 };
 static  Runnable r3 = new Runnable() {

 public void run() {
 System.out.println("3");
 }
 };
    
    
 public static void main(String[] args) {
 Thread s1 = new Thread(r1);  
 Thread s2 = new Thread(r2); 
 Thread s3 = new Thread(r3); 
     
       
 s1.start();
 s2.start();
 s3.start();
 }
 }*/

class a extends Thread {

    public void run() {
        System.out.println("1");
    }
}

class b extends Thread {

    public void run() {
        System.out.println("2");
    }
}

class c extends Thread {

    public void run() {
        System.out.println("3");
    }
}

class ma{
    public static void main(String[] args) {
        a e1 = new a();
        b e2 = new b();
        c e3 = new c();
        
        e1.start();
        e2.start();
        e3.start();
    }
}