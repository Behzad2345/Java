package mainApp;

import java.util.Scanner;
import hotel.*;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Number of Days: ");
        int days = sc.nextInt();

        System.out.println("\n1. Standard Room");
        System.out.println("2. Deluxe Room");
        System.out.println("3. Suite Room");
        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        RoomBilling room;

        if (choice == 1)
            room = new StandardRoom(name, days);
        else if (choice == 2)
            room = new DeluxeRoom(name, days);
        else
            room = new SuiteRoom(name, days);

        room.calculateBill();

        sc.close();
    }
}