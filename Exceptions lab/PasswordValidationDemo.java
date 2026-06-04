/*3. Write a Java program that prompts the user to enter a password and validates its length. If
the password contains fewer than eight characters, the program should throw an exception
and display an appropriate error message. Use try, throw, catch, and finally blocks to
demonstrate proper exception handling and program flow. */


import java.util.Scanner;

public class PasswordValidationDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter password: ");
            String password = sc.nextLine();

            if (password.length() < 8) {
                throw new Exception("Password must contain at least 8 characters.");
            }

            System.out.println("Password is valid.");
        }

        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        finally {
            sc.close();
            System.out.println("Program ended.");
        }
    }
}