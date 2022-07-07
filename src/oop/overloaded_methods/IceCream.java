package oop.overloaded_methods;

public class IceCream {
    private String flavor = "Chocolate";
    private boolean isCone = false;
    private int cost = 0;

    //Maybe you want the default free ice cream?
    public IceCream() {
    }
    //Maybe you want free ice cream with a certain flavor?
    public IceCream(String flavor) {
        this.flavor = flavor;
    }
    //Maybe you want ice cream with a certain flavor and a preferred cost?
    public IceCream(String flavor, int cost) {
        this.flavor = flavor;
        this.cost = cost;
    }
    //Or maybe, you want ice cream with a certain flavor, in a cone, with a preferred cost?
    public IceCream(String flavor, boolean isCone, int cost) {
        this.flavor = flavor;
        this.isCone = isCone;
        this.cost = cost;
    }



    public int getCost() {
        return cost;
    }
    public boolean isCone() {
        return isCone;
    }
    public String getFlavor() {
        return flavor;
    }
}
