
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

class b {

    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 444);
        System.out.println("Connected..");
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        DataInputStream in = new DataInputStream(s.getInputStream());
        Scanner s2 = new Scanner(System.in);
        String b="",c;
        System.out.println("Enter your messge:");
        while (!b.equals("stop")) {
            b = s2.nextLine();
            out.writeUTF(b);
            c = in.readUTF();
            System.out.println("Host messge is: " + c);
        }
        s.close();
        out.close();
        in.close();
        s2.close();
        System.out.println("Goodbye");
    }
}
