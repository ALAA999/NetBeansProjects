import java.io.FileOutputStream;
import java.io.IOException;
class copy{
    public static void main(String[] args) throws IOException{
   FileOutputStream f = new FileOutputStream("Allosh.txt");
        String s1 = "My name is alaa";
        byte s[] = s1.getBytes();
        f.write(s);
        f.close();
        System.out.println("Done!");
}
}