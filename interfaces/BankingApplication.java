/*10. Develop a banking application using interfaces and exception handling. The application
should calculate the available account balance after deposits and withdrawals. Generate
and handle exceptions when the withdrawal amount exceeds the available balance or when
invalid transaction amounts are entered. */


import java.util.InputMismatchException;
import java.util.Scanner;

interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
    void balance();
}

class SavingsAccount implements BankAccount {
    double balance;

    SavingsAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0)
            throw new IllegalArgumentException("Invalid deposit amount.");
        balance += amount;
        System.out.println("Amount Deposited = " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= 0)
            throw new IllegalArgumentException("Invalid withdrawal amount.");

        if (amount > balance)
            throw new ArithmeticException("Insufficient balance.");

        balance -= amount;
        System.out.println("Amount Withdrawn = " + amount);
    }

    public void balance() {
        System.out.println("Available Balance = " + balance);
    }
}

public class BankingApplication {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter Initial Balance: ");
            double bal = sc.nextDouble();

            SavingsAccount acc = new SavingsAccount(bal);

            System.out.print("Enter Deposit Amount: ");
            double dep = sc.nextDouble();
            acc.deposit(dep);

            System.out.print("Enter Withdrawal Amount: ");
            double wd = sc.nextDouble();
            acc.withdraw(wd);

            acc.balance();

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid numeric values.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}