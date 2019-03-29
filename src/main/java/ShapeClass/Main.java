package ShapeClass;

public class Main {
    public static void main(String[] args) {
        Shape m = new Quad(3,4,6,9);
        System.out.println(m.areaOf());
        System.out.println(((Quad) m).permOf());

        Triangle l = new Triangle(3,3,3);
        System.out.println(l.areaOf());
        System.out.println(l.getBase());
    }
}
