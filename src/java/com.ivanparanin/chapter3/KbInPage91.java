package chapter3;

/*public class KbInPage91 {
    public static void main(String args[])
        throws java.io.IOException {

        char ch;

        System.out.print("Нажмите нужную клавишу, а зетем клавишу Enter: ");
        ch = (char) System.in.read();
        System.out.println("Вы нажали клавишу " + ch);
    }
}

 */

public class KbInPage91 {
    /*public static void main(String args[])
            throws java.io.IOException {
        char ch; //result = 'a';
        do {

            System.out.println("Введте любой символ");

            ch = (char) System.in.read();
            System.out.println("Вы нажали: " + ch);
        } while (ch != 'a');
        System.out.println("Верно");
        if (ch > 'a') {
            System.out.println("Неверно");
        }
    }
}

     */
    public static void main(String[] args)
            throws java.io.IOException {
        char ch, ignore;

        System.out.println("Нажмите");
        ch = (char) System.in.read();

        for (; ;) {
            ch = (char) System.in.read();
            if (ch == 's') break;
            System.out.println("Неверно");
            ignore = (char) System.in.read();
            if(ignore != '\n')  {
                if (ch > 's') {
                    System.out.println("Ближе к началу алфавита");
                    System.out.println("Попробуйте еще раз");
                    System.out.println();
                } else if (ch < 's') {
                    System.out.println("Ближе к концу алфавита");
                    System.out.println("Попробуйте еще раз");
                    System.out.println();
                }
            }
            System.out.println("Нажмите еще раз клавищу");
            //ch = (char) System.in.read();
        }
            System.out.println("Верно");
         /*}do {
           System.out.println("Нажмите");
           ch = (char) System.in.read();
       }
       while(ch != 's');
          */
        }
    }


