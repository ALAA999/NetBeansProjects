
public class Recursion {
    static int r(int x,int y){
        int z;if(x==y){
            return x;
        }
        else{
            z = (x+y)/2;
            return r(x,z)*r(z+1, y)
;        }
    }
    static int F(int a,int b){
        if(a == b){
            return a;
        }
        else{
            return a+F(a+1,b);
        }
    }
    public static void main(String[] args) {
        System.out.println(r(4,5));
        System.out.println(F(2,5));
    }
}
