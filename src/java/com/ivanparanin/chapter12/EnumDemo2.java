package com.ivanparanin.chapter12;
// использование встроенных методов перечислений
public class EnumDemo2 {
    public static void main(String[] args) {
        Transport tp;
        System.out.println("Константы Transport:");
        // применение метода values()
        Transport[] allTransports = Transport.values(); // получение массива констант типа Transport
        for(Transport t: allTransports)
            System.out.println(t);
        System.out.println();
        // пременение метода valueOf()
        tp = Transport.valueOf("AIRPLANE"); // получение константы AIRPLANE
        System.out.println("tp содержит " + tp);
    }
}
