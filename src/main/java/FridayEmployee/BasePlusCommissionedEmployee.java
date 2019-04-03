package FridayEmployee;

public class BasePlusCommissionedEmployee extends CommissionedEmployee implements IPayable {
    private int baseSalary;

    public BasePlusCommissionedEmployee(String firstName, String lastName, int socialSec, Date hiredDate, double commissionRate, int grossSales, int baseSalary) {
        super(firstName, lastName, socialSec, hiredDate, commissionRate, grossSales);
        this.baseSalary = baseSalary;
    }
        @Override
        public double calcPay(){
            double y = getCommissionRate() * getGrossSales();
            double e = baseSalary + y;
            return e;

        }

    @Override
    public String toString() {
        String accent ="==============================================================================================";
        return super.toString() +
                "Base Salary: " + baseSalary + "\n" + accent
                ;
    }

    @Override
    public String getCheck() {
        return "Paid BasePlusCommissionedEmployee " + calcPay();
    }
}
