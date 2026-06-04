package geometry;

public class Rectangle implements Shape {

    double length, breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void calculateArea() {
        System.out.println("Area = " + (length * breadth));
    }

    public void calculatePerimeter() {
        System.out.println("Perimeter = " + (2 * (length + breadth)));
    }
}