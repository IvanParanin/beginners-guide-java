package chapter3;

public class DWDemoPage109 {
    /*public static void main(String args[])
        throws java.io.IOException {
        char ch;
        do {
            System.out.print("Нажмите нужную клавишу, а затем клавишу <ENTER>: ");
            ch = (char) System.in.read(); // получить символ с клавиатуры
        }
        while (ch != 'q');
    }
}

     */

    public static void main(String[] args)
            throws java.io.IOException {
        char ch, ignore;

        System.out.println("Нажмите");

        do {
            ch = (char) System.in.read();
            do {
                ignore = (char) System.in.read();

            }while (ignore != '\n');
            if (ch > 's') {
                System.out.println("Ближе к началу алфавита");
                System.out.println("Попробуйте еще раз");
                System.out.println();

                } else if (ch < 's') {
                System.out.println("Ближе к концу алфавита");
                System.out.println("Попробуйте еще раз");
                System.out.println();

                System.out.println("Нажмите еще раз клавищу");
                //answer = (char) System.in.read();
            } else {
                System.out.println("Верно");
            }
        }while (ch != 's');
    }
}