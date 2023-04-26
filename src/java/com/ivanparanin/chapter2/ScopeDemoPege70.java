package chapter2;

public class ScopeDemoPege70 {
    public static void main(String args[]) {
        int x = 0; // доступна для всего кода в методе main
        if(x == 0) { // начало новой области действия
            int y = 20; // доступна только в данном блоке
            // обе переменные x и y доступны в данном кодовом блоке
            System.out.println("x and y: " + x + " " + y);
            x = y * 2;

        }
        // y = 100; ошибка! В этом месте переменная y недоступна
        // переменная x по прежнему доступна
        System.out.println("x is " + x);
    }
}
