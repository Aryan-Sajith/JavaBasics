package logic.exception_handling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Exceptions = An even that occurs during the execution of a program
        // that disrupt the programs logical flow
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter a dividend: ");
            int x = scanner.nextInt();
            System.out.println("Enter a dividend: ");
            int y = scanner.nextInt();
            int z = x / y;
            System.out.println("Result of division: " + z);
        }
        catch (ArithmeticException e) {
            System.out.println("You can't divide by zero IDIOT");
        }
        catch (InputMismatchException e) {
            System.out.println("PLEASE USE NUMBERS YOU TROLL!!!!");
        }
        catch (Exception e) {
            System.out.println("Something went wrong!");
        }
        //finally block always runs... a good use to close open scanners/files
        finally {
            scanner.close();
        }
    }
}
