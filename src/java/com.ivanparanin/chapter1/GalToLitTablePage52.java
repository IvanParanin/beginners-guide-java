package chapter1;

/*public class GalToLitTablePage52 {
    public static void main (String args[]) {

        double gal;
        double lit;
        int counter = 0;



        for (gal = 1; gal <= 100; gal++) {
            lit = gal * 3.5478;
            System.out.println(gal + " галлонам соответствует " + lit + " литров");

        counter++;
        if(counter == 10) {
            System.out.println();
            counter = 0;
          }
        }
    }
}

 */

/*public class GalToLitTablePage52 {
    public static void main(String args[]) {
        double rub, dol;
        int counter = 0;

        for (dol = 1; dol <= 100; dol++) {
            rub = dol * 64.2;
            System.out.println(dol + " долларам соответствуют " + rub + " рублей");

            counter++;
            if (counter == 5) {
                System.out.println();
                counter = 0;
            }
        }
    }
}

 */


/*public class GalToLitTablePage52 {
    public static void main(String args[]) {
        double som;
        double rub;
        int counter = 0;

        for(som = 10000; som <= 1000000; som = som * 2) {
            rub = som * 1.17;
            System.out.println("На этой неделе я перевел");
            System.out.println("Сомов в рублях " + rub);
        }
            for(som = 10000; som <= 1000000; som = som * 2) {
                rub = som * 1.17;
                System.out.println("На этой неделе я перевел");
                System.out.println("Сомов в рублях "  + rub);

            counter++;
            if(counter == 1) {
                System.out.println();
                counter = 0;
            }
        }
    }
}

 */
 public class GalToLitTablePage52 {
     /*public static void main(String args[]) {
         double dol;
         double rub;
         int counter = 0;

         for(dol = 1; dol <= 100; dol++) {
             rub = dol * 62.5;
             System.out.println(dol + " долларов равны " + rub + " рублей");
             counter++;
             if(counter == 1) {
                 System.out.println();
                 counter = 0;
             }
         }
     }
}


      */

/*public static void main(String[] args) {
    double gal, lit, counter = 0;

    for(gal = 1; gal <= 100; gal++) {
        lit = gal * 3.7854;
        System.out.println(gal + " галлонов содержат " + lit + " литров");
        counter++;
        if(counter == 12) {
            System.out.println();
            counter = 0;

        }
    }

}

 */

    public static void main(String[] args) {
        int min, hour, counter = 0;
        for (hour = 1; hour <= 140; hour++) {
            min = hour * 60;
            System.out.println(hour + " часов в минутах будет: " + min + " минут.");
            counter++;
            if(counter == 7) {
                min = 60 * 7;
                System.out.println("Итого в минутах 7 часов обучения: " + min );
                System.out.println();
                if(counter == 100);
                System.out.println("Итого минут за все обучение: " + min);
                counter = 0;
            }

        }
    }
}







