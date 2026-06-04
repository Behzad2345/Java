/*7. Create an interface ShoppingCart containing methods to calculate the subtotal, GST
amount, discount amount, and final payable bill. Accept item prices and quantities from
the user and generate a detailed bill. */


import java.util.Scanner;

interface ShoppingCart {
    void subtotal();
    void gst();
    void discount();
    void finalBill();
}

class Bill implements ShoppingCart {
    double price, qty;
    double subtotal, gstAmount, discountAmount, finalAmount;

    Bill(double price, double qty) {
        this.price = price;
        this.qty = qty;
    }

    public void subtotal() {
        subtotal = price * qty;
        System.out.println("Subtotal = " + subtotal);
    }

    public void gst() {
        gstAmount = subtotal * 0.18; // 18% GST
        System.out.println("GST (18%) = " + gstAmount);
    }

    public void discount() {
        discountAmount = subtotal * 0.10; // 10% Discount
        System.out.println("Discount (10%) = " + discountAmount);
    }

    public void finalBill() {
        finalAmount = subtotal + gstAmount - discountAmount;
        System.out.println("Final Payable Bill = " + finalAmount);
    }
}

public class ShoppingCartDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Item Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        double qty = sc.nextDouble();

        Bill b = new Bill(price, qty);

        System.out.println("\n----- BILL -----");
        b.subtotal();
        b.gst();
        b.discount();
        b.finalBill();

        sc.close();
    }
}