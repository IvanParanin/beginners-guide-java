package chapter7;
// переопределиение метода
public class N {
    int i, j;
    N(int a, int b) {
        i = a;
        j = b;
    }
    void show() {
        System.out.println(i + " " + j);
    }
}
class M extends N {
    int k;
    M(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    void show() {// метод используется из класса N
        super.show();
        System.out.println(k);
    }
}
class Override {
    public static void main(String[] args) {
        M subOb = new M(1, 2, 3);
        //N ob = new N(5,6);
        subOb.show(); // вызвать из класса M
       // ob.show();
    }
}