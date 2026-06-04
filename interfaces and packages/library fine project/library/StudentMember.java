package library;

public class StudentMember implements FineCalculator {

    int overdueDays;

    public StudentMember(int overdueDays) {
        this.overdueDays = overdueDays;
    }

    public void calculateFine() {

        double fine = overdueDays * 2;

        System.out.println("\nStudent Member");
        System.out.println("Overdue Days : " + overdueDays);
        System.out.println("Fine = Rs. " + fine);
    }
}