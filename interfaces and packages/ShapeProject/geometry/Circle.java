package geometry;

public class Circle implements Shape {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        System.out.println("Area = " + (3.14 * radius * radius));
    }

    public void calculatePerimeter() {
        System.out.println("Perimeter = " + (2 * 3.14 * radius));
    }
}