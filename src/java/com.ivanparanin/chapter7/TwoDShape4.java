package chapter7;

public class TwoDShape4 {
    private double width;
    private double height;
    TwoDShape4(double w, double h) {
        width = w;
        height = h;
    }
    // методы доступа
    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    //void setWidth(double w) {
       // width = w;
    //}
   // void setHeight(double h) {
     //   height = h;
    //}
    void showDim() {
        System.out.println("Ширина и высота - " + width + " и " + height);
    }
}
class Triangle3 extends TwoDShape4 {
    private final String style;
    Triangle3(String s, double w, double h) {
        super(w, h); // вызвать конструктор суперскласса
        style = s;
    }
    double area() {
        return getWidth() * getHeight() / 2;
    }
    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}
class Shapes4 {
    public static void main(String[] args) {
        Triangle3 t1 = new Triangle3("Закрашенный", 4.0, 4.0);
        Triangle3 t2 = new Triangle3("Контурный", 8.0, 12.0);

        System.out.println("Информация о t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Площадь - " + t1.area());

        System.out.println();

        System.out.println("Информация о t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Площадь - " + t2.area());
    }
}