/*2. Write a Java program to create a class Circle with radius as a data member.
Using objects, calculate area and circumference, compare two circles based
on area, and determine whether one circle can fit inside another. */

import java.util.Scanner;

class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return 3.14 * radius * radius;
    }

    double circumference() {
        return 2 * 3.14 * radius;
    }
}

public class CircleDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of first circle: ");
        double r1 = sc.nextDouble();

        System.out.print("Enter radius of second circle: ");
        double r2 = sc.nextDouble();

        Circle c1 = new Circle(r1);
        Circle c2 = new Circle(r2);

        System.out.println("\nFirst Circle");
        System.out.println("Area = " + c1.area());
        System.out.println("Circumference = " + c1.circumference());

        System.out.println("\nSecond Circle");
        System.out.println("Area = " + c2.area());
        System.out.println("Circumference = " + c2.circumference());

        if (c1.area() > c2.area()) {
            System.out.println("\nFirst circle has larger area.");
        } else if (c2.area() > c1.area()) {
            System.out.println("\nSecond circle has larger area.");
        } else {
            System.out.println("\nBoth circles have equal area.");
        }

        if (c1.radius < c2.radius) {
            System.out.println("First circle can fit inside second circle.");
        } else if (c2.radius < c1.radius) {
            System.out.println("Second circle can fit inside first circle.");
        } else {
            System.out.println("Both circles are of equal size.");
        }

        sc.close();
    }
}