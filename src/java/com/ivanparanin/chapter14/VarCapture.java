package chapter14;
interface MyFunc {
    int func(int n);
}
public class VarCapture {
    public static void main(String[] args) {
        // локальная переменная, которая может быть захвачена
        int num = 10;
        MyFunc myLambda = (n) -> {
            // Такое использование переменной num корректно, поскольку
            // ее значение не изменяется
            int v = num + n;
            // Ниже инструкция некорректна, поскольку она изменяет значение переменной num
            // num++;
            return v;
        };
        // Использование лямбды. Эта инструкция отобразит число 18.
        System.out.println(myLambda.func(8));
        // Ниже строка породила бы ошибку, поскольку она
        // лишает num статуса финальной переменной
        // num = 9;
    }
}
