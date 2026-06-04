/*10. Create a class “Shape” with a method “calculateArea()” that calculates and
returns the area of the shape. Create two subclasses “Rectangle” and
“Triangle” that extend “Shape” and implement the “calculateArea()” method. */

import java.util.Scanner;

class Shape {
    double calculateArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double calculateArea() {
        return length * breadth;
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    double calculateArea() {
        return 0.5 * base * height;
    }
}

public class ShapeDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length and breadth of rectangle: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();

        Rectangle r = new Rectangle(l, b);
        System.out.println("Area of Rectangle = " + r.calculateArea());

        System.out.print("Enter base and height of triangle: ");
        double base = sc.nextDouble();
        double height = sc.nextDouble();

        Triangle t = new Triangle(base, height);
        System.out.println("Area of Triangle = " + t.calculateArea());

        sc.close();
    }
}