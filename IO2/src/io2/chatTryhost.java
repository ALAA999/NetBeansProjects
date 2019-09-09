
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

 class aa {
    public static void main(String[] args)throws IOException { 
    ServerSocket s = new ServerSocket(555);
    Socket ss = s.accept();
    DataOutputStream out = new DataOutputStream(ss.getOutputStream());
    DataInputStream in = new DataInputStream(ss.getInputStream());
    Scanner input = new Scanner(System.in);
    String messege="",c;
        while (!messege.equalsIgnoreCase("stop")) {   
            c= in.readUTF();
            System.out.println("Messege from custom: "+c+"\nEnter your Messege:");
            messege = input.nextLine();
            out.writeUTF(messege);
        }
}
}
