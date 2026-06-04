package hotel;

public class SuiteRoom implements RoomBilling {

    String name;
    int days;

    public SuiteRoom(String name, int days) {
        this.name = name;
        this.days = days;
    }

    public void calculateBill() {

        double bill = days * 5000;
        double gst = bill * 0.18;
        double total = bill + gst;

        System.out.println("\nSuite Room");
        System.out.println("Customer : " + name);
        System.out.println("Room Charge : " + bill);
        System.out.println("GST : " + gst);
        System.out.println("Final Bill : " + total);
    }
}