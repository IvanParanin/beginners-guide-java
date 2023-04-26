package chapter7;

public class A1 {
    A1() {
        System.out.println("A1");
    }
}
class B1 extends A1 {
    B1() {
        System.out.println("B1");
    }
}
class C1 extends B1 {
    C1() {
        System.out.println("C1");
    }
}
class OrderOfConstruction {
    public static void main(String[] args) {
        C1 c = new C1();
    }
}