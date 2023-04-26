package chapter6;

public class Queue2 {
    private char[] q;
    private int putloc, getloc;
    // сконструировать пустую очередь заданного размера
    Queue2(int size) {
        q = new char[size + 1]; // выделить память для очереди
        putloc = getloc = 0;
    }
    // сконструировтаь очередь на основе имеющегося объекта
    Queue2(Queue2 ob) {
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];

        // копировать элементы в очередь
        for(int i = getloc + 1; i <= putloc; i++)
            q[i] = ob.q[i];
    }
    // сконструировтаь очередь на основе массива исходных значений
    Queue2(char[] a) {
        putloc = 0;
        getloc = 0;
        q = new char[a.length + 1];
        for(int i = 0; i < a.length; i++) put(a[i]);
    }
    // поместить символ в очередь
    void put(char ch) {
        if(putloc == q.length - 1) {  // TODO
            System.out.println(" - Очередь заполнена");
            return;
        }
        putloc++;
        q[putloc] = ch;
    }
    // извлечь символ из очереди
    char get() {
        if(getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }
}

class QDemo2 {
    public static void main(String[] args) {
        // создать пустую очередь для хранения 10 эелементов
        Queue2 q1 = new Queue2(10);
        char[] name = {'T', 'o', 'm'};
        // создать очередь на основе массива
        Queue2 q2 = new Queue2(name);
        char ch;
        int i;
        // поместить ряд символов в очередь q1
        for(i = 0; i < 10; i++)
            q1.put((char) ('A' + i));
        // моздать одну очередь на основе другой
        Queue2 q3 = new Queue2(q1);
        // показать очереди
        System.out.print("Содержимое q1: ");
        for(i = 0; i < 10; i++) {
            ch = q1.get();
            System.out.print(ch);
        }
        System.out.println("\n");
        System.out.print("Содержимое q2: ");
        for(i = 0; i < 3; i++) {
            ch = q2.get();
            System.out.print(ch);
        }
        System.out.println("\n");
        System.out.print("Содержимое q3: ");
        for(i = 0; i < 10; i++) {
            ch = q3.get();
            System.out.print(ch);
        }
    }
}
