package Employee;

public class SalariedEmployee extends Employee {
    private int weeklySalary;


    public int getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(int weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    public int payCheck() {
        return weeklySalary;
    }
    public SalariedEmployee(String firstName, String lastName, int employeeID, int weeklySalary){
        super(firstName, lastName, employeeID);
        this.weeklySalary = weeklySalary;
    }
}
