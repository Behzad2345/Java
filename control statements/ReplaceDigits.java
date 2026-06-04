/*Assignment 10: Write a Java program that:
 Replaces all 0 with 1
 Replaces all 1 with 0
 Keeps other digits same
Example:
Input: 102301
Output: 012310 */

import java.util.Scanner;

public class ReplaceDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String num = sc.next();

        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);

            if (ch == '0')
                System.out.print('1');
            else if (ch == '1')
                System.out.print('0');
            else
                System.out.print(ch);
        }

        sc.close();
    }
}