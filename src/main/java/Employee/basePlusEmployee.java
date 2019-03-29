package Employee;

public class basePlusEmployee extends Commisioned {
    private int baseSalary;

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    @Override
    public int payCheck() {
        return (getGrossSales() * getComm()) + baseSalary;
    }
    public basePlusEmployee(String firstName, String lastName, int employeeID, int baseSalary, int grossSales, int comm){
        this.baseSalary = baseSalary;
        setGrossSales(grossSales);
        setComm(comm);
        setFirstName(firstName);
        setLastName(lastName);
        setEmployeeID(employeeID);
    }
}
