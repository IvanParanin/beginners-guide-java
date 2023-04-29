package com.ivanparanin.chapter12;

 enum Transport {
     CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}
class EnumDemo {
     public static void main(String[] args) {
         Transport tp; // объявление ссылки на перечисление Transport
         tp = Transport.AIRPLANE; // присваивание переменной tp значения в виде константы AIRPLANE
         // отобразить перечислимое значение
         System.out.println("Значение tp: " + tp);
         System.out.println();
         tp = Transport.TRAIN; // проверка равенства двух объектов типа Transport
         // сравнить два перечислимых значения
         if(tp == Transport.TRAIN)
             System.out.println("tp содержит TRAIN\n");
         // использовать перечисление для управления оператором switch
         switch (tp) {
             case CAR:
                 System.out.println("Автомобиль перевозит людей");
                 break;
             case TRUCK:
                 System.out.println("Грузовик перевозит груз");
                 break;
             case AIRPLANE:
                 System.out.println("Самолет летит");
                 break;
             case TRAIN:
                 System.out.println("Поезд движется по рельсам");
                 break;
             case BOAT:
                 System.out.println("Лодка плывет по воде");
         }
     }
}
