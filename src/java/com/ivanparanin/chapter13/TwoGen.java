package chapter13;

public class TwoGen <T, V> {
    T ob1;
    V ob2;
    // Передать конструктору класса ссылки на объекты T и V
    TwoGen(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }
    // Отобразить типы T и V
    void showTypes() {
        System.out.println("Тип Т - это " + getClass().getName());
        System.out.println("Тип V - это " + getClass().getName());
    }
    T getob1() {
        return ob1;
    }
    V getob2() {
        return ob2;
    }
}
// Демонстрация класса TwoGen
class SimpGen {
    public static void main(String[] args) {
        TwoGen <Integer, String> tgObg = new TwoGen <Integer, String> (88, "Обобщения");
        // Отобразить типы
        tgObg.showTypes();
        // Получить и отобразить значения
        int v = tgObg.getob1();
        System.out.println(v);
        String str = tgObg.getob2();
        System.out.println(str);
    }
}
