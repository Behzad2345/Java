/*5. Write a Java program to create a class Student with marks in multiple subjects
as data members. Using objects, calculate total marks, percentage, grade,
identify failed subjects, and determine class rank among multiple students. */

import java.util.Scanner;

class Student {
    String name;
    int[] marks = new int[5];
    int total;
    double percentage;
    int failedSubjects = 0;

    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    void calculate() {
        total = 0;

        for (int i = 0; i < 5; i++) {
            total += marks[i];

            if (marks[i] < 40)
                failedSubjects++;
        }

        percentage = total / 5.0;
    }

    String grade() {
        if (percentage >= 90)
            return "A";
        else if (percentage >= 75)
            return "B";
        else if (percentage >= 60)
            return "C";
        else if (percentage >= 40)
            return "D";
        else
            return "F";
    }

    void display() {
        System.out.println("\nName: " + name);
        System.out.println("Total = " + total);
        System.out.println("Percentage = " + percentage);
        System.out.println("Grade = " + grade());
        System.out.println("Failed Subjects = " + failedSubjects);
    }
}

public class StudentDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[2];

        for (int i = 0; i < 2; i++) {

            System.out.print("\nEnter student name: ");
            String name = sc.next();

            int[] marks = new int[5];

            System.out.println("Enter marks of 5 subjects:");

            for (int j = 0; j < 5; j++) {
                marks[j] = sc.nextInt();
            }

            students[i] = new Student(name, marks);
            students[i].calculate();
        }

        for (int i = 0; i < 2; i++) {
            students[i].display();
        }

        if (students[0].total > students[1].total) {
            System.out.println("\nClass Rank:");
            System.out.println("1. " + students[0].name);
            System.out.println("2. " + students[1].name);
        } else if (students[1].total > students[0].total) {
            System.out.println("\nClass Rank:");
            System.out.println("1. " + students[1].name);
            System.out.println("2. " + students[0].name);
        } else {
            System.out.println("\nBoth students have the same rank.");
        }

        sc.close();
    }
}