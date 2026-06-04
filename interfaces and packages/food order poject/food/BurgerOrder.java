package food;

public class BurgerOrder implements FoodOrder {

    int quantity;
    double price = 150;

    public BurgerOrder(int quantity) {
        this.quantity = quantity;
    }

    public void calculateBill() {

        double amount = quantity * price;
        double gst = amount * 0.05;
        double total = amount + gst;

        System.out.println("\nBurger Order");
        System.out.println("Item : Burger");
        System.out.println("Quantity : " + quantity);
        System.out.println("Unit Price : Rs. " + price);
        System.out.println("GST : Rs. " + gst);
        System.out.println("Final Amount : Rs. " + total);
    }
}