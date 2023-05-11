package chapter14;
/* Блочное лямбда-выражение, предназначенное для нахождения
наименьшего положительного делителя заданного целого числа
 */
public interface NumericFunc {
    int func(int n);
}
/* class BlockLambdaDemo {
    public static void main(String[] args) {
        // Данное блочное лямбда-выражение возвращает наименьший
        // положительный делитель заданного целого числа
        NumericFunc smallestF = (n) -> { // блочное лямбда-выражение
            int result = 1;
            n = n < 0 ? -n : n;
            for(int i = 2; i < n / i; i++)
                if((n % i) == 0) {
                    result = i;
                    break;
                } // блочное лямбда-выражение
            return result;
        };
        System.out.println("Наименьшим делителем 12 является " + smallestF.func(12));
        System.out.println("Наименьшим делителем 11 является " + smallestF.func(11));

 */
 class Func1 implements NumericFunc {
        public int func (int n) {
            NumericFunc smallestF = (a) -> { // блочное лямбда-выражение
                int result = 1;
                a = a < 0 ? -a : a;
                for (int i = 2; i < a / i; i++)
                    if ((a % i) == 0) {
                        result = i;
                        break;
                    } // блочное лямбда-выражение
                return result;
            };
            return n; // TODO разобраться
        }
 }
 class BlockLambdaDemo {
    public static void main(String[] args) {
        Func1 num = new Func1();
        System.out.println("Наименьшим делителем 12 является "+num.func(12));
        System.out.println("Наименьшим делителем 11 является "+num.func(11));
        }
    }
