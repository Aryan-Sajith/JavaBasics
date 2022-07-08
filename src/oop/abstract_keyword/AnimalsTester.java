package oop.abstract_keyword;

public class AnimalsTester {
    public static void main(String[] args) {
        // abstract = abstract classes cannot be instantiated, but they can have
        // subclasses that can be instantiated
        //
        // Abstract methods are declared without an implementation
        //
        // Helps add security and prevent instantiation of ideas that are too
        // generic("Like you want to make an animal... but what type of animal?")

        //Animal animal = new Animal();
        Lion lion = new Lion();
        lion.toSleep();

    }
}
