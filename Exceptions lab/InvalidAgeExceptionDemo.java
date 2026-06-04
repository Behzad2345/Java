/*5. Write a Java program that accepts the age of a user and checks whether the user is at least
18 years old. Create a custom exception named InvalidAgeException that is thrown when
the entered age is less than 18. Catch the exception in the main program and display an
appropriate message explaining why the input is invalid. */

import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class InvalidAgeExceptionDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();

            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or above.");
            }

            System.out.println("Valid age.");
        }

        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        finally {
            sc.close();
            System.out.println("Program ended.");
        }
    }
}