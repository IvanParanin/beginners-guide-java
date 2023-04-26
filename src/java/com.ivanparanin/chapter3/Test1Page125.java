package chapter3;

public class Test1Page125 {
    public static void main(String[] args)
            throws java.io.IOException {
        char ch, ignore;
       // int read;

        do {
            System.out.println("Введите символ");
            ch = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
            if (ch != '.') {
                System.out.println("Попробуйте еще раз.");
            } else {
                System.out.println("Верно");
                //read = System.in.read();
                    //ch = (char) read;
                    //System.out.println("Количество пробелов: " + ch);
                //while (ch != '\n');
               // System.out.println("Количество пробелов: " + ch);
            }
            } while (ch != '.') ;
        }
    }
