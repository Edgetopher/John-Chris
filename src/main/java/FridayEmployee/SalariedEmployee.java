package FridayEmployee;

public class SalariedEmployee extends Employee {
    private int weeklySalary;

    public SalariedEmployee(String firstName, String lastName, int socialSec, int weeklySalary) {
        super(firstName, lastName, socialSec);
        this.weeklySalary = weeklySalary;
    }

    public double calcPay() {
        return weeklySalary * 52;
    }
}
