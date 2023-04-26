package chapter4;

class Car {
    int year;
    int fuelcap;
    int klm;
    Car(int y, int f, int k) {
         year = y;
         fuelcap = f;
         klm = k;
    }

    double fuelneeded(int miles) {
        return (double) miles / klm;
    }
}

class CarConsDemo {
    public static void main(String[] args) {
        Car camry = new Car(2007, 55, 15);
        Car mersedes = new Car(2000, 90, 19);
        double lit;
        int dist = 650;

        lit = camry.fuelneeded(dist);
        System.out.println("Камри понадобится " + lit + " литров для преодоления " + dist + " километров");

        lit = mersedes.fuelneeded(dist);
        System.out.println("Мерседесу понадобится " + lit + " литров для преодоления " + dist + " километров");
    }
}