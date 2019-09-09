
import java.io.IOException;
import java.net.URL;

 class URLMethodes {
    public static void main(String[] args) throws IOException{
   URL u = new URL("https://www.google.com/");
   
        System.out.println("Protocol is: "+u.getProtocol());
        System.out.println("Host name is: "+u.getHost());
        System.out.println("Port num is: "+u.getPort());
        System.out.println("File is: "+u.getFile());
}
}
