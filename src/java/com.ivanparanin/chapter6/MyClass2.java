package chapter6;

public class MyClass2 {
    int x;
    MyClass2() { // конструирование объктов разными способами
        System.out.println("Внктри MyClass2().");
        x = 0;
    }
    MyClass2(int i) { //
        System.out.println("Внутри MyClass2(int).");
        x = i;
    }
    MyClass2(double d) { //
        System.out.println("Внутри MyClass2(double).");
        x = (int) d;
    }
    MyClass2(int i, int j) { //
        System.out.println("Внутри MyClass2(int, int).");
        x = i * j;
    }
}
class OverloadConsDemo {
    public static void main(String[] args) {
        MyClass2 t1 = new MyClass2();
        MyClass2 t2 = new MyClass2(88);
        MyClass2 t3 = new MyClass2(17.23);
        MyClass2 t4 = new MyClass2(2, 4);
        System.out.println("t1.x: " + t1.x);
        System.out.println("t2.x: " + t2.x);
        System.out.println("t3.x: " + t3.x);
        System.out.println("t4.x: " + t4.x);

    }
}
