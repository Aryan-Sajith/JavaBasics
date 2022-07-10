package oop.polymorphism.definition;

public class Car implements Vehicle{
    @Override
    public void go() {
        System.out.println("The car begins moving");
    }
}
