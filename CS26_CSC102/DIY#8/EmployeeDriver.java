import java.util.Scanner;

public class EmployeeDriver {
    // Write your code here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fname = sc.nextLine();
        String lname = sc.nextLine();
        double msalary = sc.nextDouble();
        Employee e = new Employee(fname, lname, msalary);
        System.out.println("Employee: " + e.getFirstName() + " " + e.getLastName());
        System.out.printf("Yearly salary: %.2f%n", e.getYearlySalary());

        System.out.printf("Yearly salary after raise: %.2f%n ", e.getRaiseSalary());

    }
}

class Employee {
    // Write your code here
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String fname, String lname, double msalary) {
        this.firstName = fname;
        this.lastName = lname;
        if (msalary > 0) {
            this.monthlySalary = msalary;
        } else {
            this.monthlySalary = 0.0;
        }
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public double getMonthlySalary() {
        return this.monthlySalary;
    }

    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    public double getRaiseSalary() {
        return monthlySalary * 1.1 * 12;
    }

    public void setFirstName(String fname) {
        firstName = fname;
    }

    public void setlastName(String lname) {
        lastName = lname;
    }

    public void setMonthlySalary(double msalary) {
        if (msalary > 0) {
            monthlySalary = msalary;
        }
    }

}