package ShapeClass;

public class Shape {
    private int length;
    private int width;

    public int getLength(){
        return this.length;
    }

    public int getWidth(){
        return this.width;
    }
    public void setLength(int length){
        this.length = length;
    }
    public void setWidth(int width){
        this.width = width;

    }
    public double areaOf(){
        return width * length;
    }

    public Shape(){

    }

    public Shape(int length, int width){
        this.length = length;
        this.width = width;
    }

}
