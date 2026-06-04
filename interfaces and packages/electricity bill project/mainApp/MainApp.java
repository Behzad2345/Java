package mainApp;

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

        System.out.println("\n1. Domestic Consumer");
        System.out.println("2. Commercial Consumer");
        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        BillCalculator bill;

        if (choice == 1) {
            bill = new DomesticConsumer(name, id, units);
        } else {
            bill = new CommercialConsumer(name, id, units);
        }

        bill.calculateBill();
        sc.close();
    }
}