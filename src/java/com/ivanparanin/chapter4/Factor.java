package chapter4;

public class Factor {
    boolean isFactor(int a, int  b) {
        if((b % a) == 0) return true;
        else return false;

    }
}

class isFact {
    public static void main(String[] args) {
        Factor x = new Factor();

        if(x.isFactor(10, 20)) System.out.println("a делитель b");
        if(x.isFactor(20, 10)) System.out.println("Нет");
    }
}