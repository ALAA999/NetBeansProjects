
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

 class custom {
    public static void main(String[] args) throws IOException{
        Socket s = new Socket("localhost",5555);
        DataOutputStream s2 = new DataOutputStream(s.getOutputStream());
        s2.writeUTF("I am Alaa");
}
}
