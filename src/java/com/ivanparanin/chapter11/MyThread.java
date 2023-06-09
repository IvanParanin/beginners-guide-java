package chapter11;

class MyThread implements Runnable {
    String thrdName;
    MyThread(String name) {
        thrdName = name;
    }
    // точка входа в поток
    public void run() {
        System.out.println(thrdName + " - запуск");
        try {
            for(int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("B " + thrdName + ", счетчик: " + count);
            }
        }
        catch (InterruptedException exc) {
            System.out.println(thrdName + " - прерван");
        }
        System.out.println(thrdName + " - завершение");
    }
}
class UseThreads {
    public static void main(String[] args) {
        System.out.println("Запуск основного потока");
        // сначала создать объект типа MyThread
        MyThread mt = new MyThread("Child #1"); // создание исполняемого объекта
        // затем сформировать поток на основе этого объекта
        Thread newThrd = new Thread(mt); // формирование потока для этого объекта
        // начать выполнение потока
        newThrd.start(); // запуск потока на выполнение
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
