package ShapeClass;

public class Triangle extends Shape {

    private int base;

    public int getBase(){
        return base;
    }
    public void setBase(int base){
        this.base = base;
    }

    public Triangle(int base, int length, int width){
        super(length, width);
        this.base = base;
    }
    @Override
    public double areaOf(){
        return base * getLength() * getWidth();
    }
}
