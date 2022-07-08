package simple_basics.to_string_method;

public class Fruit {
    private String color = "red", name = "apple";
    private int cost = 5;
    private boolean isFresh = false;

    public String toString() {
        String output;
        if (isFresh) {
            output = "This is a " + color + " " + name + " which costs " +
                    "" + cost + " dollars and is fresh!";
        } else {
            output = "This is a " + color + " " + name + " which costs " +
                    "" + cost + " dollars and is not fresh!";
        }
        return output;

    }
}
