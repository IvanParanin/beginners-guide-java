package chapter7;

public class TwoDShape8 {
    private final double width;
    private final double height;
    private final String name;
    TwoDShape8(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }
    TwoDShape8(double x, String n) {
        width = height = x;
        name = n;
    }
    TwoDShape8(TwoDShape8 ob) { // создать один объект на основе другого
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }
    public double getHeight() {
        return height;
    }
    public double getWidth() {
        return width;
    }
    String getName() {
        return name;
    }
    void showDim() {
        System.out.println("Ширина и высота - " + width + height);
    }
    double area() {
        System.out.println("Метод area() должен быть переопределен");
        return  0.0;
    }
}
class Triangle7 extends TwoDShape8 {
    private String style;
    Triangle7(String s, double w, double h) {
        super(w, h, "треугольник");
        style = s;
    }
    Triangle7(double x) {
        super(x, "закрашенный");
    }
    void showStyle() {
        System.out.println("Треугольник " + style);
    }
    double area() { // переопределение метода для класса Triangle
        return  getHeight() * getWidth() / 2;
    }
}
class Rectangle extends TwoDShape8 {
    Rectangle(double w, double h) {
        super(w, h, "прямоугольник"); // вызвать конструктор суперкласса
    }
    Rectangle(double x) {
        super(x, "прямоугольник");
    }
    Rectangle(Rectangle ob) {
        super(ob);
    }
    boolean isSquare() {
        if(getWidth() == getHeight()) return true;
        return false;
    }
    double area() { // переопределить метод area() для класса Rectangle
        return getWidth() * getHeight();
    }
}
class DynShapes {
    public static void main(String[] args) {
       TwoDShape8[] shapes = new TwoDShape8[5];
       shapes [0] = new Triangle7("контурный", 8.0, 12.0);
       shapes [1] = new Rectangle(10);
       shapes [2] = new Rectangle(10, 4);
       shapes [3] = new Triangle7(7.0);
       shapes [4] = new TwoDShape8(10, 20, "фигура");

       for(int i = 0; i < shapes.length; i++) {
           System.out.println("Объект - " + shapes[i].getName());
           System.out.println("Площадь - " + shapes[i].area());
           System.out.println();
       }
    }
}

