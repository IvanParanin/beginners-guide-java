package chapter8;

 interface Series {
    int getNext();
    void reset();
    void setStart(int x);
}
public class ByTwos implements Series {
    int start;
    int val;
    ByTwos() {
        start = 0;
        val = 0;
    }
    public int getNext() {
        val += 2;
        return val;
    }
    public void reset() {
        start = 0;
        val = 0;
    }
    public void setStart(int x) {
        start = x;
        val = x;
    }
}
class ByThrees implements Series {
    int start;
    int val;

    ByThrees() {
        start = 0;
        val = 0;
    }


    public int getNext() {
        val += 3;
        return val;
    }
    public void reset() {
        start = 0;
        val = 0;
    }

    public void setStart(int x) {
        start = x;
        val = x;
    }
}
class SeriesDemo {
    public static void main(String[] args) {
        ByTwos ob1 = new ByTwos();
        ByThrees ob2 = new ByThrees();
        Series ob;
        for(int i = 0; i < 5; i++) {
            ob = ob1;
            System.out.println("Следующее значение ByTwos: " + ob.getNext());
        }
        ob = ob2;
        System.out.println("Следующее значение ByThrees: " + ob.getNext());


       /* for(int i = 0; i < 5; i++)
            System.out.println("Следующее значение: " + ob.getNext());
        System.out.println("\nСброс");
        ob.reset();
        for(int i = 0; i < 5; i++)
            System.out.println("Следующее значение: " + ob.getNext());
        System.out.println("\nНачальное значение: 100");
        ob.setStart(100);
        for(int i = 0; i < 5; i++)
            System.out.println("Следующее значение: " + ob.getNext());

        */
    }
}
