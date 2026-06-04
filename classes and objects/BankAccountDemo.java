/*7. Write a Java program to create a class BankAccount with account number,
balance, and transaction limit as data members. Using objects, perform
deposit and withdrawal operations, apply penalties for insufficient balance,
and calculate monthly interest on the remaining balance. 

*/

import java.util.Scanner;

class BankAccount {
    int accountNumber;
    double balance;
    double transactionLimit;

    BankAccount(int accountNumber, double balance, double transactionLimit) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transactionLimit = transactionLimit;
    }

    void deposit(double amount) {
        if (amount <= transactionLimit) {
            balance = balance + amount;
            System.out.println("Deposit Successful.");
        } else {
            System.out.println("Transaction limit exceeded.");
        }
    }

    void withdraw(double amount) {
        if (amount > transactionLimit) {
            System.out.println("Transaction limit exceeded.");
        }
        else if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawal Successful.");
        }
        else {
            System.out.println("Insufficient Balance.");
            balance = balance - 100; // Penalty
            System.out.println("Penalty of Rs.100 applied.");
        }
    }

    void calculateInterest() {
        double interest = balance * 0.04;
        System.out.println("Monthly Interest = " + interest);
        System.out.println("Final Balance = " + (balance + interest));
    }

    void display() {
        System.out.println("\nAccount Number = " + accountNumber);
        System.out.println("Balance = " + balance);
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter Transaction Limit: ");
        double limit = sc.nextDouble();

        BankAccount account = new BankAccount(accNo, balance, limit);

        System.out.print("Enter Deposit Amount: ");
        double deposit = sc.nextDouble();
        account.deposit(deposit);

        System.out.print("Enter Withdrawal Amount: ");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);

        account.display();
        account.calculateInterest();

        sc.close();
    }
}

