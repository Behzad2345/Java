package geometry;

public class Triangle implements Shape {

    double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void calculateArea() {

        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Area = " + area);
    }

    public void calculatePerimeter() {
        System.out.println("Perimeter = " + (a + b + c));
    }
}