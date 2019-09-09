import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
class filewrite {
    public static void main(String[] args) throws IOException {
   PrintWriter p = new PrintWriter(new BufferedWriter(new FileWriter("PrintWriter.txt",true))); 
   /*لو كنت بدك تضيف على الاسم القديم فقط تضيف كلمة true*/
   p.print("Allosh");
   p.flush();
}
}
