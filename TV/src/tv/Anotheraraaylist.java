import java.util.ArrayList;
class ara{
    public static void main(String[] args) {
        ArrayList <String>a = new ArrayList<String>();
        a.add("Ali");
        a.add("alaa");
        a.add("momen");
        
        for(int i=0;i<a.size();++i){
            if(a.contains("Ali"))
                System.out.println(a.get(i));
           /* break;*/
        }
        System.out.println(a);
    }
}