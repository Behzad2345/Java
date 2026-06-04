package employee;

public class ContractEmployee implements SalaryCalculator {

    String name;
    int id;
    int hours;
    double rate;

    public ContractEmployee(String name, int id, int hours, double rate) {
        this.name = name;
        this.id = id;
        this.hours = hours;
        this.rate = rate;
    }

    public void calculateSalary() {

        double salary = hours * rate;

        System.out.println("\nContract Employee");
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
        System.out.println("Salary : " + salary);
    }
}