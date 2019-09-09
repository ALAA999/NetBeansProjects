import java.util.*;
class panetest{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of flight: ");
        String M =input.next();
        System.out.println("Enter the num of flight: ");
        int B = input.nextInt();
        System.out.println("Enter the power of engien: ");
        double V = input.nextDouble();
        System.out.println("Enter the number of passangers: ");
        double G = input.nextDouble();
        System.out.println("Enter the speed: ");
        double H = input.nextDouble();
        
       
        plane D1 = new plane (M,B,V,G,H);
        plane D2 = new plane (M,B,V,G,H);
        if(D1.speed>D2.speed)
        {System.out.println(D1.nameofflight()+"  "+D1.getnumberofflight()+"  "+D1.numofpassengers()+"  "+D1.Speed()); 
       D1.powerofengien();}
        
    }
}