package electricity;

public class DomesticConsumer implements BillCalculator {

    private String name;
    private int id;
    private int units;

    public DomesticConsumer(String name, int id, int units) {
        this.name = name;
        this.id = id;
        this.units = units;
    }

    @Override
    public void calculateBill() {
        double bill = units * 6;

        System.out.println("\n----- Electricity Bill -----");
        System.out.println("Consumer Type : Domestic");
        System.out.println("Consumer Name : " + name);
        System.out.println("Consumer ID   : " + id);
        System.out.println("Units Consumed: " + units);
        System.out.println("Rate per Unit : Rs. 6");
        System.out.println("Total Bill    : Rs. " + bill);
    }
}