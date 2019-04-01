package FridayEmployee;

public class Main {
    public static void main(String[] args) {
        Date first = new Date("September",21,2010);
        Date second = new Date("April",31,2000);
        Date third = new Date("July",14,2006);

        HourlyEmployee John = new HourlyEmployee("John","Handcock",second,231311231,10,50);
        CommissionedEmployee Bob = new CommissionedEmployee("Bob","Evans",221906677,first,.15,80000);
        BasePlusCommissionedEmployee Nikki = new BasePlusCommissionedEmployee("Nikki","Minj",13456789, new Date("November", 21, 1902),.20,75000,25000);
        System.out.println(John);
        System.out.println(Bob);
        System.out.println(Nikki);

    }
}
