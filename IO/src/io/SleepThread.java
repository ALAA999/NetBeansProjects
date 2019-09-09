
class SleepThread extends Thread{
   /* public void run(){
        for(int i = 1; i <= 10; i++) {
            try{
                Thread.sleep(500);
            }catch(Exception e){
                e.printStackTrace();
            }
                System.out.println(i+"  "+Thread.currentThread().getName());
            }
       
    }*/
    public static void main(String[] args) {
    SleepThread s = new SleepThread();
    SleepThread s1 = new SleepThread();
  /*  s.run();*/         /*لما تعملها رن عادي بتعامل معها كانها اوبجكت عادي اما لما ستارت هنا بتظهر فائدة الثريد*/
    /*s1.run();*/
    s.start();
      /*  try {
            s.join(300);
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }*/
    s1.start();  
   /* System.out.println("alaa");*/
}
     public void run(){
         System.out.println("allosh");
          try{
                Thread.sleep(5000); 
                  System.out.println("zed");/*اللي بصير انه عاي الدالة بتوقف العمل لمدة معينة وبعدها بتكمل*/
            }catch(Exception e){
                e.printStackTrace();
            }
          System.out.println("zed");
     }
 /*public void run(){
        for(int i = 1; i <= 10; i++) {
            try{
                Thread.sleep(500);
            }catch(Exception e){
                e.printStackTrace();
            }
                System.out.println(i+"  "+Thread.currentThread().getName());
                           }
}*/
}
 
