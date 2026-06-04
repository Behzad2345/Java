package electricity;

public class CommercialConsumer implements BillCalculator {

    private String name;
    private int id;
    private int units;

    public CommercialConsumer(String name, int id, int units) {
        this.name = name;
        this.id = id;
        this.units = units;
    }

    @Override
    public void calculateBill() {
        double bill = units * 9;

        System.out.println("\n----- Electricity Bill -----");
        System.out.println("Consumer Type : Commercial");
        System.out.println("Consumer Name : " + name);
        System.out.println("Consumer ID   : " + id);
        System.out.println("Units Consumed: " + units);
        System.out.println("Rate per Unit : Rs. 9");
        System.out.println("Total Bill    : Rs. " + bill);
    }
}