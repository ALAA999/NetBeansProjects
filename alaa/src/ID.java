import java.util.*;
class IDD{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String id;
        do{
            System.out.println("Enter id: ");
            id = input.next();
        }
        while(!id.matches("\\d{9}")); // the id must be 9 numbers
        System.out.println("Id is: "+id);
    }
}