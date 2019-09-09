import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class copytext1{
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        
        in = new FileInputStream("copied.txt");
        out = new FileOutputStream("text.txt");
        int i;
       /* out.write(2);*/
       while((i = in.read()) !=-1){
            out.write((byte)i);
        }
        System.out.println("copied !");
    }
}