package oop.polymorphism;

public class Bicycle implements Vehicle {
    @Override
    public void go() {
        System.out.println("The bicycle begins moving");
    }
}
