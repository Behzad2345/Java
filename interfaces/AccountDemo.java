/*5. Create an interface Account containing methods for deposit, withdrawal, and balance
inquiry. Implement the interface in a class representing a savings account. Accept
transaction details from the user and maintain the account balance after each operation. */

import java.util.Scanner;

interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    void balance();
}

class SavingsAccount implements Account {
    double bal;

    SavingsAccount(double bal) {
        this.bal = bal;
    }

    public void deposit(double amount) {
        bal = bal + amount;
        System.out.println("Amount Deposited = " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= bal) {
            bal = bal - amount;
            System.out.println("Amount Withdrawn = " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    public void balance() {
        System.out.println("Current Balance = " + bal);
    }
}

public class AccountDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();

        SavingsAccount acc = new SavingsAccount(bal);

        System.out.print("Enter Deposit Amount: ");
        double dep = sc.nextDouble();
        acc.deposit(dep);
        acc.balance();

        System.out.print("\nEnter Withdrawal Amount: ");
        double wd = sc.nextDouble();
        acc.withdraw(wd);
        acc.balance();

        sc.close();
    }
}