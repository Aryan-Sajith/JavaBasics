package oop.polymorphism.dynamic_polymorphism;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Dynamic Polymorphism = The ability of an object to take on multiple forms
        // after compilation(during runtime).
        Animal animal;
        Scanner scanner = new Scanner(System.in);

        System.out.println("What animal do you want?");
        System.out.println("1 = Lion, 2 = Wolf");
        int userChoice = scanner.nextInt();
        scanner.close();

        if(userChoice == 1) {animal = new Lion(); animal.speak();}
        else if(userChoice == 2)  {animal = new Wolf(); animal.speak();}
        else {
            animal = new Animal();
            System.out.println("That choice was invalid");
            animal.speak();
        }
    }
}
