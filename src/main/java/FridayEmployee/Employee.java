package FridayEmployee;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private int socialSec;
    private Date hiredDate;

    public Employee(String firstName, String lastName, int socialSec, Date hiredDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSec = socialSec;
        this.hiredDate = hiredDate;
    }

    public Date getHiredDate() {
        return hiredDate;
    }

    public int getSocialSec() {
        return socialSec;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setHiredDate(Date hiredDate) {
        this.hiredDate = hiredDate;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSocialSec(int socialSec) {
        this.socialSec = socialSec;
    }

    @Override
    public String toString() {
        String accent ="==============================================================================================";
        return accent + "\n" +
                this.getClass().getSimpleName() + "\n" +
                "First Name: " + firstName + '\n' +
                "Last Name: " + lastName + '\n' +
                "Social Security Number: " + socialSec + "\n" +
                "Hired date: " + hiredDate + "\n";
    }

    public abstract double calcPay();
}
