package food;

public class PizzaOrder implements FoodOrder {

    int quantity;
    double price = 250;

    public PizzaOrder(int quantity) {
        this.quantity = quantity;
    }

    public void calculateBill() {

        double amount = quantity * price;
        double gst = amount * 0.05;
        double total = amount + gst;

        System.out.println("\nPizza Order");
        System.out.println("Item : Pizza");
        System.out.println("Quantity : " + quantity);
        System.out.println("Unit Price : Rs. " + price);
        System.out.println("GST : Rs. " + gst);
        System.out.println("Final Amount : Rs. " + total);
    }
}