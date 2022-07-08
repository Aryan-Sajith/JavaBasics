package simple_basics.static_modifier;

public class HumanTester {
    public static void main(String[] args) {
        // static-modifier = A single copy of a variable/method that is created
        // and then shared.
        //
        // The class technically "owns" one copy of the static member
        //
        // Useful to call methods/variables without needed to instantiate
        // objects.

        Human friend1 = new Human("Ron");
        Human friend2 = new Human("Hermione");
        Human friend3 = new Human("Harry");
        Human friend4 = new Human("Draco");

        // This displays the static member that portrays the size of the human
        // population... it doesn't change from object to object, so it is
        // statically defined(only a single copy) and accessed!
        Human.displayPopulation();
    }
}
