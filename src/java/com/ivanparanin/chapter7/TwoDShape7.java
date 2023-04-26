package chapter7;

public class TwoDShape7 {
    private final double width;
    private final double height;
    TwoDShape7(double w, double h) {
        width = w;
        height = h;
    }
    TwoDShape7(TwoDShape7 ob) { // создать один объект на основе другого
        width = ob.width;
        height = ob.height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
    void showDim() {
        System.out.println("Ширина и высота - " + width + height);
    }
}
class Triangle6 extends TwoDShape7 {
    private final String style;
    Triangle6(String s, double w, double h) {
        super(w, h);
        style = s;
    }
    // создадим один объект на основе другого
    Triangle6(Triangle6 ob) {
        super(ob);
        style = ob.style;
    }
    double area() {
        return  getHeight() * getWidth() / 2;
    }
    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}
class Shapes7 {
    public static void main(String[] args) {
        Triangle6 t1 = new Triangle6("контурный", 8.0, 12.0);
        Triangle6 t2 = new Triangle6(t1);

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

