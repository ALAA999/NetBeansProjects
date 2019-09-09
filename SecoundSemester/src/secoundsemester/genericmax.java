
public class genericmax {

    public static <T extends Comparable<T>> T maxe(T compare1, T compare2, T compare3) {
        T max = compare1;
        if (compare2.compareTo(max) > 0) {
            max = compare2;
        }
        if (compare3.compareTo(max) > 0) {
            max = compare3;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxe(10, 20, 30));
        student s = new student("Alaa", 90);
        System.out.println(s.getAvg());
        System.out.println(s.getName());
        System.out.println(maxe("alaa", "alaaa", "alaaaa"));
    }
}
class student <T>{
    T name;
    T avg;
    public student(T name,T avg){
        this.name = name;
        this.avg = avg;
    }

    public T getName() {
        return name;
    }

    public T getAvg() {
        return avg;
    }

    public void setName(T name) {
        this.name = name;
    }

    public void setAvg(T avg) {
        this.avg = avg;
    }
    
}

class AA{
    public <T extends Comparable<T>> T  max(T o1,T o2,T o3){
        T Max = o1;
        if(o2.compareTo(o1)>0 && o2.compareTo(o3)>0){
            Max=o2;
        }else if(o3.compareTo(o1)>0 && o3.compareTo(o2)>0){
            Max=o3;
        }
        return Max;
    }
}