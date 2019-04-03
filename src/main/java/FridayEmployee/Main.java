package FridayEmployee;

public class Main {
//    public String getCheck(Employee[] workers) {
//        String Quote = "";
//        for (Employee worker : workers) {
//            Quote = Quote + "\n" + worker.calcPay();
//        }
//        return Quote;
//    }

    public static void main(String[] args) {
        Date first = new Date("September", 21, 2010);
        Date second = new Date("April", 31, 2000);
        Date third = new Date("July", 14, 2006);

        HourlyEmployee John = new HourlyEmployee("John", "Handcock", second, 231311231, 10, 50);
        SalariedEmployee Lic = new SalariedEmployee("Lic","Mason",213323,third,985);
        CommissionedEmployee Bob = new CommissionedEmployee("Bob", "Evans", 221906677, first, .15, 80000);
        BasePlusCommissionedEmployee Nikki = new BasePlusCommissionedEmployee("Nikki", "Minj", 13456789, new Date("November", 21, 1902), .20, 75000, 25000);
        Supplier wbMason = new Supplier("Paper",2500,5);
        IPayable[] iPayables = new IPayable[]{John, Lic, Bob, Nikki, wbMason};
        for (IPayable Amount: iPayables){
            System.out.println(Amount.getCheck());
        }

        System.out.println(John);
        System.out.println(Bob);
        System.out.println(Nikki);
    }
}

