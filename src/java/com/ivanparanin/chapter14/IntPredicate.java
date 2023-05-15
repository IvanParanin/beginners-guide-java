package chapter14;

public interface IntPredicate {
    boolean test(int n);
}
// данный класс определяет три статических метода, которые проверяют
// соответствие целевого числа определенным условиям
class MyIntPredicates {
    // статический метод, который возвращает true, если заданное число простое
    static boolean isPrime(int n) {
        if(n < 2) return false;
        for(int i = 2; i <= n / i; i++) {
            if((n % i) == 0)
                return false;
        }
        return true;
    }

    // статический метод, который возвращает true, если заданное число четное
    static boolean isEven(int n) {
        return (n % 2) == 0;
    }
    // статический метод, который возвращает true, если заданное чилсло положительное
    static boolean isPositive(int n) {
        return n > 0;
    }
}
class MethodRefDemo {
    /* В данном методе типом первого параметра является функциональный интерфейс. Следовательно,
     ему можно передать ссылку на любой экземпляр этого интерфейса, в том числе и на экземпляр,
     созданный посредством ссылки на метод.
     */
    static boolean numTest(IntPredicate p, int v) {
        return p.test(v);
    }
    public static void main(String[] args) {
        boolean result;
        result = numTest(MyIntPredicates :: isPrime, 17);
        if(result)
            System.out.println("17 - простое число");
        result = numTest(MyIntPredicates :: isEven, 12);
        if(result)
            System.out.println("12 - четное число");
        result = numTest(MyIntPredicates :: isPositive, 11);
        if(result)
            System.out.println("11 - положительное число");
    }
}
