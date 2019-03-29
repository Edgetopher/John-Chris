package Employee;

public class Commisioned extends Employee{
    private int grossSales;
    private int comm;

    public int getComm() {
        return comm;
    }

    public int getGrossSales() {
        return grossSales;
    }

    public void setComm(int comm) {
        this.comm = comm;
    }

    public void setGrossSales(int grossSales) {
        this.grossSales = grossSales;
    }

    public int payCheck(){
        return comm * grossSales;
    }

    public Commisioned(String firstName, String lastName, int employeeID, int grossSales, int comm) {
        this.grossSales = grossSales;
        this.comm = comm;
        setFirstName(firstName);
        setLastName(lastName);
        setEmployeeID(employeeID);

    }

    public Commisioned(){

    }
}
