/*Create a class “Vehicle” with a method “start()” that prints “Vehicle 
started”.Create a subclass “Car” that extends “Vehicle” and overrides the 
“start()” method to print “Car started”. Create an object of the “Vehicle” class 
and 
call 
the 
“start()” 
Create an object of the “Car” class and call the “start()” method.  */

class vehicle{
    void start(){
        System.out.println("vehicle has started");
    }
}

class car extends vehicle{
    @Override
    void start(){
        System.out.println("car has started");
    }

}


public class vehicleDemo{
    public static void main(String[] args){
    vehicle v=new vehicle();
    v.start();

    car c=new car();
    c.start();


}

}