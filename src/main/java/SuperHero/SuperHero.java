package SuperHero;

public class SuperHero {
    protected String name;
    private String[] powers;

    public void setPowers(String[] powers){
        this.powers =powers;
    }
    public String[] getPowers() {
        return powers;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public SuperHero(){

    }

    public SuperHero(String name, String[] powers){
        this.powers = powers;
        this.name =name;
    }
    public String printSuperPowers(){
        String s = "";
        for(int i = 0; i < powers.length; i++){
            s = s + powers[i] +" ";
        } return name + " Has the super powers of " + s;
    }
}
