package SuperHero;

public class Main {
    public static void main(String[] args) {


        SuperHero superBoy = new SuperBoy("SuperBoy", new String[]{"Flight", "Superspeed", "Strength"});
        SuperHero batman = new Batman("BatMan", new String[]{"Wealth", "Brains"});

        System.out.println(batman.printSuperPowers());
    }

}
