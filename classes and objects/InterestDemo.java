/*8. Write a Java program to create a class Interest with principal, rate, and time
as data members. Using objects, calculate both simple interest and compound
interest, compare the results, and display the difference in returns */

import java.util.Scanner;

class Interest {
    double principal, rate, time;

    Interest(double principal, double rate, double time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    double simpleInterest() {
        return (principal * rate * time) / 100;
    }

    double compoundInterest() {
        return principal * Math.pow((1 + rate / 100), time) - principal;
    }

    void compare() {
        double si = simpleInterest();
        double ci = compoundInterest();

        System.out.println("Simple Interest = " + si);
        System.out.println("Compound Interest = " + ci);

        if (ci > si)
            System.out.println("Compound Interest gives higher return.");
        else if (si > ci)
            System.out.println("Simple Interest gives higher return.");
        else
            System.out.println("Both are equal.");

        System.out.println("Difference = " + (ci - si));
    }
}

public class InterestDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        Interest obj = new Interest(principal, rate, time);

        obj.compare();

        sc.close();
    }
}