package oop.polymorphism.definition;

public class Bicycle implements Vehicle {
    @Override
    public void go() {
        System.out.println("The bicycle begins moving");
    }
}
