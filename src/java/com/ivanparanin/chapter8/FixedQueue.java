package chapter8;
// интерфейс для очереди символов
/*public interface ICharQ {
    // поместить символ в очередь
    void put(char);
    // извлечь символ из очереди
    char get();
}
public class FixedQueue {
    private char[] q; // массив для хранения элементов в очереди
    private int putloc, getloc; // индексы вставляемых и извлекаемых элементов

    // создать пустую очередь заданного размера
    public FixedQueue(int size) {
        q = new char[size + 1]; // выделить память для очереди
        putloc = getloc = 0;
    }
    // поместить символ в очередь
    public void put(char ch) {
        if(putloc == q.length - 1) {
            System.out.println(" - Очередь заполнена");
            return;
        }
        putloc++;
        q[putloc] = ch;
    }
    // извлечь символ из очереди
    public char get() {
        if(getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }
}
// кольцевая очередь
class CircularQueue implements ICharQ {
    private char[] q; // массив для хранения элементов очереди
    private int putloc, getloc; // индексы вставляемых и извлекаемых элементов

    // создать пустую очередь заданного размера
    public CircularQueue(int size) {
        q = new char[size + 1]; // выделить память для очереди
        putloc = getloc = 0;
    }
    // поместить символ в очередь
    public void put(char ch) {
        /* Очередь считается полной, если индекс putloc на единицу меньше индекса getloc
        или индекс putloc указывает на конец массива, а индекс getloc - на его начало */
        /*if((putloc + 1 == getloc) | ((putloc == q.length - 1) & (getloc == 0))) {
            System.out.println(" - Очередь заполнена");
            return;
        }
        putloc++;
        if(putloc == q.length) putloc = 0; // перейти в начало массива
        q[putloc] = ch;
    }
    // извлечь символ из очереди
    public char get() {
        if(getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        getloc++;
        if(getloc == q.length) getloc = 0; // вернуться в начало очереди
        return q[getloc];
    }
}
class DynQueue implements ICharQ {
    private char[] q; // массив для хранения элементов очереди
    private int putloc, getloc; // индексы вставляемых и извлекаемых элементов
    // создать пустую очередь заданного размера
    public DynQueue(int size) {
        q = new char[size + 1]; // выделить память для очереди
        putloc = getloc = 0;
    }
    // поместить символ в очередь
    public void put(char ch) {
        if (putloc == q.length - 1) {
            // увеличить размер очереди
            char[] t = new char[q.length * 2];
            // скопировтаь элементы в новую очередь
            for (int i = 0; i < q.length; i++) {
                t[i] = q[i];
            q = t;
        }
        putloc++;
        q[putloc] = ch;
    }
    }
    // извлеч символ из очереди
    public char get() {
        if(getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }
}
// демонстрация трех реализаций интерфейса ICharQ
class IQDemo {
    public static void main(String[] args) {
        FixedQueue q1 = new FixedQueue(10);
        DynQueue q2 = new DynQueue(5);
        CircularQueue q3 = new CircularQueue(10);

        ICharQ iQ;

        char ch;
        int i;

        iQ = q1;
        // поместить ряд символов в очередь фиксированного размера
        for(i = 0; i < 10; i++)
            iQ.put((char) ('A + i'));
        // отобразить содержимое очереди
        System.out.print("содержимое фиксированной очереди: ");
        for(i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ = q2;
        // поместить ряд символов в динамическую очередь
        for(i = 0; i < 10; i++)
            iQ.put((char) ('Z' - i));
        // отобразить содержимое очереди
        System.out.print("Содержимое динамической очереди: ");
        for(i = 0; i < 10; i++) {
            ch = iQ.get()
            System.out.print();
        }
        System.out.println();

        iQ = q3;
        // поместить ряд символов в кольцевую очередь
        for(i = 0; i < 10; i++)
            iQ.put((char) ('A' + i));
        // отобразить содержимое очереди
        System.out.print("Содержимое кольцевой очереди: ");
        for(i = 0; i < 1-; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        // поместить больше символов в кольцевую очередь
        for(i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println("\nСохранение и испольование данных кольцевой очереди");
        // поместить символы в кольцевую очередь и извлечь их оттуда
        for(i = 0; i < 20; i++) {
            iQ.put((char) ('A' + i));
            ch = iQ.get();
            System.out.print(ch);
        }
    }
}

         */
