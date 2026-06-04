/*11. Create a class “Vehicle” with a method “drive()” that displays a message
“Driving a vehicle”. Create two subclasses “Car” and “Bike” that extend
“Vehicle” and implement the “drive()” method to display “Driving a car” and
“Driving a bike” respectively. */

class Vehicle {
    void drive() {
        System.out.println("Driving a vehicle");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Driving a car");
    }
}

class Bike extends Vehicle {
    void drive() {
        System.out.println("Driving a bike");
    }
}

public class VehicleDemo3 {
    public static void main(String[] args) {

        Vehicle v = new Vehicle();
        Car c = new Car();
        Bike b = new Bike();

        v.drive();
        c.drive();
        b.drive();
    }
}