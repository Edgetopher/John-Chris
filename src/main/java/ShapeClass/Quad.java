package ShapeClass;

public class Quad extends Shape {
    private int side;
    private int side2;

    public int getSide(){
        return side;
    }
    public void setSide(int side){
        this.side = side;
    }
    public int getSide2(){
        return side2;
    }
    public void setSide2(int side2){
        this.side2=side2;
    }

    public Quad(int length, int width, int side, int side2) {
        super(length, width);
        this.side = side;
        this.side2 = side2;
    }
    public int permOf(){
        return getLength() + getWidth() + side + side2;
    }
}
