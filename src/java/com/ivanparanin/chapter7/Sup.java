package chapter7;
// динамическая диспетчеризация (демонстрация полиморфизма)
public class Sup {
    void who() {
        System.out.println("who() in Sup");
    }
}
class Sub1 extends Sup {
    void who() {
        System.out.println("who() in Sub1");
    }
}
class Sub2 extends Sup {
    void show() {
        System.out.println("Who() in Sub2");
    }
}
class DynDispDemo {
    public static void main(String[] args) {
        Sup a = new Sup();
        Sub1 b = new Sub1();
        Sub2 c = new Sub2();

        Sup supRef; // ссылочная переменная суперкласса может ссылаться на объект подкласса.
        // этот принцип используется для вызова переопределяемых методов во время выполнения
        supRef = a;
        supRef.who(); // в каждом из этих вызовов выбор версии метода who()

        supRef = b;
        supRef.who(); // осуществляется по типу объекта

        supRef = c;
        supRef.who(); // на который указывает ссылка во время выполнения
    }
}