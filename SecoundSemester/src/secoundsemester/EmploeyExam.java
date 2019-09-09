
public class EmploeyExam <T extends Comparable<T>> {
   
    public static <T extends Comparable<T>> T max(T salary1, T salary2) {
        if (salary1.compareTo(salary2) > 0) {
            return salary1;
        } else {
            return salary2;
        }
    }
    String name;
    int salary;

    public EmploeyExam(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        EmploeyExam emp1 = new EmploeyExam("Alaa", 1000);
        EmploeyExam emp2 = new EmploeyExam("momen", 2000);
        System.out.println(max(emp1.getName(), emp2.getName()));
        System.out.println(max(emp1.getSalary(), emp2.getSalary()));
    }
}
