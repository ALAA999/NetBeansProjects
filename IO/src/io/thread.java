
/*class thread extends Thread {

 public void run() {
 System.out.println("Allosh");
 }

 public static void main(String[] args) {
 thread t = new thread();
 t.run();
 }
 }*/
class thread implements Runnable {

    @Override
    public void run() {
        System.out.println("Allosh zeb");
    }

    public static void main(String[] args) {
    /*    thread r = new thread(); /*  /*هاي الطريقة او اللي تحت نفسها*/

        Thread r1 = new Thread(new thread());/*او بنع تكتب في القوسين هذا     Thread r1 = new Thread(r);      */  
        r1.start();
    }
}
/*class main implements Runnable{

 public void run() {
 System.out.println("First task");
 }
 }

 class first extends Thread {

 public static void main(String[] args) {
 main m = new main();
 Thread t = new Thread(m); 
 Thread t2 = new Thread(m);
 Thread t3 = new Thread(m);
 t.start();
 t2.start();
 /* t3.start();*//*لاحظ انه الان رح تتوضح مفهوم الثريد اكثر انه الثريد وظيفتها نفس وظيفة الكود اللي رح ينكتب تحت*/

/*}
 }*/

/*class A {
 public void run(){
 System.out.println("First task");
 }
 }

 class B {
 public void run(){
 System.out.println("First task");
 }
 }

 class C {
 public void run(){
 System.out.println("First task");
 }
 }

 class main{
 public static void main(String[] args) {
 A t1 = new A();
 B t2 = new B();
 C t3 = new C();
 t1.run();
 t2.run();
 t3.run();
        
 }
 }
 */

/*class A extends Thread{
 public void run(){
 System.out.println("First task");
 }
 }

 class B extends Thread{
 public void run(){
 System.out.println("Secound task");
 }
 }

 class C extends Thread{
 public void run(){
 System.out.println("Third task");
 }
 }

 class main{
 public static void main(String[] args) {
 A t1 = new A();
 B t2 = new B();
 C t3 = new C();
 t1.start();
 t2.start();
 t3.start();
        
 }
 }*/

/*abstract class T2 implements Runnable{
 public static void main(String[] args) {
        
    
 Runnable t1 = new Runnable(){
 public void run(){
 System.out.println("Task 1");
 }
 };
    
 Runnable t2 = new Runnable(){
 public void run(){
 System.out.println("Task 2");
 }
 };
     
 Runnable t3 = new Runnable(){
 public void run(){
 System.out.println("Task 3");
 }
 };
      
 Thread s1 = new Thread(t1);*//*دائما بتحط ال انترفيس جوا ال الثريد*/
     /* Thread s2 = new Thread(t2);
      Thread s3 = new Thread(t3);
      
      
      s1.start();
      s2.start();
      s3.start();
    }

}*/
