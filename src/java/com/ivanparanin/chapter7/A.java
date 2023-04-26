package chapter7;

public class A {
    int i;
}
class B extends A {
    int i; // переменная i скрывает переменную i из класса А
    B(int a, int b) {
        super.i = a; // переменная из класса А
        i = b; // переменная из класса В
    }
    void show() {
        System.out.println("i в суперклассе: " + super.i);
        System.out.println("i в подклассе: " + i);
    }
}
class UseSuper {
    public static void main(String[] args) {
        B b = new B(1, 2);
        b.show();
    }
}
