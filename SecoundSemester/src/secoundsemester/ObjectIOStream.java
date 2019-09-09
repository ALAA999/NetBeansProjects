
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class ObjectIOStream {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
         FileOutputStream fos = new FileOutputStream("book.txt");//we can save data in book.txt() Or book.dat
         ObjectOutputStream oos = new ObjectOutputStream(fos);
         Book b = new Book("0595131066", "DataStructuer", "Allosh");
         Book b2 = new Book("0595131066", "tuesr", "Allosh");
         oos.writeObject(b);
         oos.writeObject(b2);
         oos.flush();
         oos.close();
         /////////////////////////////////////////////////////////////////////////

         FileInputStream fis = new FileInputStream("book.txt");
         ObjectInputStream ois = new ObjectInputStream(fis);
         b=(Book) ois.readObject();
         System.out.println(b);
         Object o = ois.readObject();
         System.out.println(o);
         ois.close();

       /* Scanner s = null;
        try {
            s = new Scanner(new File("C:\\\\Users\\\\Alaa\\\\Documents\\\\NetBeansProjects"
                    + "\\\\SecoundSemester\\\\textFile.txt"));
            while (s.hasNext()) {
                System.out.println(s.next());
            }
        } catch (Exception e) {
            s.close();
        }*/
    }
}

class Book implements Serializable {//Serializable allows us to safe the data as an object in the book.dat

    String isbn;
    String title;
    String author;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "[Book: " + isbn + " , " + title + " , " + author + "]";
    }

}
