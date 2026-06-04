package mainApp;

import java.util.Scanner;
import library.*;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Due Date (Day Number): ");
        int dueDate = sc.nextInt();

        System.out.print("Enter Return Date (Day Number): ");
        int returnDate = sc.nextInt();

        int overdueDays = returnDate - dueDate;

        if (overdueDays < 0)
            overdueDays = 0;

        System.out.println("\n1. Student Member");
        System.out.println("2. Faculty Member");
        System.out.println("3. External Member");
        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        FineCalculator member;

        if (choice == 1)
            member = new StudentMember(overdueDays);
        else if (choice == 2)
            member = new FacultyMember(overdueDays);
        else
            member = new ExternalMember(overdueDays);

        member.calculateFine();

        sc.close();
    }
}