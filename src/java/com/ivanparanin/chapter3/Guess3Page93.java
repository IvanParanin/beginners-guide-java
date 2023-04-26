package chapter3;

public class Guess3Page93 {
    public static void main(String args[])
            throws java.io.IOException {

        char ch, answer = 'S';

        System.out.println("Задумана буква из диапазона A-Z.");
        System.out.print("Попытайтесь угадать: ");

        ch = (char) System.in.read();

        if(ch == answer) System.out.println("** Правильно! **");
        else {
            System.out.println("... Извините, нужная буква находится.");
            if(ch < answer)
                System.out.println("Ближе к концу алфавита");
            else System.out.println("Ближе к началу алфавита");
        }
    }
}
