package oop.polymorphism.definition;

public class Boat implements Vehicle {
    @Override
    public void go() {
        System.out.println("The boat begins moving");
    }
}
