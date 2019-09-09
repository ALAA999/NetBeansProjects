
import java.io.File;

public class makingFile {

    public static void main(String[] args) {
        String s = "C:\\Users\\Allosh\\Desktop\\QW";
        File f = new File(s);
        File f2 = new File("C:\\Users\\Allosh\\Desktop\\QW\\alaa\\h");
        /*f.mkdir();
        System.out.println("Made");*/
     /*   f.delete();*/
              f2.mkdirs();
    }
}
