package mainApp;

import java.util.Scanner;
import employee.*;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        System.out.println("\n1. Permanent Employee");
        System.out.println("2. Contract Employee");
        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        SalaryCalculator emp;

        if (choice == 1) {

            System.out.print("Enter Basic Pay: ");
            double basic = sc.nextDouble();

            emp = new PermanentEmployee(name, id, basic);

        } else {

            System.out.print("Enter Hours Worked: ");
            int hours = sc.nextInt();

            System.out.print("Enter Hourly Rate: ");
            double rate = sc.nextDouble();

            emp = new ContractEmployee(name, id, hours, rate);
        }

        emp.calculateSalary();

        sc.close();
    }
}