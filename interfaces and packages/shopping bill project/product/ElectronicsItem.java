package product;

public class ElectronicsItem implements Discountable {

    String name;
    int quantity;
    double price;

    public ElectronicsItem(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public void calculateDiscount() {

        double total = quantity * price;
        double discount = total * 0.15;
        double finalBill = total - discount;

        System.out.println("\nElectronics Item");
        System.out.println("Product : " + name);
        System.out.println("Total = " + total);
        System.out.println("Discount = " + discount);
        System.out.println("Final Bill = " + finalBill);
    }
}