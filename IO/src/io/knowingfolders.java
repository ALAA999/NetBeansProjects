
import java.io.File;

class knowingfolders {

    public static void main(String[] args) {
        File f = new File("C:\\Users\\Alaa\\Desktop\\");     /*   "E:\\  */

        String p[];
        p = f.list();
        for (int i = 0; i < p.length; ++i) {
         System.out.println(p[i]);
         }
        /*for (String s : p) {
            System.out.println(s);
        }*/
    }

}
