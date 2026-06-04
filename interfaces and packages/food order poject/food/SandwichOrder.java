package food;

public class SandwichOrder implements FoodOrder {

    int quantity;
    double price = 100;

    public SandwichOrder(int quantity) {
        this.quantity = quantity;
    }

    public void calculateBill() {

        double amount = quantity * price;
        double gst = amount * 0.05;
        double total = amount + gst;

        System.out.println("\nSandwich Order");
        System.out.println("Item : Sandwich");
        System.out.println("Quantity : " + quantity);
        System.out.println("Unit Price : Rs. " + price);
        System.out.println("GST : Rs. " + gst);
        System.out.println("Final Amount : Rs. " + total);
    }
}