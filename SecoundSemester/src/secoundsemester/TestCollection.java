
import java.util.*;

public class TestCollection {

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("New York");
        a.add("Atlanta");
        a.add("Dallasd");
        a.add("Madison");
        a.add("New York");
        /*System.out.println(">>>>>>>>>>>>>>>Sorted");
         System.out.println(collection.sort(collection,new Comparable<Integer>(){

         @Override
         public int compareTo(Integer o) {
               
         }
         }));*/
        System.out.println("a" + a);
        System.out.println("a.size()" + a.size());
        ArrayList<String> a2 = new ArrayList<String>();
        a2.add("Gaza");
        a2.addAll(a);
        System.out.println("a2" + a2);
        a2 = (ArrayList<String>) a.clone();//it copies all data from a to a2 مش معنا
        System.out.println(">>>>>>>>>>>>>>>Clone");
        System.out.println("a2" + a2);
        a2.add("Nables");
        System.out.println("a2" + a2);
        a2.retainAll(a);//مش معنا
        System.out.println(">>>>>>>>>>>>>>>retainAll\n" + a2);
        a2.add("Radah");
        a2.removeAll(a);
        //collection2.removeAll(collection2);
        System.out.println("a2" + a2);
    }
}

class MyList {

    public static void main(String[] args) {
        List<Integer> Array = new ArrayList<Integer>();
        ListIterator<Integer> litr = null;//listIterator gives us the possipility to accsess the previous methed&hsaprevious
        Array.add(23);
        Array.add(38);
        Array.add(29);
        Array.add(71);
        Array.add(5);
        //System.out.println(li.iterator());
        litr = Array.listIterator();
        while (litr.hasNext()) {
            System.out.println(litr.next());
        }
        while (litr.hasPrevious()) {            //previous has to be with ListIerator
            System.out.println(litr.previous());
        }
        Collections.sort(Array, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;//It takes two from the list and compare them then it returns them to the arrary
            }
        });
        System.out.println(Array);
        ////////////////////////////////////////////////////////////////////New ArrayList
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Alaa");
        arrayList.add("Mohammed");
        arrayList.add("Momen");
        System.out.println(arrayList);
        Collections.sort(arrayList, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) {
                    return o1.compareTo(o2);
                } else {
                    return o2.compareTo(o1);
                }
            }
        });
        System.out.println(arrayList);
    }
}

////////////////////////////////////////////////////////////////Collection Itertor
class collect {

    public static void main(String[] args) {
        Collection<String> c = new LinkedList<String>();
        c.add("New York");
        c.add("Atlanta");
        c.add("Dallas");
        c.add("New York");
        c.add("Madison");
        Iterator<String> iterator = c.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toUpperCase() + "\t" + iterator.hasNext());
        }
        System.out.println(c);
    }
}

/////////////////////////////////////////////////////////////////HashSet
class set {

    public static void main(String[] args) {
        Set<String> s = new HashSet<String>();
        s.add("Allosh");
        s.add("momomom");
        for (String a : args) {
            if (!s.add(a)) //         System.out.println(a);
            {
                System.out.println(s.size());
            }
        }
        System.out.println(s);
    }
}

class Details {

    public static void main(String args[]) {

        /* This is how to declare TreeMap */
        TreeMap<Integer, String> tmap
                = new TreeMap<Integer, String>();

        /*Adding elements to TreeMap*/
        tmap.put(1, "Data1");
        tmap.put(23, "Data2");
        tmap.put(70, "Data3");
        tmap.put(4, "Data4");
        tmap.put(2, "Data5");

        /* Display content using Iterator*/
        Set set = tmap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry) iterator.next();
            System.out.print("key is: " + mentry.getKey() + " & Value is: ");
            System.out.println(mentry.getValue());
        }

    }
}

class set2 {

    public static void main(String[] args) {
        Set<String> unique = new HashSet<String>();
        Set<String> dups = new HashSet<String>();
        unique.add("1");
        unique.add("2");
        unique.add("3");
        unique.add("4");
        dups.add("4");
        dups.add("5");
        dups.add("6");
        unique.add("30");
        dups.add(unique.iterator().next());
        Iterator i = dups.iterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }

        unique.removeAll(dups);
        System.out.println(unique);
        System.out.println(dups);
    }
}

/////////////////////////////////////////////////////////////////
class map {

    public static void main(String[] args) {
        Map<String, Integer> vehicles = new HashMap<String, Integer>();
               // Add some vehicles.

        vehicles.put("BMW", 5);
        vehicles.put("Mercedes", 3);
        vehicles.put("Audi", 4);
        vehicles.put("Ford", 10);
        vehicles.put("Mercedesssss", 6);
        vehicles.put("Mercedes", 6);//It deletes the presvous mesrseds and add the new mer.. with 6
        System.out.println("Total vehicles: " + vehicles.size());

        // Iterate over all vehicles, using the keySet method.
        for (String key : vehicles.keySet()) {
            System.out.println(key + " - " + vehicles.get(key));
        }
        System.out.println();

        String searchKey = "Audi";
        if (vehicles.containsKey(searchKey)) {
            System.out.println("Found total " + vehicles.get(searchKey) + " "//get returns the key of the object!
                    + searchKey + " cars!\n");
        }
        int total = 0;
        Collection<Integer> l = vehicles.values();
        for (Integer value : l) {
            total += value;
        }
        System.out.println("The total is " + total);

        // Clear all values.
        vehicles.clear();

        // Equals to zero.
        System.out.println("After clear operation, size: " + vehicles.size());
    }
}
