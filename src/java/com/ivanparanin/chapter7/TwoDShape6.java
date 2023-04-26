package chapter7;
// многоуровневая иерархия
public class TwoDShape6 {
    private final double width;
    private final double height;
    TwoDShape6(double w, double h) {
        width = w;
        height = h;
    }
    double getWidth() {
        return width;
    }
    double getHeight() {
        return height;
    }
    void showDim() {
        System.out.println("Ширина и высота - " + width + " и " + height);
    }
}
class Triangle5 extends TwoDShape6 {
    private final String style;
    Triangle5(String s, double w, double h) {
        super(w, h); // вызвать конструктор суперкласса с двумя аргументами
        style = s;
    }
    double area() {
        return getWidth() * getHeight() / 2;
    }
    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}
// расширение класса Triangle5
class ColorTriangle extends Triangle5 {
    private final String color;
    ColorTriangle (String c, String s, double w, double h) {
        super(s, w, h);
        color = c;
    }
    void showColor() {
        System.out.println("Цвет - " + color);
    }
}
class Shapes6 {
    public static void main(String[] args) {
        ColorTriangle t1 = new ColorTriangle("Синий", "контурный", 8.0, 12.0);
        ColorTriangle t2 = new ColorTriangle("Красный", "закрашенный", 2.0, 2.0);

        System.out.println("Информация о t1: ");
        t1.showStyle();
        t1.showDim();
        t1.showColor();
        System.out.println("Площадь - " + t1.area());

        System.out.println();

        System.out.println("Информация о t2: ");
        t2.showStyle();
        t2.showDim();
        t2.showColor();
        System.out.println("Площадь - " + t2.area());

    }
}
