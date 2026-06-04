/*8. Develop a Java program to calculate the percentage of marks obtained by a student. Use
exception handling to prevent division-by-zero errors and handle invalid numeric inputs
entered by the user. */

import java.util.InputMismatchException;
import java.util.Scanner;

public class PercentageCalculator {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter Total Marks Obtained: ");
            double obtained = sc.nextDouble();

            System.out.print("Enter Maximum Marks: ");
            double total = sc.nextDouble();

            if (total == 0) {
                throw new ArithmeticException("Maximum marks cannot be zero.");
            }

            double percentage = (obtained / total) * 100;

            System.out.println("Percentage = " + percentage + "%");

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid numeric values.");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}