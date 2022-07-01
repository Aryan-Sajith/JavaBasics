package loops;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        // while loop = executes a block of code endlessly as long as a condition remains true

        Scanner scanner = new Scanner(System.in);
        String name = "";

        do{
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        } while(name.isBlank());

        System.out.println("Hello " + name);
    }
}
