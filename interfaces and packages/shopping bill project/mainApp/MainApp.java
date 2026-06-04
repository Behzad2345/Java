package mainApp;

import java.util.Scanner;
import product.*;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter Price per Item: ");
        double price = sc.nextDouble();

        System.out.println("\n1. Grocery");
        System.out.println("2. Clothing");
        System.out.println("3. Electronics");
        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        Discountable item;

        if (choice == 1)
            item = new GroceryItem(name, quantity, price);
        else if (choice == 2)
            item = new ClothingItem(name, quantity, price);
        else
            item = new ElectronicsItem(name, quantity, price);

        item.calculateDiscount();

        sc.close();
    }
}