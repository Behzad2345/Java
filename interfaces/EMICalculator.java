/*9. Develop a Java program to calculate the EMI (Equated Monthly Installment) of a loan
using the principal amount, annual interest rate, and loan tenure. Use exception handling
to validate all user inputs and prevent invalid calculations. */



import java.util.InputMismatchException;
import java.util.Scanner;

public class EMICalculator {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter Principal Amount: ");
            double p = sc.nextDouble();

            System.out.print("Enter Annual Interest Rate (%): ");
            double rate = sc.nextDouble();

            System.out.print("Enter Loan Tenure (in years): ");
            int years = sc.nextInt();

            if (p <= 0 || rate < 0 || years <= 0) {
                throw new ArithmeticException("Values must be greater than zero.");
            }

            double r = rate / (12 * 100);   // Monthly interest rate
            int n = years * 12;             // Total number of months

            double emi;

            if (r == 0) {
                emi = p / n;
            } else {
                emi = (p * r * Math.pow(1 + r, n)) /
                      (Math.pow(1 + r, n) - 1);
            }

            System.out.printf("Monthly EMI = %.2f\n", emi);

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid numeric values.");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}