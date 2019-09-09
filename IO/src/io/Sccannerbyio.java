
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

class Scannerr {

    public static void main(String[] args) throws IOException {
        InputStreamReader s = new InputStreamReader(System.in);
        System.out.println("Enter the char or 'q' to exit");
        char x;
        /* 
         int x;
         x = s.read();
         System.out.println(x);*/
        do {
            x = (char) s.read();
            System.out.println(x);
        } while (x != 'q');
    }

}
