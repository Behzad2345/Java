package mainApp;

import java.util.Scanner;
import loan.*;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Loan Amount: ");
        double amount = sc.nextDouble();

        System.out.print("Enter Interest Rate (%): ");
        double rate = sc.nextDouble();

        System.out.print("Enter Loan Tenure (Years): ");
        int years = sc.nextInt();

        System.out.println("\n1. Home Loan");
        System.out.println("2. Education Loan");
        System.out.println("3. Vehicle Loan");
        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        Loan loan;

        if (choice == 1)
            loan = new HomeLoan(amount, rate, years);
        else if (choice == 2)
            loan = new EducationLoan(amount, rate, years);
        else
            loan = new VehicleLoan(amount, rate, years);

        loan.calculateEMI();

        sc.close();
    }
}