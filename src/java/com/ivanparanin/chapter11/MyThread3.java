package chapter11;
// создание нескольких потоков
 class MyThread3 implements Runnable {
    Thread thrd;
    // создать новый поток
    MyThread3(String name) {
        thrd = new Thread(this, name);
        thrd.start(); // начать поток
    }
    // начать выполнение нового потока
    public void run() {
        System.out.println(thrd.getName() + " - запуск");
        try {
            for(int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("В " + thrd.getName() + ", счетчик: " + count);
            }
        }
        catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " - прерван");
        }
        System.out.println(thrd.getName() + " - завершение");
    }
}
class MoreThreads {
     public static void main(String[] args) {
         System.out.println("Запуск основного потока");

         MyThread3 mt1 = new MyThread3("Child #1");
         MyThread3 mt2 = new MyThread3("Child #2"); // создание и запуск на выполнение трех потоков
         MyThread3 mt3 = new MyThread3("Child #3");

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
