package FridayEmployee;

public class Date {
    private String month;
    private int date;
    private int year;

    public Date(String month, int date, int year) {
        this.month = month;
        this.date = date;
        this.year = year;
    }

    @Override
    public String toString() {
        return month + "-" + date + "-" + year;
    }
}
