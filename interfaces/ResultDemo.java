/*3. Create an interface Result containing methods to calculate total marks, percentage, and
grade. Accept marks obtained by a student in five subjects and display the total marks,
percentage, and corresponding grade. */

import java.util.Scanner;

interface Result {
    void total();
    void percentage();
    void grade();
}

class Student implements Result {
    int m1, m2, m3, m4, m5;
    int total;
    double per;

    Student(int a, int b, int c, int d, int e) {
        m1 = a;
        m2 = b;
        m3 = c;
        m4 = d;
        m5 = e;
    }

    public void total() {
        total = m1 + m2 + m3 + m4 + m5;
        System.out.println("Total Marks = " + total);
    }

    public void percentage() {
        per = total / 5.0;
        System.out.println("Percentage = " + per);
    }

    public void grade() {
        if (per >= 90)
            System.out.println("Grade = A");
        else if (per >= 75)
            System.out.println("Grade = B");
        else if (per >= 60)
            System.out.println("Grade = C");
        else if (per >= 40)
            System.out.println("Grade = D");
        else
            System.out.println("Grade = F");
    }
}

public class ResultDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of Subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter marks of Subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter marks of Subject 3: ");
        int m3 = sc.nextInt();

        System.out.print("Enter marks of Subject 4: ");
        int m4 = sc.nextInt();

        System.out.print("Enter marks of Subject 5: ");
        int m5 = sc.nextInt();

        Student s = new Student(m1, m2, m3, m4, m5);

        s.total();
        s.percentage();
        s.grade();

        sc.close();
    }
}