package mainApp;

import java.util.Scanner;
import vehicle.*;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Distance (km): ");
        double distance = sc.nextDouble();

        System.out.print("Enter Fuel Price per Litre: ");
        double fuelPrice = sc.nextDouble();

        System.out.println("\n1. Car");
        System.out.println("2. Bike");
        System.out.println("3. Bus");
        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        FuelConsumption vehicle;

        if (choice == 1)
            vehicle = new Car(distance, fuelPrice);
        else if (choice == 2)
            vehicle = new Bike(distance, fuelPrice);
        else
            vehicle = new Bus(distance, fuelPrice);

        vehicle.calculateFuelCost();

        sc.close();
    }
}