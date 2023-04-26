package chapter11;

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
        
    }
}