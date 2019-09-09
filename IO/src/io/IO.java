
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/*
 class copytext{
 public static void main(String[] args) throws IOException {
 FileInputStream in = null;
 FileOutputStream out = null;/*ليش ما عملنا كداFileInputStream in = new FileInputStream("New Text Document.txt");
 بقول لانك عملت له analyshies
 */

/*  in = new FileInputStream("copied.txt");
 out = new FileOutputStream("text.txt");
 int i;
 /* out.write(2);*/
/*  while((i = in.read()) !=-1){
 out.write(i);
 }
 System.out.println("copied !");
 }
 }*/
class r {

    public static void main(String[] args) throws IOException {

        FileOutputStream out = new FileOutputStream("copied.txt");
        String s = "momen";
        byte q[] = s.getBytes();
        out.write(q);
    }
}
