
class Employees {

    int empid;
    String firstName;
    String lastName;
    String maritalStatus;
    Double basicSalary;
    Double toSalary;

    public Employees(int empid, String firstName, String lastName, String maritalStatus, int i) {
        this.empid = empid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.maritalStatus = maritalStatus;
        this.basicSalary = (double) i;
        this.toSalary = toSalary();
    }

    public Employees() {
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(Double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public Double getToSalary() {
        return toSalary;
    }

    public void setToSalary(Double toSalary) {
        this.toSalary = toSalary;
    }

    final Double toSalary() {
        if (maritalStatus.equals("married")) {
            return (basicSalary * 1.5);
        } else {
            return (basicSalary * 1.1);
        }

    }

    public String toString() {
        return "   " + firstName + "\t" + lastName + "\t" + empid + "\t" + maritalStatus + "\t " + basicSalary + "\t";
    }

}
