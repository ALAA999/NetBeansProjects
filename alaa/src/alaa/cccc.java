import java.util.*;
class maa{
    public static void main(String[] args) {
        int x[]=new int[10];
        int i;
        Scanner input = new Scanner(System.in);
        for(i=0;i<x.length;++i){
            System.out.println("Enter num"+(i+1)+": ");
            x[i] = input.nextInt();}
           max(x);
        }
    public static void max(int c[]){
        int maxe = c[0];
        for(int b=0;b<c.length;++b){
            if(c[b]>maxe)
                maxe=c[b];
        }
        System.out.println(maxe);
        }
    }
    
