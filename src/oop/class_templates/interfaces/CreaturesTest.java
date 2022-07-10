package oop.class_templates.interfaces;

public class CreaturesTest {
    public static void main(String[] args) {
        // Interfaces = A template that can be applied to a class
        // Classes can apply multiple interfaces, but only extend one superclass
        //
        // Interfaces contain ONLY abstract methods and cannot be instantiated
        Rabbit rabbit = new Rabbit();
        Wolf wolf = new Wolf();
        Dinosaur tRex = new Dinosaur();
        Dinosaur triceratops = new Dinosaur();

        tRex.hunt();
        triceratops.flee();
        wolf.hunt();
        rabbit.flee();

    }
}
