
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileOutputStream;
class tr{
    public static void main(String[] args) throws IOException {
        FileOutputStream out = new FileOutputStream("Allosh.txt");
        FileInputStream in = new FileInputStream("Alloshte.txt");
        
        int i;
        
        while ((i = in.read()) != -1) {            
            out.write(i);
        }
        System.out.println("Done!");
    }
}