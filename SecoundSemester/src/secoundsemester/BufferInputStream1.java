
import java.util.Scanner;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

class BufferInputStream1 {

    public static void main(String[] args) throws IOException {
        double t = System.currentTimeMillis();
        InputStream is = new FileInputStream("C:\\Users\\acer\\Documents\\NetBeansProjects\\SecoundSemester\\src\\1.png");
        OutputStream fos = new FileOutputStream("C:\\Users\\acer\\Documents\\2.png");
        BufferedInputStream bis = new BufferedInputStream(is);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int c;
        while ((c = is.read()) != -1) {
            fos.write(c);
        }
        System.out.println(t);
        System.out.println(System.currentTimeMillis() - t);
        System.out.println("Done!");
    }
}

class Try {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = s.next();
        System.out.println("Enter the avg: ");
        int avg = s.nextInt();
        int max = avg;
        String name1 = name;
        System.out.println("<Y> if you want to countine? ");
        String ans = s.next();
        while (ans.equalsIgnoreCase("y")) {
            System.out.println("Enter the name: ");
            String name2 = s.next();
            System.out.println("Enter the avg: ");
            int avg2 = s.nextInt();
            if (avg2 > max) {
                max = avg2;
                name1 = name2;
            }
            System.out.println("<Y> if you want to countine? ");
            ans = s.next();
        }
        System.out.println("The Max Student is: " + name1 + "\n" + "The avarage is: " + max);
    }
}
