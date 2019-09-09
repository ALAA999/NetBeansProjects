import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InvalidNameException;
class MakeExeption {
    public static void main(String[] args) throws Exception  {
        
    Scanner s = new Scanner(System.in);
        System.out.println("Enter num: ");   
        int n = s.nextInt();     
            name(n);
        System.out.println(n);}

    static void name(int s)throws Exception{
       try{
           System.out.println(s/0);
       }catch(ArithmeticException e){
            e.printStackTrace();
        } 
    }
}

/*
class exeption extends Exception{
    InvalidNameException(String s){
        super(s);
    }
        
    
}*/