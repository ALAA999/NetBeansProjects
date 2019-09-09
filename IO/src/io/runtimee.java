
import java.io.IOException;

class totlamemory{
    public static void main(String[] args) {
        System.out.println("Total memory is: "+Runtime.getRuntime().totalMemory());
        /*Runtime m = Runtime.getRuntime();       S.o.p("Total memory is: "+m.totalMemory()); نفس الشغلة*/
        System.out.println("free memory is: "+Runtime.getRuntime().freeMemory());
        System.out.println("max memory is: "+Runtime.getRuntime().maxMemory());
  
        
        for (int i = 0; i < 10000; i++) {
            new totlamemory();
        }
        System.out.println("free memory after the loop: "+Runtime.getRuntime().freeMemory());
        System.gc();/*حذفت كل الاوبجكتس اللي كانت تشتغل*/
        System.out.println("free memory after Garbage collection: "+Runtime.getRuntime().freeMemory());
}
}
