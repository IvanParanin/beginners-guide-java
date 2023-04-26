package chapter2;

public class RelLogOpsPage76 {
    public static void main(String args[]) {
        int i = 10, j = 11;
        boolean b1 = true, b2 = false;

        if(i < j) System.out.println("i < j");
        if(i <= j) System.out.println("i <= j");
        if(i != j) System.out.println("i != j");
        if(i == j) System.out.println("i == j"); // не сработает
        if(i >= j) System.out.println("i >= j"); // не сработает
        if(i > j) System.out.println("i > j"); // не сработает

        if(b1 & b2) System.out.println("Это не булет выполнено");
        if(!(b1 & b2)) System.out.println("!(b1 & b2): true");
        if(b1 | b2) System.out.println("b1 | b2: true");
        if(b1 ^ b2) System.out.println("b1 ^ b2: true");
    }
}
