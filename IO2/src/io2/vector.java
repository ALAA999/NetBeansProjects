
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Vector;
import java.util.Enumeration;

class copying2filesto1 {

    public static void main(String[] args) throws IOException {
        FileInputStream f1 = new FileInputStream("Main File1.txt");
        FileInputStream f2 = new FileInputStream("Main File2.txt");
        FileInputStream f3 = new FileInputStream("Main File3.txt");
        FileInputStream f4 = new FileInputStream("Main File4.txt");
        FileOutputStream out = new FileOutputStream("Target.txt");
        Vector v = new Vector();
        v.add(f1);
        v.add(f2);
        v.add(f3);
        v.add(f4);

        Enumeration e = v.elements();

        SequenceInputStream s = new SequenceInputStream(e);

        int i;
        while ((i = s.read()) != -1) {
            out.write(i);
        }
        System.out.println("Done!");

    }
}
