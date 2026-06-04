/*10. Write a Java program to create a class Product with product ID, quantity, price
per unit, expiry status, and discount category as data members. Using objects,
calculate total cost, apply category-based discounts, add tax, and generate the
final invoice. */

import java.util.Scanner;

class Product {
    int productId;
    int quantity;
    double price;
    boolean expired;
    String category;

    Product(int productId, int quantity, double price, boolean expired, String category) {
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
        this.expired = expired;
        this.category = category;
    }

    void generateInvoice() {

        if (expired) {
            System.out.println("Product is expired. Cannot generate invoice.");
            return;
        }

        double totalCost = quantity * price;

        double discount = 0;

        if (category.equalsIgnoreCase("Gold"))
            discount = totalCost * 0.20;
        else if (category.equalsIgnoreCase("Silver"))
            discount = totalCost * 0.10;
        else
            discount = totalCost * 0.05;

        double amountAfterDiscount = totalCost - discount;

        double tax = amountAfterDiscount * 0.18;

        double finalAmount = amountAfterDiscount + tax;

        System.out.println("\nInvoice");
        System.out.println("Product ID = " + productId);
        System.out.println("Quantity = " + quantity);
        System.out.println("Price per Unit = " + price);
        System.out.println("Total Cost = " + totalCost);
        System.out.println("Discount = " + discount);
        System.out.println("Tax = " + tax);
        System.out.println("Final Amount = " + finalAmount);
    }
}

public class ProductDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter Price per Unit: ");
        double price = sc.nextDouble();

        System.out.print("Is Product Expired? (true/false): ");
        boolean expired = sc.nextBoolean();

        System.out.print("Enter Discount Category (Gold/Silver/Other): ");
        String category = sc.next();

        Product p = new Product(id, quantity, price, expired, category);

        p.generateInvoice();

        sc.close();
    }
}