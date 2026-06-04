/*Create a class “Shape” with a method “getArea()” that returns the area of the 
shape.Create a subclass “Rectangle” that extends “Shape” and adds fields 
“length” and “width” and overrides the “getArea()” method to return the area 
of the rectangle.Create an object of the “Shape” class and call the “getArea()” 
method.Create an object of the “Rectangle” class and call the “getArea()” 
method.  */
class shape{
    double getArea(){
       return 0;
    }
}

class rectangle extends shape{
    double len=10;
    double bredth=20;

    @Override
    double getArea(){
        return len*bredth;
    }
}
public class shapeDemo {
    public static void main(String[] args){
        shape s=new shape();
        rectangle r= new rectangle();
        System.out.println("shape area="+s.getArea());
        System.out.println("rectangle area="+r.getArea());
    }

    
}
