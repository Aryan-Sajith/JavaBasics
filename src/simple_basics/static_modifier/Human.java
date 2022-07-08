package simple_basics.static_modifier;

public class Human {
    private final String name;
    public static int populationSize;

    public Human(String name) {
        this.name = name;
        populationSize++;
    }

    public static void displayPopulation() {
        System.out.println("The size of the human population is: "+populationSize);
    }
}
