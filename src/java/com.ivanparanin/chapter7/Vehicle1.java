package chapter7;

public class Vehicle1 {
    private int passengers;
    private int fuelcap;
    private int mpg;

    Vehicle1(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // возвратить дальность поездки транспортного средства

    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }

    // методы доступа к переменным экземпляра

    void setPassengers(int p) {
        passengers = p;
    }
    void setFuelcap(int f) {
        fuelcap = f;
    }
    void setMpg(int m) {
        mpg = m;
    }
}

    // расширение класса Vehicle для грузовиков
    class Truck extends Vehicle1 {
        private int cargocap; // грузоподъемность в фунтах

        // конструктор для класса Truck
        Truck(int p, int f, int m, int c) {
            // инициализация членов класса с использованием конструктора это класса
            super(p, f, m);
            cargocap = c;
        }

        // методы доступа к переменной cargocap
        int getCargo() {
            return cargocap;
        }

        void setCargo(int c) {
            cargocap = c;
        }
    }

     class TruckDemo {
        public static void main(String[] args) {
            Truck semi = new Truck(2, 200, 7, 44000);
            Truck pickup = new Truck(3, 28, 15, 2000);
            double gallons;
            int dist = 252;

            gallons = semi.fuelneeded(dist);

            System.out.println("Грузовик может перевезти " + semi.getCargo() + " фунтов.");
            System.out.println("Для преодоления " + dist + " миль грузовику требуется " + gallons + " галлонов топлива.\n");

            gallons = pickup.fuelneeded(dist);

            System.out.println("Пикап может перевезти " + pickup.getCargo() + " фунтов.");
            System.out.println("Для преодоления " + dist + " миль пикапу требуется " + gallons + " галлонов топлива.\n");
        }
    }

