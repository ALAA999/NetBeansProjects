import java.util.*;
class ma{
    public static void main(String[] args) {
        int x[]=new int[10];
        int i;
        Scanner input = new Scanner(System.in);
        for(i=0;i<x.length;++i){
            System.out.println("Enter num"+(i+1)+": ");
            x[i] = input.nextInt();}
           max(4);
        }
    void max(int a){
        int maxe = a;
        for(int b=0;b<a;++b){
            if(a>maxe)
                maxe=a;
        }
        System.out.println(maxe);
        }
    }
    
