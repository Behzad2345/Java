/*6. Write a Java program to create a class Employee with basic salary, overtime
hours, and leave deductions as data members. Using objects, calculate HRA,
DA, tax deductions, bonuses, gross salary, and net salary according to salary
slabs. */

import java.util.Scanner;

class Employee {
    double basicSalary;
    int overtimeHours;
    int leaveDays;

    Employee(double basicSalary, int overtimeHours, int leaveDays) {
        this.basicSalary = basicSalary;
        this.overtimeHours = overtimeHours;
        this.leaveDays = leaveDays;
    }

    void calculateSalary() {

        double hra = basicSalary * 0.20;
        double da = basicSalary * 0.10;
        double bonus = overtimeHours * 500;
        double leaveDeduction = leaveDays * 500;

        double grossSalary = basicSalary + hra + da + bonus;

        double tax;

        if (basicSalary < 30000)
            tax = grossSalary * 0.05;
        else if (basicSalary <= 50000)
            tax = grossSalary * 0.10;
        else
            tax = grossSalary * 0.15;

        double netSalary = grossSalary - tax - leaveDeduction;

        System.out.println("\nSalary Details");
        System.out.println("Basic Salary = " + basicSalary);
        System.out.println("HRA = " + hra);
        System.out.println("DA = " + da);
        System.out.println("Bonus = " + bonus);
        System.out.println("Gross Salary = " + grossSalary);
        System.out.println("Tax = " + tax);
        System.out.println("Leave Deduction = " + leaveDeduction);
        System.out.println("Net Salary = " + netSalary);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        System.out.print("Enter Overtime Hours: ");
        int overtimeHours = sc.nextInt();

        System.out.print("Enter Leave Days: ");
        int leaveDays = sc.nextInt();

        Employee emp = new Employee(basicSalary, overtimeHours, leaveDays);

        emp.calculateSalary();

        sc.close();
    }
}