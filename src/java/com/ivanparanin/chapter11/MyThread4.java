package com.ivanparanin.chapter11;

class MyThread4 implements Runnable {
    Thread thrd;
    // создать новый поток
    MyThread4(String name) {
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
class MoreThreads2 {
    public static void main(String[] args) {
        System.out.println("Запуск основного потока");
        MyThread4 mt1 = new MyThread4("Child #1");
        MyThread4 mt2 = new MyThread4("Child #2");
        MyThread4 mt3 = new MyThread4("Child #3");

        do {
            System.out.print(".");
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException exc) {
                System.out.println("Прерывание основного потока");
            }
        }while (mt1.thrd.isAlive() ||
                mt2.thrd.isAlive() ||
                mt3.thrd.isAlive());
        System.out.println("Завершение основного потока");
    }
}