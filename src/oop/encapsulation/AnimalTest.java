package oop.encapsulation;

public class AnimalTest {
    public static void main(String[] args) {
        // Encapsulation = The idea that attributes of a class will be hidden/
        // private. They can only be accessed through getter/setter methods.
        // Generally good practice to make class attributes private.

        Animal animal = new Animal("Human", "Omnivorous",4);

        //getter methods
        System.out.println(animal.getName());
        System.out.println(animal.getAge());
        System.out.println(animal.getMealType());

        //setter methods
        animal.setAge(5);
        System.out.println(animal.getAge());
    }
}
