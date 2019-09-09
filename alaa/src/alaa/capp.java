import java.util.*;
import static jdk.nashorn.tools.ShellFunctions.input;
class STD{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
         int fo = 1,i,k;
        String a[] = new String[10];
        int t[] = new int[10];
         int p[] = new int[10];  
        for( i=0;i<fo;++i){
        System.out.println("Enter the name of std"+(i+1));
        a[i] = input.next();
            System.out.println("Enter his ID: ");
            t[i]=input.nextInt();
            System.out.println("Enter his avg: ");
            p[i] = input.nextInt();
            System.out.println("<1>if you want to add another!? ");
            int u = input.nextInt();
            if(u==1)
                ++fo;}
        int of=1;
        for( k=0;k<of;++k){
        System.out.println("1.show the max avarage.\n\t5.show the min avarage.");
        System.out.println("\n\f\f\fChoose a number,please!");
        int c = input.nextInt();
        if(c==1){
               max(p,a);}
            else 
            if(c==5){
                min(p,a);
            }
        System.out.println("<2>if you want to countine?");
        int Y = input.nextInt();
        if(Y==2)
    ++of;}
            }
    
      public static void max(int w[],String h[]){
      int maxe = w[0];
for(int i=0;i<w.length;++i){
if(w[i]>maxe)
maxe = w[i];}
System.out.println("The max avg is: "+maxe);
      }
       public static void min(int u[],String g[]){
      int mine = u[0];
for(int i=0;i<u.length;++i){
if(u[i]<mine)
 u[i]=mine;}
System.out.println("The min avg is: "+mine);
      }
}
