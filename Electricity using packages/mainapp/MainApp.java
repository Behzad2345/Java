package mainapp;

import java.util.Scanner;
import electricity.*;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Consumer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Consumer ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Units Consumed: ");
        int units = sc.nextInt();

        System.out.println("\nSelect Consumer Type");
        System.out.println("1. Domestic");
        System.out.println("2. Commercial");
        System.out.print("Enter Choice: ");

        int choice = sc.nextInt();

        BillCalculator bill;

        if (choice == 1) {
            bill = new DomesticConsumer(name, id, units);
        } else if (choice == 2) {
            bill = new CommercialConsumer(name, id, units);
        } else {
            System.out.println("Invalid Choice!");
            sc.close();
            return;
        }

        System.out.println("\nUsing Runtime Polymorphism...\n");
        bill.calculateBill();

        sc.close();
    }
}