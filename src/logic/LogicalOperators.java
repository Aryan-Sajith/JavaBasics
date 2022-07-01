package logic;

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        /*
            logical operators = used to connect two or more expressions
                && = AND, both conditions must be true
                || = OR, either condition must be true
                ! = NOT, reverses the boolean value of the condition
         */

        // this uses the and operator
        int temp = 14;
        if(temp>30) {
            System.out.println("It is hot outside");
        }
        else if(temp>=20 && temp<=30) {
            System.out.println("It is warm outside");
        }
        else {
            System.out.println("It is cold outside");
        }

        // this uses the not operator
        Scanner scanner = new Scanner(System.in);
        System.out.println("You are playing a game! Press q or Q to quit");
        String response = scanner.next();

        if(!response.equals("q") && !response.equals("Q")) {
            System.out.println("You are still playing the game *sheesh*");
        }
        else {
            System.out.println("You have quit the game");
        }

    }
}
