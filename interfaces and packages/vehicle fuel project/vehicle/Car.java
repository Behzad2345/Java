package vehicle;

public class Car implements FuelConsumption {

    double distance, fuelPrice;

    public Car(double distance, double fuelPrice) {
        this.distance = distance;
        this.fuelPrice = fuelPrice;
    }

    public void calculateFuelCost() {

        double fuel = distance / 15;
        double cost = fuel * fuelPrice;

        System.out.println("\nCar");
        System.out.println("Fuel Required = " + fuel + " litres");
        System.out.println("Fuel Cost = Rs. " + cost);
    }
}