package loan;

public class EducationLoan implements Loan {

    double amount, rate;
    int years;

    public EducationLoan(double amount, double rate, int years) {
        this.amount = amount;
        this.rate = rate;
        this.years = years;
    }

    public void calculateEMI() {

        double r = rate / (12 * 100);
        int n = years * 12;

        double emi = (amount * r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);
        double total = emi * n;

        System.out.println("\nEducation Loan");
        System.out.println("Monthly EMI = " + emi);
        System.out.println("Total Repayment = " + total);
    }
}