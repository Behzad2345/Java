/*4. Write a Java program that asks the user to enter a numeric string and converts it into an
integer using Integer.parseInt(). If the input contains invalid characters or is not a valid
integer, the program should catch NumberFormatException and display a user-friendly
error message instead of terminating abruptly. */

import java.util.Scanner;

public class NumberFormatExceptionDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            String str = sc.nextLine();

            int num = Integer.parseInt(str);

            System.out.println("Integer = " + num);
        }

        catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        }

        finally {
            sc.close();
            System.out.println("Program ended.");
        }
    }
}