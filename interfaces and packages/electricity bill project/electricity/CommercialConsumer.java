package electricity;

public class CommercialConsumer implements BillCalculator {

    String name;
    int id;
    int units;

    public CommercialConsumer(String name, int id, int units) {
        this.name = name;
        this.id = id;
        this.units = units;
    }

    public void calculateBill() {
        double bill = units * 9;

        System.out.println("\n----- Electricity Bill -----");
        System.out.println("Consumer Type : Commercial");
        System.out.println("Consumer Name : " + name);
        System.out.println("Consumer ID   : " + id);
        System.out.println("Units Used    : " + units);
        System.out.println("Bill Amount   : Rs." + bill);
    }
}