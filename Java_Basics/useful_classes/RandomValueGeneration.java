package useful_classes;

import java.util.Random; //imports the necessary class

public class RandomValueGeneration{
    public static void main(String[] args) {

        Random random = new Random();
        int x = random.nextInt(6) + 1;
        double y = random.nextDouble();
        boolean z = random.nextBoolean();

        System.out.println("My random die rolled a " + x);
        System.out.println("My random double is " + y);
        System.out.println("What I said yesterday was " + z);
    }
}