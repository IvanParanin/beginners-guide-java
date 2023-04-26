package chapter3;

public class BreakDemo2Page114 {
    public static void main(String args[])
        throws java.io.IOException {
        char ch;
        for( ;; ) {
            ch = (char) System.in.read(); // получить символ с клавиатуры
            if (ch == 'q') break; // бесконечный цикл завершен
        }
        System.out.println("Вы нажали клавишу q!");
    }
}
