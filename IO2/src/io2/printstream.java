import java.io.IOException;
import java.io.FileOutputStream;
import java.io.PrintStream;
class printstream{
    public static void main(String[] args) throws IOException{
        FileOutputStream f = new FileOutputStream("Alloshte.txt");
        PrintStream p = new PrintStream(f);
        
        p.append("alaa");
        p.append(" aldean alzibda");
        p.append(18+" years old");
        System.out.println("Done!");
        f.close();
        p.close();
    }
}