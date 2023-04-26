package chapter11;
// расширение класса Thread
public class MyThread2 extends Thread {
    // создать новый поток
    MyThread2 (String name) {
        super(name); // присвоить имя потоку
        start(); // запустить поток
    }
    // начать выполнение нового потока
    public void run() {
        System.out.println(getName() + " - запуск");
        try {
            for(int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("В " + getName() + ", счетчик: " + count);
            }
        }
        catch(InterruptedException exc) {
            System.out.println(getName() + " прерван");
        }
        System.out.println(getName() + " завершение");
    }
}
class ExtendThread {
    public static void main(String[] args) {
        System.out.println("Запуск нового потока");

        MyThread2 mt = new MyThread2("Child #1");
        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("Прерывание основного потока");
            }
        }
        System.out.println("Завершение основного потока");
    }
}
