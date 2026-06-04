/*2. Write a Java program that creates an array of five integers and allows the user to enter an
index to access an element. If the entered index is outside the valid range of the array, the
program should catch ArrayIndexOutOfBoundsException and display a meaningful
message indicating that the index is invalid. */

import java.util.Scanner;

public class ArrayIndexExceptionDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};

        try {
            System.out.print("Enter index: ");
            int index = sc.nextInt();

            System.out.println("Element = " + arr[index]);
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index! Please enter an index between 0 and 4.");
        }

        System.out.println("Program ended successfully.");

        sc.close();
    }
}