/*Create a class “Shape” with a method “getArea()” that returns the area of the 
shape. 
Create a subclass “Rectangle” that extends “Shape” and adds fields “length” 
and “width” and overrides the “getArea()” method to return the area of the 
rectangle. 
Create a subclass “Box” that extends “Rectangle” and adds a field “height” 
and overrides the “getArea()” method to return the surface area of the box. 
Create an object of the “Shape” class and call the “getArea()” method. 
Create an object of the “Rectangle” class and call the “getArea()” method. 
Create an object of the “Box” class and call the “getArea()” method.  */

class Shape {

    double getArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    double length = 10;
    double width = 5;

    @Override
    double getArea() {
        return length * width;
    }
}

class Box extends Rectangle {
    double height = 4;

    @Override
    double getArea() {
        return 2 * ((length * width) + (length * height) + (width * height));
    }
}

public class boxDemo {
    public static void main(String[] args) {

        Shape s = new Shape();
        System.out.println("Area of Shape = " + s.getArea());

        Rectangle r = new Rectangle();
        System.out.println("Area of Rectangle = " + r.getArea());

        Box b = new Box();
        System.out.println("Surface Area of Box = " + b.getArea());
    }
}