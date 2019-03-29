package Animal;

public class Cat extends Animal {
    public Cat(String name, String food) {
        super(name,food);
    }


    public String eat() {
        return "cats eat fish";
    }
}
