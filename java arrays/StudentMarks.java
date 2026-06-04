/*8. Write a Java program using a three-dimensional array to
store marks of students for multiple classes and subjects and
calculate total marks of each student */

import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of classes: ");
        int c = sc.nextInt();

        System.out.print("Enter number of students: ");
        int s = sc.nextInt();

        System.out.print("Enter number of subjects: ");
        int sub = sc.nextInt();

        int[][][] marks = new int[c][s][sub];

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < s; j++) {
                System.out.println("Enter marks of Student " + (j + 1) + " in Class " + (i + 1));

                for (int k = 0; k < sub; k++) {
                    marks[i][j][k] = sc.nextInt();
                }
            }
        }

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < s; j++) {
                int total = 0;

                for (int k = 0; k < sub; k++) {
                    total += marks[i][j][k];
                }

                System.out.println("Class " + (i + 1) + ", Student " + (j + 1) + " Total = " + total);
            }
        }

        sc.close();
    }
}