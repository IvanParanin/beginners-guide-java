package chapter3;

public class BreakDemoPage113 {
    public static void main(String args[]) {
        int num = 100;
        // выполнять цикл до тех пор, пока квадрат значения
        // переменной i меньше значения переменной num
        for(int i = 0; i < num; i++) {
            if(i * i >= num) break; // прекратить цикл, если i*i>=100
            System.out.print(i + " ");
        }
        System.out.println("Цикл завершен.");
    }
}
