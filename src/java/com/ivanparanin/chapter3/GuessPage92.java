package chapter3;

public class GuessPage92 {
    public static void main(String args[])
        throws java.io.IOException {

        char ch, answer = 'S';

        System.out.println("Задумана буква из диапазона A-Z.");
        System.out.print("Попытайтесь угадать: ");

        ch = (char) System.in.read();

        if(ch == answer) System.out.println("** Правильно! **");
    }
}
