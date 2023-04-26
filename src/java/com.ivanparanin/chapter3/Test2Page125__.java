package chapter3;

public class Test2Page125__ {
    public static void main(String[] args) {
       /* int a;
        for(a = 1000; a >= 0; a -= 2)
            System.out.println("Значения от 1000 до 0 с шагом -2: " + a);
    }

        */


       /* int num = 7, sum = 1, count;
        for (int i = 0; i < num; i++) {
            sum += i;
            count = i;
            System.out.println(i + " " + sum + " " + count);
        }

        */

        for(int i = 0; i < 10; i++){
            System.out.print(i + " ");
            if((i % 2) == 0) continue; // TODO
            System.out.println();
        }
    }
}