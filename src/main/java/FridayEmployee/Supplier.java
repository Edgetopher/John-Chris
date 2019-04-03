package FridayEmployee;

public class Supplier extends Employee implements IPayable {
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
    public Supplier(String name, int quantity, int price) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public double calcPay() {
        return getPrice() * getQuantity();
    }

    public String getCheck() {
        return "Paid Supplier: "+ calcPay();
    }
}
