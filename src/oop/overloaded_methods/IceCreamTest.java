package oop.overloaded_methods;

import java.util.Scanner;

public class IceCreamTest {
    public static void main(String[] args) {
        String userConfirmation;
        IceCream iceCream = new IceCream();

        System.out.println("Is this your order?");
        System.out.println("Flavor: "+iceCream.getFlavor());
        System.out.println("With a Cone: "+iceCream.isCone());
        System.out.println("Cost: $"+iceCream.getCost());
        System.out.println("Enter Y(Yes) or N(No)");

        Scanner scanner = new Scanner(System.in);
        userConfirmation = scanner.next();
        scanner.close();

        if(userConfirmation.equalsIgnoreCase("y")) {
            System.out.println("Thank you for buying our ice cream!");
        }
        else {
            System.out.println("What went wrong lol?");
        }
    }
}
