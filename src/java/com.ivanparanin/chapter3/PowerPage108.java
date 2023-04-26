package chapter3;

public class PowerPage108 {
    /*public static void main(String args[]) {
        int e, result;
        for(int i = 0; i < 10; i++) {
            result = 1;
            e = i;
            while(e > 0) {
                result = result * 2;
                e--;
            }
            System.out.println("2 в стемени " + i + " равно " + result);
        }
    }


}


     */

public static void main(String[] args) {
    int a, b, c;
    for(a = 0; a <= 10; a++) {
        b = 1;
        c = a;
        while(c > 0) {
            b = b * 2;
            c--;
        }
        System.out.println(a + " " + b);
    }
}
}