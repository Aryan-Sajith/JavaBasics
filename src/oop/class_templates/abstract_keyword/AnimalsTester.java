package oop.class_templates.abstract_keyword;

public class AnimalsTester {
    public static void main(String[] args) {
        // abstract = abstract classes cannot be instantiated, but they can have
        // subclasses that can be instantiated. Usually contain at least one
        // abstract method.
        //
        // Abstract methods are declared without an implementation
        //
        // Helps add security and prevent instantiation of ideas that are too
        // generic("Like you want to make an animal... but what type of animal?")

        Lion lion = new Lion();
        Cow cow = new Cow();

        //shared general method
        lion.toSleep();
        cow.toSleep();

        //unique abstract method
        lion.toEat();
        cow.toEat();

    }
}
