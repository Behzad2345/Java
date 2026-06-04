/*Assignment 1: Write a Java program that accepts a 5-digit number and prints: 
 Sum of digits at even positions  
 Sum of digits at odd positions  
 Difference between the two  */

import java.util.Scanner;

public class DigitPositionSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 5-digit number: ");
        int num = sc.nextInt();

        // Check if it's a 5-digit number
        if (num < 10000 || num > 99999) {
            System.out.println("Please enter only a 5-digit number.");
            return;
        }

        int evenSum = 0, oddSum = 0;
        int position = 1;

        while (num > 0) {
            int digit = num % 10;//get last digit

            if (position % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }

            num /= 10;//remove last digit
            position++;
        }

        System.out.println("Sum of digits at even positions = " + evenSum);
        System.out.println("Sum of digits at odd positions = " + oddSum);
        System.out.println("Difference = " + Math.abs(oddSum - evenSum));
    }
}
