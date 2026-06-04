/*6. Create an interface containing static methods for addition, subtraction, multiplication,
division, and modulus operations. Develop a menu-driven calculator program that allows
users to perform arithmetic calculations. */

import java.util.Scanner;

interface Calculator {

    static void add(double a, double b) {
        System.out.println("Addition = " + (a + b));
    }

    static void subtract(double a, double b) {
        System.out.println("Subtraction = " + (a - b));
    }

    static void multiply(double a, double b) {
        System.out.println("Multiplication = " + (a * b));
    }

    static void divide(double a, double b) {
        if (b != 0)
            System.out.println("Division = " + (a / b));
        else
            System.out.println("Division by zero is not possible.");
    }

    static void modulus(int a, int b) {
        if (b != 0)
            System.out.println("Modulus = " + (a % b));
        else
            System.out.println("Division by zero is not possible.");
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n----- Calculator Menu -----");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                double a = sc.nextDouble();

                System.out.print("Enter second number: ");
                double b = sc.nextDouble();

                switch (choice) {
                    case 1:
                        Calculator.add(a, b);
                        break;
                    case 2:
                        Calculator.subtract(a, b);
                        break;
                    case 3:
                        Calculator.multiply(a, b);
                        break;
                    case 4:
                        Calculator.divide(a, b);
                        break;
                }
            } else if (choice == 5) {
                System.out.print("Enter first integer: ");
                int a = sc.nextInt();

                System.out.print("Enter second integer: ");
                int b = sc.nextInt();

                Calculator.modulus(a, b);
            } else if (choice == 6) {
                System.out.println("Exiting...");
            } else {
                System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}
