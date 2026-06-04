package employee;

public class PermanentEmployee implements SalaryCalculator {

    String name;
    int id;
    double basicPay;

    public PermanentEmployee(String name, int id, double basicPay) {
        this.name = name;
        this.id = id;
        this.basicPay = basicPay;
    }

    public void calculateSalary() {

        double hra = basicPay * 20 / 100;
        double da = basicPay * 10 / 100;
        double gross = basicPay + hra + da;

        System.out.println("\nPermanent Employee");
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
        System.out.println("Basic Pay : " + basicPay);
        System.out.println("Gross Salary : " + gross);
    }
}