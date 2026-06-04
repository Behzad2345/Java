/*Create a class “BankAccount” with fields “accountNumber”, “balance”, and 
“interestRate” and a method “deposit()” that adds an amount to the balance. 
Create a subclass “SavingsAccount” that extends “BankAccount” and adds a 
field “minimumBalance” and a method “withdraw()” that subtracts an amount 
from 
the 
balance. 
Create an object of the “BankAccount” class and call the “deposit()” method. 
Create an object of the “SavingsAccount” class and call the “deposit()” and 
“withdraw()” methods. */

class bankAccount{
    int accountNumber;
    double balance;
    double interestRate;

    void deposit(double amount){
        balance+=amount;
        System.out.println("now, remaining balance after depositing="+balance);
    }
}

class savingsAccount extends bankAccount{
    double minimumBalance=50;
    void withdraw(double amount){
        if(balance-amount<minimumBalance){
            System.out.println("not enough balance to withdraw, minimum balance must be maintained");
        }
        else{
            balance-=amount;
            System.out.println("now, remaining balance after withdraw="+balance);
        }
    }

}
public class bankDemo {
    public static void main(String[] args){
        bankAccount b=new bankAccount();
        savingsAccount s=new savingsAccount();
         b.deposit(1000);
         s.deposit(20);
             s.withdraw(5);
    }
}
