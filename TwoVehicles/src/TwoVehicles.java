// This program creates two Vehicles objects

class Vehicle {
    int passengers, fuelcap, mpg;
}

class TwoVehicles {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        int range1, range2;

        // assign values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelcap = 12;
        minivan.mpg = 21;

        // assign values to fields in sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        // Compute the ranges assuming a full tank of gas
        range1 = minivan.fuelcap * minivan.mpg;
        System.out.println("Minivan can carry " + minivan.passengers + " with a range of " + range1);

        range2 = sportscar.fuelcap * sportscar.mpg;
        System.out.println("Sportscar can carry " + sportscar.passengers + " with a range " + range2);
    }
}
