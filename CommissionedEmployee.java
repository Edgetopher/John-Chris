package Group;

import java.util.Date;

public class CommissionedEmployee extends Employee {
     private int commissionRate;
     private int grossSales;


     public int getCommissionRate(){
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


     public CommissionedEmployee(String firstName, String lastName, int socialSec, Date hiredDate, int commissionRate, int grossSales){
         super(firstName, lastName, socialSec, hiredDate);
         this.commissionRate = commissionRate;
         this.grossSales = grossSales;
     }

     @Override
    public double calcPay(){
         double x = commissionRate * grossSales;
         return x;
     }

}
