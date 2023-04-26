package chapter6;

public class VarArgs2 {
    // здесь msg обычный параметр, а v - массив параметров переменной длины
    static void vaTest(String msg, int...v) {
        System.out.println(msg + v.length);
        for(int i = 0; i < v.length; i++)
            System.out.println("args " + i + ": " + v[i]);
        System.out.println();
    }
    public static void main(String[] args) {
        vaTest("Один аргумент в массиве:", 10);
        vaTest("Три аргумента: ", 1 , 2, 3);
        vaTest("Отсутствуют аргументы в виде массива: ");
    }
}
