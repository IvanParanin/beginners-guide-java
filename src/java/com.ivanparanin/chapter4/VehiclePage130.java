package chapter4;

class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;
    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }
    double fuelneeded(int miles) {

        return(double) miles / mpg;
    }
}

class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(7,16,21);
        Vehicle sportscar = new Vehicle(2, 14,12);
        double gallons;
        int dist = 252;

       /* minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;*/

        gallons = minivan.fuelneeded(dist);
        System.out.println("Фургону требуется " + gallons);

        gallons = sportscar.fuelneeded(dist);
        System.out.println("спортивной машине требуется " +  gallons);
    }
}


