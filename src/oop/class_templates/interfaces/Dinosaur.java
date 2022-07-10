package oop.class_templates.interfaces;

public class Dinosaur implements Predator,Prey{
    @Override
    public void hunt() {
        System.out.println("The larger dinosaur is hunting");
    }

    @Override
    public void flee() {
        System.out.println("The smaller dinosaur is fleeing");
    }
}
