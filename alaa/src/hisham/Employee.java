
 class Employee
implements Comparable<Employee> {
    int num;
    String firstName;
    String lastName;
    String maritalStatus;
    double salary;
    double totalSalary;

    public Employee() {
    }
    
    public Employee(int num, String firstName, String lastName, String maritalStatus, double salary, double totalSalary) {
        this.num = num;
        this.firstName = firstName;
        this.lastName = lastName;
        this.maritalStatus = maritalStatus;
        this.salary = salary;
        this.totalSalary = totalSalary;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setTotalSalary(double totalSalary) {
        this.totalSalary = totalSalary;
    }

    public int getNum() {
        return num;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public double getSalary() {
        return salary;
    }

    public double getTotalSalary() {
        return totalSalary;
    }
    
    @Override
    public int compareTo(Employee o) {
        return this.num - o.num;
    }
}
