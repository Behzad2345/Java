package library;

public class ExternalMember implements FineCalculator {

    int overdueDays;

    public ExternalMember(int overdueDays) {
        this.overdueDays = overdueDays;
    }

    public void calculateFine() {

        double fine = overdueDays * 5;

        System.out.println("\nExternal Member");
        System.out.println("Overdue Days : " + overdueDays);
        System.out.println("Fine = Rs. " + fine);
    }
}