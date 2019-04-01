package FridayEmployee;

public class SalariedEmployee extends Employee {
    private int weeklySalary;

    public SalariedEmployee(String firstName, String lastName, int socialSec, Date hiredDate, int weeklySalary) {
        super(firstName, lastName, socialSec, hiredDate);
        this.weeklySalary = weeklySalary;
    }

    public double calcPay() {
        return weeklySalary * 52;
    }

    @Override
    public String toString() {
        String accent ="==============================================================================================";
        return super.toString() +
                "Weekly Salary " + weeklySalary + "\n" +
                accent;
    }
}
