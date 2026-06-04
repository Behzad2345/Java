/*Assignment 6: Write a Java program that counts how many times each digit appears in a
number.
Example:
Input: 1223401
Output:
1 → 2 times
2 → 2 times
3 → 1 time
4 → 1 time
0 → 1 time */

import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        int[] count = new int[10];

        while (num > 0) {
            int digit = (int)(num % 10);
            count[digit]++;
            num = num / 10;
        }

        for (int i = 0; i < 10; i++) {
            if (count[i] > 0) {
                System.out.println(i + " -> " + count[i] + " times");
            }
        }

        sc.close();
    }
}