package oop.polymorphism;

public class Boat implements Vehicle {
    @Override
    public void go() {
        System.out.println("The boat begins moving");
    }
}
