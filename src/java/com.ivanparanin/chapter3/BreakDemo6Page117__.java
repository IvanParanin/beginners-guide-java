package chapter3;

public class BreakDemo6Page117__ {
    public static void main(String args[]) {
        int x = 0, y = 0;
        // здесь метка располагается перед оператором for
        stop1:
        for(x = 0; x < 5; x++) {
            for(y = 0; y < 5; y++) {
                if(y == 2) break stop1;
                System.out.println("x and y: " + x + " " + y);
            }
        }
        System.out.println();

        // здесь метка располагается перед открывающей фигурной скобкой

        for(x = 0; x < 5; x++)
            stop2: {
              for(y = 0; y < 5; y++) {
                  if(y == 2) break stop2;
                  System.out.println("x and y: " + x + " " + y); // TODO
              }
            }
    }
}
