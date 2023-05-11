package chapter14;
/* Использование одного и того же функционального интерфейса с тремя
различными лямбда-выражениями.
Функциональный интерфейс принимает два параметра типа int и возвращает результат типа boolean.
 */
public interface NumereticTest {
    boolean test(int n, int m);
}
class LambdaDemo2 {
    public static void main(String[] args) {
        // Данное лямбда-выражение проверяет, кратно ли одно число другому
         NumereticTest isFactor = (n, d) -> (n % d) == 0;
         if(isFactor.test(10,2))
             System.out.println("2 является делителем 10");
         if(!isFactor.test(10, 3))
             System.out.println("3 не является делителем 10");
        System.out.println();
        // Данное лямбда-выражение возвращает true, если оба аргумента равны по абсолютной величине
        NumereticTest absEqual = (n, m) -> (n < 0 ? -n : n) == (m < 0 ? -m : m);
        if(absEqual.test(4, -4))
            System.out.println("Абсолютные величины 4 и -4 равны");
        if(!absEqual.test(4, -5))
            System.out.println("Абсолютные величины 4 и -5 не равны");
    }
}
