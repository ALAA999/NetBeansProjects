import java.util.Collections;
import java.util.ArrayList;
public class shufflemethode {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add("alaa");
        a.add("mom");
        a.add("zed");
        a.add("sammer2");   
        a.add("sammer3");
        a.add("sammer4");
        a.add("sammer5");
        a.add("sammer6");
        Collections.shuffle(a);
        System.out.println(a);
    }
}
