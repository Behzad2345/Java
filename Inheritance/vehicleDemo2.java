/*Create a class “Vehicle” with a method “start()” that prints “Vehicle started”. 
Create a subclass “Car” that extends “Vehicle” and adds a method “drive()” 
that 
prints 
to 
“Car 
driving”. 
Create a subclass “SportsCar” that extends “Car” and overrides the “drive()” 
method 
print 
“Sports 
car 
driving 
fast”. 
Create an object of the “Vehicle” class and call the “start()” method. 
Create an object of the “Car” class and call the “start()” and “drive()” methods. 
Create an object of the “SportsCar” class and call the “start()” and “drive()” 
methods */

class Vehicle {

    void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle {

    void drive() {
        System.out.println("Car driving");
    }
}

class SportsCar extends Car {

    @Override
    void drive() {
        System.out.println("Sports car driving fast");
    }
}

public class vehicleDemo2 {
    public static void main(String[] args) {

        Vehicle v = new Vehicle();
        v.start();

        System.out.println();

        Car c = new Car();
        c.start();
        c.drive();

        System.out.println();

        SportsCar s = new SportsCar();
        s.start();
        s.drive();
    }
}