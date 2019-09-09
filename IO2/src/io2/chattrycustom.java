
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

class bb {

    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 555);
        System.out.println("Connected..");
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        DataInputStream in = new DataInputStream(s.getInputStream());
        Scanner scanner = new Scanner(System.in);
        String send;
        String messege = "", b;
        while (!messege.equalsIgnoreCase("stop")) {
            System.out.println("Enter your Messege: ");
            messege = scanner.nextLine();
            out.writeUTF(messege);
            b = in.readUTF();
            System.out.println("Messege from host: " + b);

        }
    }
}
