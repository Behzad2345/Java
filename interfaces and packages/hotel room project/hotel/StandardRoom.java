package hotel;

public class StandardRoom implements RoomBilling {

    String name;
    int days;

    public StandardRoom(String name, int days) {
        this.name = name;
        this.days = days;
    }

    public void calculateBill() {

        double bill = days * 1500;
        double gst = bill * 0.18;
        double total = bill + gst;

        System.out.println("\nStandard Room");
        System.out.println("Customer : " + name);
        System.out.println("Room Charge : " + bill);
        System.out.println("GST : " + gst);
        System.out.println("Final Bill : " + total);
    }
}