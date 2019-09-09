
import java.util.Scanner;

public class Employee {

    static double marrail_salary;
    static int son_5, son_18, son_22;

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter Employee ID number: ");
        int id = s.nextInt();
        if(id == -1){
            System.exit(0);
        }
        System.out.println("Enter Employee Base salary: ");
        double base_salary = s.nextInt();
        System.out.println("Enter Employee marital status: ");
        String status = s.next();
        if (status.equalsIgnoreCase("m")) {
            System.out.println("<y> if have sons");
            String answer = s.next();
            if (answer.equalsIgnoreCase("y")) {
                marrail_salary = 100.00;
                System.out.println("Enter number of sons aged 1 to 5");
                son_5 = s.nextInt();
                System.out.println("Enter number of sons aged 6 to 18");
                son_18 = s.nextInt();
                System.out.println("Enter number of sons aged 19 to 22");
                son_22 = s.nextInt();
            }
        }
        double money_5 = getAdditionalFor_5(son_5);
        double money_18 = getAdditionalFor_18(son_18);
        double money_22 = getAdditionalFor_22(son_22);
        double tax = getslaryTax(base_salary);
        printdata(id, base_salary, status, marrail_salary, son_5, son_18, son_22, money_5, money_18, money_22, tax);
    }
////////////////////////////////////////////////////////////////////////////////

    public static double getslaryTax(double salary) {
        double tax_salary = 0;
        if (salary > 500 && salary <= 1000) {
            tax_salary = salary * 0.05;

        }
       else if (salary > 1000 && salary <= 5000) {
            tax_salary = salary * 0.1;

        }
       else if (salary > 5000) {
            tax_salary = salary * 0.2;
        }
        return tax_salary;
    }
////////////////////////////////////////////////////////////////////////////////

    public static double getAdditionalFor_5(int sons_5) {
        double moneyfor_5;
        moneyfor_5 = 20.0 * sons_5;
        return moneyfor_5;
    }
////////////////////////////////////////////////////////////////////////////////   

    public static double getAdditionalFor_18(int sons_18) {
        double moneyfor_18;
        moneyfor_18 = 30.0 * sons_18;
        return moneyfor_18;
    }
////////////////////////////////////////////////////////////////////////////////    

    public static double getAdditionalFor_22(int sons_22) {
        double moneyfor_22;
        moneyfor_22 = 50.0 * sons_22;
        return moneyfor_22;
    }
////////////////////////////////////////////////////////////////////////////////

    public static void printdata(int id, double base_salary, String states, double materil_salary, int son_5, int son_18, int son_22, double money_5, double money_18, double money_22, double tax) {
        System.out.println("******Welcome To An-najah University******");
        System.out.println("           Employee Report\n\n");
        System.out.println("id number: " + id + "\nMarital status: " + states + "\nNumber of sons: " + (son_5 + son_18 + son_22));
        System.out.println("--------------------------------------------------------------------------------------\n");
        System.out.println("\t\t\t\t\t\tBase Salary: " + base_salary);
        System.out.println("\t\t\t\t\t\tTax: " + tax);
        System.out.println("--------------------------------------------------------------------------------------\n");
        double total = base_salary - tax;
        System.out.println("\t\t\t\t\t\tNet 1: " + total);
        System.out.println("Married\t\t\t\t\t\t        " + materil_salary);
        System.out.println("Sons from 0 to 5 years: " + son_5 + "\t\t\t\t" + money_5);
        System.out.println("Sons from 6 to 18 years: " + son_18 + "\t\t\t\t" + money_18);
        System.out.println("Sons from 19 to 22 years: " + son_22 + "\t\t\t\t" + money_22);
        double totalfinal = total + materil_salary + money_5 + money_18 + money_22;
        System.out.println("\t\t\t\t\t\tTotal: " + totalfinal);
    }
}
