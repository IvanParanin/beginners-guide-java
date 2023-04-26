package chapter3;

public class FarVarPage106 {
    public static void main(String args[]) {
        int sum = 0, fact = 1;
        for(int i = 1; i <= 5; i++) {
            sum += i; // переменная i доступна во всем цикле
            //fact = *= i;
        }
        System.out.println("Сумма: " + sum);
        System.out.println("Факториал: " + fact);
    }
}
