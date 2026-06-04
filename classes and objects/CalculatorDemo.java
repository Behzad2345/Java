/*1. Write a Java program to create a class Calculator that accepts two numbers
and an operator as input. Using objects, perform the required arithmetic
operation, handle division by zero, and maintain the history of the last five
calculations. */

import java.util.Scanner;

class Calculator {
    String[] history = new String[5];
    int count = 0;

    void calculate(int a, int b, char op) {
        try {
            int result = 0;

            switch (op) {
                case '+':
                    result = a + b;
                    break;

                case '-':
                    result = a - b;
                    break;

                case '*':
                    result = a * b;
                    break;

                case '/':
                    if (b == 0)
                        throw new ArithmeticException("Division by zero is not allowed.");
                    result = a / b;
                    break;

                default:
                    System.out.println("Invalid operator.");
                    return;
            }

            String record = a + " " + op + " " + b + " = " + result;

            if (count < 5) {
                history[count] = record;
                count++;
            } else {
                for (int i = 0; i < 4; i++) {
                    history[i] = history[i + 1];
                }
                history[4] = record;
            }

            System.out.println("Result = " + result);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    void showHistory() {
        System.out.println("\nLast Calculations:");

        for (int i = 0; i < count; i++) {
            System.out.println(history[i]);
        }
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator();

        for (int i = 1; i <= 5; i++) {

            System.out.print("\nEnter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter operator (+,-,*,/): ");
            char op = sc.next().charAt(0);

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            c.calculate(a, b, op);
        }

        c.showHistory();
        sc.close();
    }
}