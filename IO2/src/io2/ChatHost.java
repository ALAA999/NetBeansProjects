
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class a {

    public static void main(String[] args) throws IOException {
        ServerSocket s = new ServerSocket(444);
        System.out.println("Wating for custom to be connected...");
        Socket ss = s.accept();
        DataOutputStream out = new DataOutputStream(ss.getOutputStream());
        DataInputStream in = new DataInputStream(ss.getInputStream());
        Scanner s2 = new Scanner(System.in);
        System.out.println("The clinet has just connected!\nWating for his messge!");
        String b="",c;
        while (!b.equals("stop")) {
            c = in.readUTF();
            System.out.println("Allosh messge is: " +c );
            b = s2.nextLine();
            out.writeUTF(b);
        }
        
        s.close();
        out.close();
        in.close();
        s2.close();
        System.out.println("Goodbye");
        
    }
}
