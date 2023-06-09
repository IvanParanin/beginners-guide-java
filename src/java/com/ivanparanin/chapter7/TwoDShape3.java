package chapter7;

public class TwoDShape3 {
    private double width;
    private double height;

    // методы доступа к закрытым переменным экземпляра
    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    void setWidth(double w) {
        width = w;
    }
    void setHeight(double h) {
        height = h;
    }
    void showDim() {
        System.out.println("Ширина и высота - " + width + " и " + height);
    }
}
class Triangle2 extends TwoDShape3 {
    private final String style;
    // конструктор
    Triangle2(String s, double w, double h) {
        setWidth(w);
        setHeight(h);
        style = s;
    }
    double area() {
        return getWidth() * getHeight() / 2;
    }
    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}
class Shapes3 {
    public static void main(String[] args) {

        Triangle2 t1 = new Triangle2("Закрашенный", 4.0, 4.0);
        Triangle2 t2 = new Triangle2("Контурный", 8.0, 12.0);

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