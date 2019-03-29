package Group;

import java.util.Date;

public class BasePlusCommissionedEmployee extends CommissionedEmployee {
    private int baseSalary;

    public BasePlusCommissionedEmployee(String firstName, String lastName, int socialSec, Date hiredDate, int commissionRate, int grossSales, int baseSalary) {
        super(firstName, lastName, socialSec, hiredDate, commissionRate, grossSales);
        this.baseSalary = baseSalary;
    }
        @Override
        public double calcPay(){
            double y = getCommissionRate() * getGrossSales();
            double e = baseSalary + y;
            return e;

        }

}
