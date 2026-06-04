/*9. Write a Java program to create a class ElectricityBill with consumer type and
units consumed as data members. Using objects, calculate the bill using slab
rates, apply taxes, subsidies, and late payment charges, and generate the final
payable amount. */

import java.util.Scanner;

class ElectricityBill {
    String consumerType;
    int units;

    ElectricityBill(String consumerType, int units) {
        this.consumerType = consumerType;
        this.units = units;
    }

    void calculateBill() {

        double bill;

        if (units <= 100)
            bill = units * 2;
        else if (units <= 200)
            bill = (100 * 2) + ((units - 100) * 3);
        else
            bill = (100 * 2) + (100 * 3) + ((units - 200) * 5);

        double tax = bill * 0.10;

        double subsidy = 0;
        if (consumerType.equalsIgnoreCase("Domestic"))
            subsidy = 100;

        double lateCharge = 50;

        double finalAmount = bill + tax + lateCharge - subsidy;

        System.out.println("\nElectricity Bill Details");
        System.out.println("Consumer Type = " + consumerType);
        System.out.println("Units Consumed = " + units);
        System.out.println("Bill = " + bill);
        System.out.println("Tax = " + tax);
        System.out.println("Subsidy = " + subsidy);
        System.out.println("Late Payment Charge = " + lateCharge);
        System.out.println("Final Payable Amount = " + finalAmount);
    }
}

public class ElectricityBillDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Consumer Type (Domestic/Commercial): ");
        String type = sc.next();

        System.out.print("Enter Units Consumed: ");
        int units = sc.nextInt();

        ElectricityBill bill = new ElectricityBill(type, units);

        bill.calculateBill();

        sc.close();
    }
}