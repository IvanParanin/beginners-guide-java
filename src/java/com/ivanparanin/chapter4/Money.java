package chapter4;
import java.util.Scanner; // импортируем класс сканнер

class Money { // создаем класс
   private int sum; // сумма // объявлем переменную
    private int rate; // курс // объявляем переменную
    private int doll; // доллары // объявляем переменную
    Money(int s, int r) { // создаем контруктор и получаем параметры
        sum = s; // присваиваем значения переменным
        rate = r; // присваиваем значения переменным
    }

    //int calculation (int b) {
        //return (int) (b + sum) / rate;
   // }
        //int calc2 (int b) {
            //return doll = b + sum;
       // }
    void isDoll(int b) { // определяем метод и создаем параметр переменную ь, которая получает значение аргумента с консоли ввода
        sum += b; // присваиваем значение переменной сумму после вводимых данных
        System.out.println(b + " прибавили"); // выводм на экран
        doll = sum / rate; // присваиваем переменной значение путем выражения
        System.out.println("Сумма " + sum +  " рублей в долларах " + doll + " по курсу " + rate); // выводим на экран
    }


    }

    class MoneyDemo {
    static Scanner reader = new Scanner(System.in);
        public static void main(String[] args) {
            Money rub = new Money(150000, 62); // через конструктор задаем значения переменных
            Money som = new Money(25700, 84); // через конструктор задаем значения переменных
            int choice = reader.nextInt(); // вызываем ввод с клавиатуры
            int choice2 = reader.nextInt(); // вызываем ввод с клавиатуры

            rub.isDoll(choice); // вызываем метод и передаем ввод с клавиатуры
            som.isDoll(choice2); // вызываем метод и передаем ввод с клавиатуры

            //rub.calculation(14830);
            //rub.calc2(14830);
           // System.out.println(rub.calculation(14830) + " долларов из " + rub.calc2(14830) + " рублей");
            //som.calculation(14830);
           // som.calc2(14830);
            //System.out.println(som.calculation(14830) +" долларов из " + som.calc2(14830) + " сомов");
        }
    }
