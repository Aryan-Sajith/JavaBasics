package useful_classes;

import java.util.Scanner;

public class MathClassMethods{
    public static void main(String[] args) {

        double x,y,z; // triangle sides

        Scanner input = new Scanner(System.in); //scanner for user input

        System.out.println("Enter side x: "); //collects first side
        x = input.nextDouble();
        System.out.println("Enter side y: ");//collects second side
        y = input.nextDouble();

        z = Math.sqrt(Math.pow(x,2) + Math.pow(y,2)); // calculates hypotenuse

        System.out.println("The hypotenuse of the triangle is : " + z); //outputs hypotenuse in console

        input.close(); // closes the scanner
    }
}
