package FridayEmployee;

public class HourlyEmployee extends Employee {
    private double hourlyWage;
    private int hoursWorked;

    public HourlyEmployee(String firstName, String lastName, int socialSec, int hourlyWage, int hoursWorked) {
        super(firstName, lastName, socialSec);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    public double calcPay() {
        if (hoursWorked < 40){
         hourlyWage = hourlyWage * 1.5;
        }
    return hourlyWage * hoursWorked; }
}
