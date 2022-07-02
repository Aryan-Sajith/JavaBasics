package useful_classes;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);// This initializes a scanner object

        System.out.println("What is your name?");// User Inputting
        String name = scanner.nextLine();
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is your favorite food?");
        String food = scanner.nextLine();
        scanner.close();

        System.out.println("Hello " + name);// Output
        System.out.println("You are " +age+ " years old");
        System.out.println("You like " +food);

    }
}
