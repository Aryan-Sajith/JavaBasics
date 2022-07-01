package logic;

import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {
        // if,else statements = Executes code on a conditional basis

        Scanner input = new Scanner(System.in);//opens scanner

        System.out.println("How old are you?");//gathers age info
        int age = input.nextInt();

        input.close();//closes the scanner

        //categorizes your stage in life based on age
        if(age>=75) {
            System.out.println("You are a senior!");
        }
        else if(age>=18) {
            System.out.println("You are an adult!");
        }
        else if(age>=13) {
            System.out.println("You are a teenager!");
        }
        else {
            System.out.println("You are a kid!");
        }
    }
}
