package vehicle;

public class Bus implements FuelConsumption {

    double distance, fuelPrice;

    public Bus(double distance, double fuelPrice) {
        this.distance = distance;
        this.fuelPrice = fuelPrice;
    }

    public void calculateFuelCost() {

        double fuel = distance / 5;
        double cost = fuel * fuelPrice;

        System.out.println("\nBus");
        System.out.println("Fuel Required = " + fuel + " litres");
        System.out.println("Fuel Cost = Rs. " + cost);
    }
}