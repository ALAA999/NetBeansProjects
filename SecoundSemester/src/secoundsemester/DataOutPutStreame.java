
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataOutPutStreame {

    public static void main(String[] args) throws Exception {
        DataOutputStream dops = new DataOutputStream(new FileOutputStream("C:\\\\Users\\\\Alaa\\\\Documents\\\\NetBeansProjects\\\\SecoundSemester\\\\src\\\\textFile.txt"));
        double[] price = {2.99, 1.99, 19.99, 15.99};
        int[] units = {2, 5, 7, 10};
        String[] names = {"Balls", "Screens", "Banana", "IceCream"};
        for (int i = 0; i < price.length; i++) {
            dops.writeDouble(price[i]);
            dops.writeChar('\t');
            dops.writeInt(units[i]);
            dops.writeChar('\t');
            dops.writeChars(names[i]);
            dops.writeChar('\n');
        }
        dops.close();

        DataInputStream dips = new DataInputStream(new FileInputStream("C:\\\\Users\\\\Alaa\\\\Documents\\\\NetBeansProjects\\\\SecoundSemester\\\\src\\\\textFile.txt"));
        double prices2;
        int unit;
        String names2;
        boolean EOF = false;
        double total = 0.0;
        while (!EOF) {
            try {
                prices2 = dips.readDouble();
                dips.readChar();
                unit = dips.readInt();
                dips.readChar();
                names2 = dips.readLine();
                System.out.println("You have orderd " + names2 + " units of " + unit + " at$" + prices2);
                total = total + prices2;
            } catch (EOFException e) {
                EOF = true;
            }
        }
        System.out.println("Total= " + total);
        dips.close();
    }
}
