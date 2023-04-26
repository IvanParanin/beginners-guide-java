package chapter1;

/*public class HomeWork10Page55 {
    public static void main (String args[]) {

        double d;
        double m;
        int counter = 0;



        for (d = 1; d <= 144; d++) {
            m = d * 39.37;
            System.out.println(d + " дюймов равны " + m + " метров");

            counter++;
            if(counter == 12) {
                System.out.println();
                counter = 0;
            }
        }
    }
}

 */

public class HomeWork10Page55 {
    public static void main(String args[]) {
        double d;
        double m;
        int counter = 0;
        for(m = 1; m <= 144; m++) {
            d = m * 39.37;
            System.out.println(d + " дюймов равны " + m + " метров");
            counter++;
            if(counter == 12) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
