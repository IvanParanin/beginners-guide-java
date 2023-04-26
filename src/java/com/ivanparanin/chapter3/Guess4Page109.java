package chapter3;

public class Guess4Page109 {
    public static void main(String args[])
            throws java.io.IOException {

        char ch, ignore, answer = 'S';
        do {
        System.out.println("Задумана буква из диапазона A-Z.");
        System.out.print("Попытайтесь угадать: ");

        ch = (char) System.in.read();


            do {
                ignore = (char) System.in.read();
            }
            while (ignore != '\n');

        if(ch == answer) System.out.println("** Правильно! **");
        else {
            System.out.println("... Извините, нужная буква находится.");
            if(ch < answer)
                System.out.println("Ближе к концу алфавита");
            else System.out.println("Ближе к началу алфавита");
            System.out.println("Повторите попытку!\n");
        }
    } while (answer != ch);
  }
}
