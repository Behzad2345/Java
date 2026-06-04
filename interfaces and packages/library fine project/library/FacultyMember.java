package library;

public class FacultyMember implements FineCalculator {

    int overdueDays;

    public FacultyMember(int overdueDays) {
        this.overdueDays = overdueDays;
    }

    public void calculateFine() {

        double fine = overdueDays * 1;

        System.out.println("\nFaculty Member");
        System.out.println("Overdue Days : " + overdueDays);
        System.out.println("Fine = Rs. " + fine);
    }
}