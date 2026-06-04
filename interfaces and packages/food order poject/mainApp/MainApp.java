package mainApp;

import java.util.Scanner;
import food.*;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Pizza");
        System.out.println("2. Burger");
        System.out.println("3. Sandwich");
        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        FoodOrder order;

        if (choice == 1)
            order = new PizzaOrder(quantity);
        else if (choice == 2)
            order = new BurgerOrder(quantity);
        else
            order = new SandwichOrder(quantity);

        order.calculateBill();

        sc.close();
    }
}