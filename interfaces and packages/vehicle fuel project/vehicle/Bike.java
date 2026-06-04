package vehicle;

public class Bike implements FuelConsumption {

    double distance, fuelPrice;

    public Bike(double distance, double fuelPrice) {
        this.distance = distance;
        this.fuelPrice = fuelPrice;
    }

    public void calculateFuelCost() {

        double fuel = distance / 45;
        double cost = fuel * fuelPrice;

        System.out.println("\nBike");
        System.out.println("Fuel Required = " + fuel + " litres");
        System.out.println("Fuel Cost = Rs. " + cost);
    }
}