package chapter1;

public class IfDemoPage48 {
    public static void main(String args[]) {
        int a, b, c;
        a = 3;
        b = 4;

        if (a < b) {
            System.out.println("a меньше b");
        }
        if (a == b) {
            System.out.println("Вы не должны увидеть этот текст");
        }
        System.out.println();

        c = a - b;

        System.out.println("c содержит -1");

        if (c >= 0) {
            System.out.println("c - не отрицательное число");
        }
        if (c < 0) {
            System.out.println("c - отрицательное число");
        }
        System.out.println();

        c = b - a;

        System.out.println("c содержит 1");

        if (c >= 0) {
            System.out.println("c - не отрицательное число");
        }
        if (c < 0) {
            System.out.println("c - отрицательное число");
        }

    }
}
