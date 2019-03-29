package FridayEmployee;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private int socialSec;
    private Date hiredDate;

    public Employee(String firstName, String lastName, int socialSec) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSec = socialSec;
    }
    public abstract double calcPay();
}
