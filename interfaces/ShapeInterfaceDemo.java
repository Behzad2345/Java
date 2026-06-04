/*1. Create an interface Shape containing methods to calculate the area and perimeter of a
geometric figure. Implement the interface in classes such as Circle and Rectangle. Accept
the required dimensions from the user and display the calculated area and perimeter for
each shape. */

import java.util.Scanner;

interface Shape {
    void area();
    void perimeter();
}

class Circle implements Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    public void area() {
        System.out.println("Area of Circle = " + (3.14 * r * r));
    }

    public void perimeter() {
        System.out.println("Perimeter of Circle = " + (2 * 3.14 * r));
    }
}

class Rectangle implements Shape {
    double l, b;

    Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    public void area() {
        System.out.println("Area of Rectangle = " + (l * b));
    }

    public void perimeter() {
        System.out.println("Perimeter of Rectangle = " + (2 * (l + b)));
    }
}

public class ShapeInterfaceDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();

        Circle c = new Circle(r);
        c.area();
        c.perimeter();

        System.out.print("\nEnter length of rectangle: ");
        double l = sc.nextDouble();

        System.out.print("Enter breadth of rectangle: ");
        double b = sc.nextDouble();

        Rectangle rec = new Rectangle(l, b);
        rec.area();
        rec.perimeter();

        sc.close();
    }
}