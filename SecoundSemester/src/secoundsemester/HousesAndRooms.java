
import java.util.ArrayList;
import java.util.Scanner;

public class HousesAndRooms {

    public static void main(String[] args) {
        int fo = 1;
        String houespossive, carpetColor;
        int NumOfRooms;
        double lenght = 0, width = 0, PriceOfRed = 0, PriceOfGreen = 0, PriceOfBlue = 0, totalRedPrice = 0, totalGreenPrice = 0, totalBluePrice = 0, AreaRed = 0, AreaBlue = 0, AreaGreen = 0, firstRed = 0, firstBlue = 0, firstGreen = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("<Y> you have more houses?");
        houespossive = s.next();
        for (int i = 0; i < fo; i++) {
            if (houespossive.equalsIgnoreCase("y")) {
                System.out.println("Enter number of rooms: ");
                NumOfRooms = s.nextInt();
                for (int j = 0; j < NumOfRooms; j++) {
                    System.out.println("Enter the length of room" + (j + 1));
                    lenght = s.nextDouble();
                    System.out.println("Enter the width of room" + (j + 1));
                    width = s.nextDouble();
                    System.out.println("Enter the carpet color of room" + (j + 1));
                    carpetColor = s.next();
                    if (carpetColor.equalsIgnoreCase("R")) {
                        PriceOfRed = PriceOfRed + (lenght * width * 10.5);
                        firstRed = PriceOfRed;
                        AreaRed = AreaRed + (lenght * width);
                        totalRedPrice = totalRedPrice + firstRed;
                    }
                    if (carpetColor.equalsIgnoreCase("G")) {
                        PriceOfGreen = PriceOfGreen + (lenght * width * 15);
                        firstGreen = PriceOfGreen;
                        AreaGreen = AreaGreen + (lenght * width);
                        totalGreenPrice = totalGreenPrice + firstGreen;
                    }
                    if (carpetColor.equalsIgnoreCase("B")) {
                        PriceOfBlue = PriceOfBlue + (lenght * width * 12.75);
                        firstBlue = PriceOfBlue;
                        AreaBlue = AreaBlue + (lenght * width);
                        totalBluePrice = totalBluePrice + firstBlue;
                    } else {
                        System.out.println("Bad input");
                    }
                }
                System.out.println("Cost Report of house" + (i + 1));
                System.out.println("Color\t\t\tArea   Cost\n----------------------------------------------------");
                System.out.println("Red\t\t\t" + (PriceOfRed / 10.5) + "   " + (PriceOfRed));
                System.out.println("Blue\t\t\t" + (PriceOfBlue / 12.75) + "   " + (PriceOfBlue));
                System.out.println("Green\t\t\t" + (PriceOfGreen / 15) + "   " + (PriceOfGreen));
                System.out.println("----------------------------------------------------");
                System.out.println("Total Cost is:           " + (PriceOfBlue + PriceOfGreen + PriceOfRed));
                System.out.println("<Y> if you have more houses");
                houespossive = s.next();
                PriceOfBlue = 0;
                PriceOfGreen = 0;
                PriceOfRed = 0;
                if (houespossive.equalsIgnoreCase("y")) {
                    ++fo;
                } else {
                    System.out.println("The final report of total cost of all houses\nColor\t\t\tArea   Cost\n----------------------------------------------------");
                    System.out.println("Red\t\t\t" + AreaRed + "   " + totalRedPrice);
                    System.out.println("Blue\t\t\t" + AreaBlue + "   " + totalBluePrice);
                    System.out.println("Green\t\t\t" + AreaGreen + "   " + totalGreenPrice);
                    System.out.println("----------------------------------------------------");
                    System.out.println("The Toltal Cost of all houses is:    " + (totalRedPrice + totalBluePrice + totalGreenPrice));
                    System.out.println("Thanke you for using our Program!");
                }
            } else {
                System.exit(0);
            }
        }
    }
}
