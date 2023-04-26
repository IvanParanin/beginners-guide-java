package chapter11;

class MyThread1 implements Runnable {
    Thread thrd;
    // создать новый поток
    MyThread1(String name) {
        thrd = new Thread(this, name); // имя присваивается потоку при его создании
        thrd.start(); // запустить поток
    }
    // начать выполнение нового потока
    public void run() {
        System.out.println(thrd.getName() + " - запуск");
        try {
            for(int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("B " + thrd.getName() + ", счетчик: " + count);
            }
        }
        catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " - прерван");
        }
        System.out.println(thrd.getName() + " - завершение");
    }
}
class UseThreads1 {
    public static void main(String[] args) {
        System.out.println("Запуск основного потока");
        // сначала создать объект типа MyThread
        MyThread mt = new MyThread("Child #1"); // создание исполняемого объекта
        // затем сформировать поток на основе этого объекта
        //Thread newThrd = new Thread(mt); // формирование потока для этого объекта
        // начать выполнение потока
        //newThrd.start(); // запуск потока на выполнение
        for(int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException exc) {
                System.out.println("Прерывание основного потока");
            }
        }
        System.out.println("Завершение основного потока");
    }
}
