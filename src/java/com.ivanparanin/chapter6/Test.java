package chapter6;

/*public class Test {
    // простые типы данных передаются методам по значению
    /* этот метода не может изменить значения агрументов, передаваемых ему при вызове

    void noChange(int i, int j) {
        i = i + j;
        j = -j;
    }
}

class CallByValue {
    public static void main(String[] args) {
        Test ob = new Test();
        int a = 15, b = 20;
        System.out.println("a и b перед вызовом: " + a + " " + b);
        ob.noChange(a, b);
        System.out.println("a и b после вызова: " + a + " " + b);
    }
}
*/

class Test {
    int a, b;
    Test(int i, int j) {
        a = i;
        b = j;
    }
        /* передача объекта методу. Теперь переменные ob.a и ob.b объекта,
        используемого при вызове, также будут изменяться
         */
        void change(Test ob) {
            ob.a = ob.a + ob.b;
            ob.b = -ob.b;
        }
    }
class CallByRef {
    public static void main(String[] args) {
        Test ob = new Test(15, 20);
        System.out.println("ob.a и ob.b перед вызовом: " + ob.a + " " + ob.b);
        ob.change(ob);
        System.out.println("ob.a и ob.b после вызова: " + ob.a + " " + ob.b);
    }
}