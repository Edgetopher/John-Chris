package FridayEmployee;

public class HourlyEmployee extends Employee implements IPayable {
    private double hourlyWage;
    private int hoursWorked;

    public HourlyEmployee(String firstName, String lastName, Date hiredDate, int socialSec, int hourlyWage, int hoursWorked) {
        super(firstName, lastName, socialSec, hiredDate);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    public double calcPay() {
        double ot;
        double pay;
        double otPay;
        if (hoursWorked > 40) {
            pay = (40 * hourlyWage);
            hoursWorked -= 40;
            ot = hourlyWage * 1.5;
            otPay = ot * hoursWorked;
            pay = pay + otPay;
        } else {
            pay = hourlyWage * hoursWorked;
        }
        return pay;
    }

    @Override
    public String toString() {
        String accent ="==============================================================================================";
        return super.toString() +
                "Hourly Wage: " + hourlyWage + "\n" +
                "Hours Worked: " + hoursWorked + "\n"+
                "Earned " + calcPay() + "\n" +
                accent;
    }

    public String getCheck() {
        return "Paid HourlyEmployee: " +calcPay();
    }
}
