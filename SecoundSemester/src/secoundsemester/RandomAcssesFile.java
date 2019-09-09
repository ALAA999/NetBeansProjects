
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

class Randomse{
    public static void main(String[] args) throws IOException {
   try{
       RandomAccessFile raf = new RandomAccessFile("books.dat", "rw");//rw = read and write!
       String books[] = new String[5];
       books[0] = "Hacking";
       books[1] = "Java";
       books[2] = "C";
       books[3] = "c++";
       books[4] = "Android";
       for (int i = 0; i < books.length; i++) {
           raf.writeUTF(books[i]);
       }
       raf.seek(raf.length());//seek moves the pointer 
       raf.writeUTF("JavaProgramming!");
       raf.seek(0);
       while (raf.getFilePointer()<raf.length()) {           
           System.out.println(raf.readUTF());
       }
       System.out.println(raf.getFilePointer());
   }catch(FileNotFoundException e){
       System.err.println("Errore");
   }
}
}