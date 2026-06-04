/*4. Create an interface EmployeeSalary containing methods to calculate gross salary and net
salary. Accept basic pay, HRA, DA, and other allowances from the user and generate a
complete salary statement. */

import java.util.Scanner;

interface EmployeeSalary {
    void grossSalary();
    void netSalary();
}

class Employee implements EmployeeSalary {
    double basic, hra, da, allowance;
    double gross, net;

    Employee(double basic, double hra, double da, double allowance) {
        this.basic = basic;
        this.hra = hra;
        this.da = da;
        this.allowance = allowance;
    }

    public void grossSalary() {
        gross = basic + hra + da + allowance;
        System.out.println("Gross Salary = " + gross);
    }

    public void netSalary() {
        net = gross; // No deductions
        System.out.println("Net Salary = " + net);
    }
}

public class EmployeeSalaryDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Pay: ");
        double basic = sc.nextDouble();

        System.out.print("Enter HRA: ");
        double hra = sc.nextDouble();

        System.out.print("Enter DA: ");
        double da = sc.nextDouble();

        System.out.print("Enter Other Allowances: ");
        double allowance = sc.nextDouble();

        Employee e = new Employee(basic, hra, da, allowance);

        System.out.println("\n----- Salary Statement -----");
        System.out.println("Basic Pay = " + basic);
        System.out.println("HRA = " + hra);
        System.out.println("DA = " + da);
        System.out.println("Other Allowances = " + allowance);

        e.grossSalary();
        e.netSalary();

        sc.close();
    }
}