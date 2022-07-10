package oop.polymorphism;

public class Car implements Vehicle{
    @Override
    public void go() {
        System.out.println("The car begins moving");
    }
}
