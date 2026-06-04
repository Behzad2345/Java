/*Assignment 9: Write a Java program to generate the series:
2, 6, 7, 21, 22, 66, 67, ...
Pattern:
×3, +1, ×3, +1 ...
Print first N terms. */

import java.util.Scanner;

public class SeriesPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int term = 2;

        for (int i = 1; i <= n; i++) {
            System.out.print(term + " ");

            if (i % 2 == 1)
                term = term * 3;
            else
                term = term + 1;
        }

        sc.close();
    }
}