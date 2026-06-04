/*3. Write a Java program to create a class Rectangle with length and breadth as
data members. Using objects, calculate area and perimeter, determine whether
the rectangle is a square, and compare two rectangles based on area and
diagonal length. */


import java.util.Scanner;

class Rectangle {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double area() {
        return length * breadth;
    }

    double perimeter() {
        return 2 * (length + breadth);
    }

    double diagonal() {
        return Math.sqrt(length * length + breadth * breadth);
    }

    boolean isSquare() {
        return length == breadth;
    }
}

public class RectangleDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of first rectangle: ");
        double l1 = sc.nextDouble();
        System.out.print("Enter breadth of first rectangle: ");
        double b1 = sc.nextDouble();

        System.out.print("Enter length of second rectangle: ");
        double l2 = sc.nextDouble();
        System.out.print("Enter breadth of second rectangle: ");
        double b2 = sc.nextDouble();

        Rectangle r1 = new Rectangle(l1, b1);
        Rectangle r2 = new Rectangle(l2, b2);

        System.out.println("\nFirst Rectangle");
        System.out.println("Area = " + r1.area());
        System.out.println("Perimeter = " + r1.perimeter());

        if (r1.isSquare())
            System.out.println("It is a square.");
        else
            System.out.println("It is not a square.");

        System.out.println("\nSecond Rectangle");
        System.out.println("Area = " + r2.area());
        System.out.println("Perimeter = " + r2.perimeter());

        if (r2.isSquare())
            System.out.println("It is a square.");
        else
            System.out.println("It is not a square.");

        if (r1.area() > r2.area())
            System.out.println("\nFirst rectangle has larger area.");
        else if (r2.area() > r1.area())
            System.out.println("\nSecond rectangle has larger area.");
        else
            System.out.println("\nBoth rectangles have equal area.");

        if (r1.diagonal() > r2.diagonal())
            System.out.println("First rectangle has longer diagonal.");
        else if (r2.diagonal() > r1.diagonal())
            System.out.println("Second rectangle has longer diagonal.");
        else
            System.out.println("Both rectangles have equal diagonal length.");

        sc.close();
    }
}