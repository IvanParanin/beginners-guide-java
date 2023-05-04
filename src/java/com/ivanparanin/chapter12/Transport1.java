package chapter12;

public enum Transport1 {
    CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);
    private int speed; // типичная скорость транспортного средства // добавление переменной экземпяра
    // конструктор
    Transport1(int s) {
        speed = s;
    }
    // метод
    int getSpeed() {
        return speed;
    }
}
class EnumDemo3 {
    public static void main(String[] args) {
        // отобразить скорость самолета
        System.out.println("Типичная скорость самолета: " + Transport1.AIRPLANE.getSpeed() + " миль в час\n");
        // отобразить все виды транспорта и скорости их движения
        System.out.println("Типичные скорости движения транспортных средсв: ");
        for(Transport1 t: Transport1.values())
            System.out.println(t + ": " + t.getSpeed() + "  миль в час");
    }
}
