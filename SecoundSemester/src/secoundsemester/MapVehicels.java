
import java.util.*;
public class MapVehicels {

    public static void main(String[] args) {
        Map <String,Integer> vehicels = new HashMap();
        vehicels.put("Bmw", 5);
        vehicels.put("Mercedes", 3);
        vehicels.put("Audi", 6);
        vehicels.put("Golf", 2);
        vehicels.put("Bmw", 9);//في حالة التكرار مش حيضيفها
        System.out.println(vehicels.size());
        //System.out.println(vehicels.get(args));
        System.out.println(vehicels);
        System.out.println(vehicels.values());
        vehicels.clear();
        System.out.println(vehicels);
        System.out.println(vehicels.containsKey("Bmw"));
       // System.out.println(vehicels.containsKey(2));
    }
}
class HashMaps{
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        hm.put("First", 1);
        hm.put("Secound", 2);
        hm.put("Third", 3);
        hm.put("Fourth", 4);
       /* for(String a: args)
        {
            Integer freq = hm.get(a);
            hm.put(a, (freq == null)?1:freq+1);
            
        }*/
        System.out.println(hm);
        System.out.println(hm.containsKey("First"));
    }
}