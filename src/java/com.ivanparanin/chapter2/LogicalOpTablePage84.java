package chapter2;

/*public class LogicalOpTablePage84 {
    public static void main(String args[]) {


        System.out.println("p     \tq   \tp&q \tp|q \tp^q \t!p");
        System.out.println("false\tfalse\tfalse\tfalse\tfalse\ttrue");
        System.out.println("true\tfalse\tfalse\ttrue\ttrue\tfalse");
        System.out.println("false\ttrue\tfalse\ttrue\ttrue\true");
        System.out.println("true\ttrue\ttrue\ttrue\tfalse\tfalse");
       }
    }

 */

/*class LogicalOpTablePage84 {
    public static void main(String args[]) {
        boolean p,q;
        System.out.println("P   \tQ   \tAND   \tOR   \tXOR   \tNOT");

        p = false;
        q = false;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));

        p = true;
        q = false;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));

        p = false;
        q = true;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));

        p = true;
        q = true;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));
    }
}


 */


class LogicalOpTablePage84 {
    public static void main(String args[]) {
        boolean p,q;
        System.out.println("P   \tQ   \tAND   \tOR   \tXOR   \tNOT");

        p = false;
        q = false;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));

        p = true;
        q = false;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));

        p = false;
        q = true;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));

        p = true;
        q = true;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));
    }
}
/* Видоизменить программу так чтобы вместо логических true и false отображались значения 1 и 0
это потребует больших усилий чем кажется на первый взгляд
 */