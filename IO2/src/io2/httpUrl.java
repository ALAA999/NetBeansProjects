
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

 class httpUrl {
  public static void main(String[] args) throws  IOException {
   URL u = new URL("https://www.facebook.com/?ref=tn_tnmn");
   HttpURLConnection hu = (HttpURLConnection)u.openConnection();
      for (int i = 0; i < 10; i++) {
       System.out.println(hu.getHeaderField(i)+hu.getHeaderFieldKey(i));   
      }
      
}
  
}
