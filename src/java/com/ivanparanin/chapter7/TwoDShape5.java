package chapter7;
// добавление дополнительных конструкторов
public class TwoDShape5 {
    private final double width;
    private final double height;
    // конструктор по умолчанию
    TwoDShape5() {
        width = height = 0.0;
    }
    // параметризированный конструктор
    TwoDShape5(double w, double h) {
        width = w;
        height = h;
    }
    // конструирование объекта с одинаковыми значениями переменных экземпляра
    TwoDShape5(double x) {
        width = height = x;
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
class Triangle4 extends TwoDShape5 {
    private final String style;
    // конструктор по умолчанию
    Triangle4() {
        super(); // вызывть конструкторы суперкласса по умолчанию
        style = "none";
    }
    // конструктор
    Triangle4(String s, double w, double h) {
        super(w, h); // вызвать конструктор суперкласса с двумя аргументами
        style = s;
    }
    // конструктор с одним аргументом
    Triangle4(double x) {
        super(x); // вызвать конструктор суперкласса с одним аргументом
        style = "закрашенный";
    }
    double area() {
        return getWidth() * getHeight() / 2;
    }
    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}
class Shapes5 {
    public static void main(String[] args) {
        Triangle4 t1 = new Triangle4();
        Triangle4 t2 = new Triangle4("Контурный", 8.0, 12.0);
        Triangle4 t3 = new Triangle4(4.0);
        t1 = t2;

        System.out.println("Информация о t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Площадь - " + t1.area());

        System.out.println();

        System.out.println("Информация о t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Площадь - " + t2.area());

        System.out.println();

        System.out.println("Информация о t3: ");
        t3.showStyle();
        t3.showDim();
        System.out.println("Площадь - " + t3.area());

        System.out.println();
    }
}
