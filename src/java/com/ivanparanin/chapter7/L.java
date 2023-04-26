package chapter7;
// методы с разными сигнатурами не переопределяются, а перегружаются
public class L {
    int i, j;
    L(int a, int b) {
        i = a;
        j = b;
    }
    void show() {
        System.out.println(i + " " + j);
    }
}
class K extends L {
    int c;
    K(int a, int b, int d) {
        super(a, b);
        c = d;
    }
    // перегрузить метод show
    void show(String msg) {
        System.out.println(msg + " " + c);
    }
}
class Overload{
    public static void main(String[] args) {
        K k = new K(1,2,3);
        k.show("K ");
        k.show();
    }
}
