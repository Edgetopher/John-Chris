package FridayEmployee;

public class Date {
    private String month;
    private int date;
    private int year;

    @Override
    public String toString() {
        return month +" / "+ date + " / " + year;
    }
}
