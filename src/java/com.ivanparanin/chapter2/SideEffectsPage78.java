package chapter2;

public class SideEffectsPage78 {
    public static void main(String args[]) {
        int i = 0;
        /* Значение переменной i инкрементируется несмотря на то
        что проверяемое условие в операторе ложно
         */
        if(false & (++i < 100))
            System.out.println("Эта строка не будет отображаться");
        System.out.println("Оператор if выполняется: " + i); // отображается 1

        /* В данном случае значение переменной i не инкрементируется поскольку
        второй операнд укороченного логического оператора не вычисляется
        а следовательно инкремент пропускается
         */
        if(false && (++i < 100))
            System.out.println("Эта строка не будет отображаться");
        System.out.println("Оператор if выполняется: " + i); // отображается 1
    }
}
