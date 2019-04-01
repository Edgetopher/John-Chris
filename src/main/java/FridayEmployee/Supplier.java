package Group;

public class Supplier {
    private String name;
    private int quantity;
    private int price;

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public Supplier(String name, int quantity, int price){
        this.name =name;
        this.price =price;
        this.quantity = quantity;
    }
}
