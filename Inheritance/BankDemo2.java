/*9. Create a class “BankAccount” with fields “accountNumber”, “balance”, and
“interestRate” and a method “deposit()” that adds an amount to the balance.
Create a subclass “SavingsAccount” that extends “BankAccount” and adds a
field “minimumBalance” and a method “withdraw()” that subtracts an amount
from the balance.
Create a subclass “FixedDepositAccount” that extends “SavingsAccount” and
adds a field “term” and a method “getInterest()” that returns the interest earned
on the account.
Create an object of the “BankAccount” class and call the “deposit()” method.
Create an object of the “SavingsAccount” class and call the “deposit()” and
“withdraw()” methods.
Create an object of the “FixedDepositAccount” class and call the “deposit()” */

import java.util.Scanner;

class BankAccount {
    int accountNumber;
    double balance, interestRate;

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Balance after deposit = " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double minimumBalance;

    void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("Balance after withdrawal = " + balance);
    }
}

class FixedDepositAccount extends SavingsAccount {
    int term;

    double getInterest() {
        return balance * interestRate * term / 100;
    }
}

public class BankDemo2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // BankAccount
        BankAccount b = new BankAccount();
        System.out.print("Enter deposit amount for Bank Account: ");
        b.deposit(sc.nextDouble());

        // SavingsAccount
        SavingsAccount s = new SavingsAccount();
        System.out.print("Enter deposit amount for Savings Account: ");
        s.deposit(sc.nextDouble());

        System.out.print("Enter withdrawal amount: ");
        s.withdraw(sc.nextDouble());

        // FixedDepositAccount
        FixedDepositAccount f = new FixedDepositAccount();

        System.out.print("Enter deposit amount for Fixed Deposit: ");
        f.deposit(sc.nextDouble());

        System.out.print("Enter interest rate: ");
        f.interestRate = sc.nextDouble();

        System.out.print("Enter term (years): ");
        f.term = sc.nextInt();

        System.out.println("Interest = " + f.getInterest());

        sc.close();
    }
}