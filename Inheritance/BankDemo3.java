/*13. Create a class “BankAccount” with a method “deposit()” that adds money to
the account. Create two subclasses “SavingsAccount” and
“CheckingAccount” that extend “BankAccount” and implement the
“deposit()” method to add interest to the account balance for savings account
and display a message for checking account. */

class BankAccount {
    double balance = 1000;

    void deposit() {
        System.out.println("Balance = " + balance);
    }
}

class SavingsAccount extends BankAccount {
    void deposit() {
        balance = balance + (balance * 5 / 100);
        System.out.println("Balance after interest = " + balance);
    }
}

class CheckingAccount extends BankAccount {
    void deposit() {
        System.out.println("Money deposited in Checking Account");
    }
}

public class BankDemo3 {
    public static void main(String[] args) {

        BankAccount b = new BankAccount();
        SavingsAccount s = new SavingsAccount();
        CheckingAccount c = new CheckingAccount();

        b.deposit();
        s.deposit();
        c.deposit();
    }
}