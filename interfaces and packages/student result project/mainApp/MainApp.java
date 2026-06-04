package mainApp;

import java.util.Scanner;
import student.*;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        int[] marks = new int[5];

        System.out.println("Enter Marks of 5 Subjects:");

        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
        }

        System.out.println("\n1. UG Student");
        System.out.println("2. PG Student");
        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        Result student;

        if (choice == 1)
            student = new UGStudent(name, marks);
        else
            student = new PGStudent(name, marks);

        student.calculateGrade();

        sc.close();
    }
}