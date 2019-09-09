
import java.util.*;

class tsS {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        game g = new game();
            for (int i = 0; i < 3; ++i) {
                for (int c = 0; c < 3; ++c) {
                    System.out.print("  *  ");
                }
                System.out.println(""); 
            }
            
           
            int fo = 1;
            for(int c=0;c<fo;++c){
                System.out.println("<Y> if you want to countine?");
            int  x = input.nextInt();
            if(x==1){
            
           g.print(fo);
            ++fo;
            
            
            }}
            
  