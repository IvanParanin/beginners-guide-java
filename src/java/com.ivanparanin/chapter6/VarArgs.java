package chapter6;

public class VarArgs {
    static void vaTest(int...v) { // допускает переменное число аргументов
        System.out.println("Количество аргументов: " + v.length);
        System.out.println("Содержимое: ");
        for(int i = 0; i < v.length; i++)
            System.out.println("args " + i + ": " + v[i]);
        System.out.println();
    }
    public static void main(String[] args) {
        // метод vaTest может вызываться с переменным числом аргументов
        vaTest(10);
        vaTest(1, 2, 3);
        vaTest();
    }
}
