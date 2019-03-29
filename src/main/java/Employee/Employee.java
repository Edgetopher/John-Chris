package Employee;

public class Employee {
    private String firstName;
    private String lastName;
    private int employeeID;


    public int getEmployeeID(){
        return employeeID;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public void setLastName(String lastName){
        this.lastName= lastName;
    }
    public void setEmployeeID(int employeeID){
        this.employeeID= employeeID;
    }
    public Employee(){

    }

    public Employee(String firstName, String lastName, int employeeID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeID = employeeID;
    }
    public int payCheck(int amount){
        return amount;
    }
}
