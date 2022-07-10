package oop.polymorphism;

public class VehiclesTest {
    public static void main(String[] args) {
        // Polymorphism = A greek word for poly-"many", morph-"form"
        //                The ability for an object identify as more
        //                than one type.
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        //all these objects can identify by the parent class
        Vehicle[] vehicles = {car,bicycle,boat};

        //we can also identify the vehicles to call their overrided go methods
        for(Vehicle vehicle : vehicles) {
            vehicle.go();
        }
    }
}
