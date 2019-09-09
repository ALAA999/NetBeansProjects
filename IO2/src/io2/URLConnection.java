
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

 class URLConnection {
     public static void main(String[] args) throws IOException{
   
         URL u = new URL("https://www.youtube.com/watch?v=gh2r9781mwE&list=PLMYF6NkLrdN85yXTEQzDcHbmZHCyuCDnK&index=198");
         java.net.URLConnection uc = u.openConnection();
         InputStream i = uc.getInputStream();
         int c;
         while ((c=i.read())!=-1) {             
             System.out.print((char) c);
         }
         
    
    
}
 }
