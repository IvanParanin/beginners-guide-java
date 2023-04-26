package chapter7;

public class TwoDShape2 {
    private double width;
    private double height;
    // методы доступа к закрытым переменным экземпляра
    double getWidth() {
        return width;
    }

    public double getHeght() {
        return height;
    }
    void setWidth(double w) {
        width = w;
    }

    public void setHeight(double h) {
        height = h;
    }
    void showDim() {
        System.out.println("Ширина и высота - " + width + height);
    }
}
class Triangle1 extends TwoDShape2 {
    String style;
    double area() {
        return  getWidth() * getHeght() / 2;
    }
    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}
class Shapes2 {
    public static void main(String[] args) {
        Triangle1 t1 = new Triangle1();
        Triangle1 t2 = new Triangle1();

        t1.setWidth(4.0);
        t1.setHeight(4.0);
        t1.style = "закрашенный";

        t2.setWidth(8.0);
        t2.setHeight(12.0);
        t2.style = "контурный";

        System.out.println("Информация о t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Площадь - " +  t1.area());

        System.out.println();

        System.out.println("Информация о t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Площадь - " +  t2.area());
    }
}