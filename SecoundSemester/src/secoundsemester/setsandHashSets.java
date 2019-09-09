
import java.util.*;

class emp implements Comparable<emp> {

    String name;
    Integer salary;
    int id;

    public emp(String name, int salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(emp o) {
        return this.salary.compareTo(o.salary);
    }

    @Override
    public String toString() {
        return id + "    " + name + "    " + salary;
    }

    @Override
    public int hashCode() {
        return this.id % 10;
    }

}

class MaxEmp {

    public static void main(String[] args) {
        List<emp> Emploee = new ArrayList<emp>();
        Emploee.add(new emp("Alaa", 2000, 2005));
        Emploee.add(new emp("Rami", 2700, 2010));
        Emploee.add(new emp("Sami", 2500, 2000));
        Emploee.add(new emp("Fouad", 2800, 2003));
        Emploee.add(new emp("Samer", 3000, 2009));
        System.out.println(Emploee.get(2).hashCode());
        System.out.println(Emploee.get(1).hashCode());

        emp maxsal = Collections.max(Emploee); // it is written in teacher cod
        System.out.println("The max salary is:" + maxsal);
        Collections.sort(Emploee);
        System.out.println("Sorted\n" + Emploee);
        emp s = new emp("Khaled", 3100, 2010);
        List<emp> copying = Collections.nCopies(5, s);
        for (emp e : copying) {
            System.out.println(e);
        }
        System.out.println("/////////////////////////////////////////////////////");
        ListIterator<emp> iterator = Emploee.listIterator();//We have given the Employee for the iterator.
        System.out.println(iterator.hasPrevious());
        System.out.println(iterator.next());//gose to Rami
        iterator.next();//gose to Sami
        System.out.println(iterator.hasNext());
        System.out.println(iterator.previous());//returns to Rami
        iterator.add(new emp("Abd", 2900, 2011));//adds abd after alaa and gose to Rami
        System.out.println(Emploee);
        iterator.next();//gose to Sami
        iterator.set(new emp("mohammed", 2500, 3001));//It removes Sami from the List and puts mohammed
        System.out.println(Emploee);
        System.out.println("////////////////////////////////////////////////////HashCodes");
        System.out.println("Ahmed".hashCode());
        System.out.println(Emploee.get(0).hashCode());
        System.out.println(iterator.next());
    }
}
