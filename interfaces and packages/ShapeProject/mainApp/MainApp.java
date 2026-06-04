package mainApp;

import java.util.Scanner;
import geometry.*;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        Shape shape;

        if (choice == 1) {

            System.out.print("Enter Radius: ");
            double r = sc.nextDouble();

            shape = new Circle(r);

        } else if (choice == 2) {

            System.out.print("Enter Length: ");
            double l = sc.nextDouble();

            System.out.print("Enter Breadth: ");
            double b = sc.nextDouble();

            shape = new Rectangle(l, b);

        } else {

            System.out.print("Enter Side 1: ");
            double a = sc.nextDouble();

            System.out.print("Enter Side 2: ");
            double b = sc.nextDouble();

            System.out.print("Enter Side 3: ");
            double c = sc.nextDouble();

            shape = new Triangle(a, b, c);
        }

        shape.calculateArea();
        shape.calculatePerimeter();

        sc.close();
    }
}