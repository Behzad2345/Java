/*1. Write a Java program that accepts two integers from the user and performs division. The
program should handle ArithmeticException when the user attempts to divide by zero and
InputMismatchException when non-numeric input is entered. Display appropriate error
messages and ensure that the program terminates gracefully without crashing. */

import java.util.Scanner;
import java.util.InputMismatchException;

public class DivisionExceptionDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int result = a / b;

            System.out.println("Result = " + result);
        }

        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }

        catch (InputMismatchException e) {
            System.out.println("Please enter integers only.");
        }

        System.out.println("Program ended successfully.");

        sc.close();
    }
}