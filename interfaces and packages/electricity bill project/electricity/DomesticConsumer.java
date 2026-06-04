package electricity;

public class DomesticConsumer implements BillCalculator {

    String name;
    int id;
    int units;

    public DomesticConsumer(String name, int id, int units) {
        this.name = name;
        this.id = id;
        this.units = units;
    }

    public void calculateBill() {
        double bill = units * 6;

        System.out.println("\n----- Electricity Bill -----");
        System.out.println("Consumer Type : Domestic");
        System.out.println("Consumer Name : " + name);
        System.out.println("Consumer ID   : " + id);
        System.out.println("Units Used    : " + units);
        System.out.println("Bill Amount   : Rs." + bill);
    }
}