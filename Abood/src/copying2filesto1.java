
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

class copying2filesto1 {

    public static void main(String[] args) throws IOException {
        FileInputStream f1 = new FileInputStream("copied.txt");
        FileInputStream f2 = new FileInputStream("Main File.txt");
        FileOutputStream out = new FileOutputStream("Target.txt");
        SequenceInputStream sq = new SequenceInputStream(f1, f2);

        int i;
        while ((i = sq.read()) != -1) {
            out.write(i);
        }
        System.out.println("Done!");

    }
}
