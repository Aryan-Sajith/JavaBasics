package data_structures;

public class Array {
    public static void main(String[] args) {
        //Array = A data structure that stores a collection of similar values
        // in predefined storage capacities

        String[] cars = {"Camaro","Corvette","Tesla","BMW"};
        String[] vehicles = new String[3];

        vehicles[0] = "Train";
        vehicles[1] = "Jet";
        vehicles[2] = "Ship";

        System.out.println("These are the values from the cars array:");
        for(String car: cars) {
            System.out.println(car);
        }

        System.out.println("These are the values from the vehicles array:");
        for(String vehicle: vehicles) {
            System.out.println(vehicle);
        }
    }
}
