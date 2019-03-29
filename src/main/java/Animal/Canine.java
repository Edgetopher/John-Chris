package Animal;

public abstract class Canine extends Animal{

    public Canine(String name, String food) {
        super(name, food);
    }

     public abstract String eat();
}
