/*Assignment 8: Write a Java program that counts how many digits of a number divide the
number exactly.
Example:
Input: 124
Digits: 1,2,4
All divide 124 → count = 3 */

import java.util.Scanner;

public class DigitDivide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int count = 0;

        while (temp > 0) {
            int digit = temp % 10;

            if (digit != 0 && num % digit == 0) {
                count++;
            }

            temp = temp / 10;
        }

        System.out.println("Count = " + count);

        sc.close();
    }
}