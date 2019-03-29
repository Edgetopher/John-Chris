package Animal;

public abstract class Animal {

    private String name;
    private String food;
    private String breed;


    public Animal(String name, String food){
        this.name = name;
        this.food = food;
    }

    abstract public String eat();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", food='" + food + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}
