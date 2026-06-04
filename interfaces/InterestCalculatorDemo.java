/*2. Create an interface InterestCalculator containing methods to calculate Simple Interest and
Compound Interest. Accept the principal amount, rate of interest, and time period from the
user and display the calculated interest values. */

import java.util.Scanner;

interface InterestCalculator {
    void simpleInterest();
    void compoundInterest();
}

class Interest implements InterestCalculator {
    double p, r, t;

    Interest(double p, double r, double t) {
        this.p = p;
        this.r = r;
        this.t = t;
    }

    public void simpleInterest() {
        double si = (p * r * t) / 100;
        System.out.println("Simple Interest = " + si);
    }

    public void compoundInterest() {
        double amount = p * Math.pow((1 + r / 100), t);
        double ci = amount - p;
        System.out.println("Compound Interest = " + ci);
    }
}

public class InterestCalculatorDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double p = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double r = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double t = sc.nextDouble();

        Interest obj = new Interest(p, r, t);

        obj.simpleInterest();
        obj.compoundInterest();

        sc.close();
    }
}