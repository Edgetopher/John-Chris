package FridayEmployee;

public class CommissionedEmployee extends Employee implements IPayable {
     private double commissionRate;
     private int grossSales;


     public double getCommissionRate(){
         return commissionRate;
     }
     public int getGrossSales(){
         return grossSales;
     }
     public void setCommissionRate(int commissionRate){
         this.commissionRate = commissionRate;
     }
     public void setGrossSales(int grossSales){
         this.grossSales = grossSales;
     }


     public CommissionedEmployee(String firstName, String lastName, int socialSec, Date hiredDate, double commissionRate, int grossSales){
         super(firstName, lastName, socialSec, hiredDate);
         this.commissionRate = commissionRate;
         this.grossSales = grossSales;
     }

     @Override
    public double calcPay(){
         double x = commissionRate * grossSales;
         return x;
     }

    @Override
    public String toString() {
        String accent ="==============================================================================================";
        return super.toString() +
                "Commission Rate: " + commissionRate +
                "Gross Sales: " + grossSales + "\n" +
                accent;
    }

    public String getCheck() {
        return "Paid CommissionedEmployee: " + calcPay();
    }
}
