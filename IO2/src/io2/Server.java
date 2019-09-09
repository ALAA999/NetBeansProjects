
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

 class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket s = new ServerSocket(5555);
        Socket s1 = s.accept();
        DataInputStream s2 = new DataInputStream(s1.getInputStream());
        String s3 = s2.readUTF();
        System.out.println("Messege from custom: "+s3);
        
}
}
