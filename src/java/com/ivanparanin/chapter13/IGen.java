package chapter13;
// обобщенный интерфейс очереди
public interface IGen <T> {
    // поместить элемент в очередь
    void put(T ch) throws QueueFullException;
    // извлечь элемент из очереди
    T get() throws QueueEmptyException;
}
class QueueFullException extends Exception {
    int size;
    QueueFullException(int s) {
        size = s;
    }
    public String toString() {
        return "\nОчередь заполнена. Максимальный размер очереди: " + size;
    }
}
class QueueEmptyException extends Exception {
    public String toString() {
        return "\nОчередь пуста";
    }
}
// обобщенный класс, реализующий очередь фиксированного размера
class GenQueue <T> implements IGen <T> {
    private T[] q; // массив для хранения элементов очереди
    private int putloc, getloc; // индексы вставки и извлечения элементов очереди
    // создание пустой очереди из заданного массива
    public GenQueue(T[] aRef) {
        q = aRef;
        putloc = getloc = 0;
    }
    // поместить элемент в очередь
    public void put(T obj) throws QueueFullException {
        if(putloc == q.length - 1)
            throw new QueueFullException(q.length);
        q[putloc++] = obj;
    }
    // извлечь элемент из очереди
    public T get()  throws QueueEmptyException {
        if(getloc == putloc)
            throw new QueueEmptyException();
        return q[getloc++];
    }
}
class GenDemo1 {
    public static void main(String[] args) {
        // создать очередь для хранения целых чисел
        Integer[] iStore = new Integer[10];
        GenQueue <Integer> q = new GenQueue<Integer>(iStore);
        Integer iVal;
        System.out.println("Демонстрация очереди чисел типа Integer");
        try {
            for(int i = 0; i < 5; i++) {
                System.out.println("Добавление " + i + " в очередь q");
                q.put(i); // добавить целочисленное значение в очередь q
            }
        }catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();
        try {
            for(int i = 0; i < 5; i++) {
                System.out.print("Получение следующего числа типа Integer из очереди q: ");
                iVal = q.get();
                System.out.println(iVal);
            }
        }catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
        System.out.println();
        // создать очередь для хранения чисел с плавающей точкой
        Double[] dStore = new Double[10];
        GenQueue <Double> q2 = new GenQueue<Double>(dStore);
        Double dVal;
        System.out.println("Деменстрация очереди чисел типа Double");
        try {
            for(int i = 0; i < 5; i++) {
                System.out.println("Добавление " + (double) i / 2 + " в очереди q2");
                q2.put((double) i / 2); // ввести значение типа double в очередь q2
            }
        }catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();
        try {
            for(int i = 0; i < 5; i++) {
                System.out.print("Получение следующего числа типа Double из очереди q2: ");
                dVal = q2.get();
                System.out.println(dVal);
            }
        }catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
    }
}