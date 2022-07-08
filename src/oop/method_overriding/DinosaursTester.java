package oop.method_overriding;

public class DinosaursTester {
    public static void main(String[] args) {
        // method overriding = Declaring a predefined parent method within
        // a child class. This allows a subclass to implement its own
        // specialized method implementation.
        Dinosaur dinosaur = new Dinosaur();
        TRex tRex = new TRex();

        dinosaur.communicate();
        tRex.communicate();
    }
}
