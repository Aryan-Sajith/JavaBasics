package oop.super_keyword;

public class Hero extends Human {
    private final String power;

    Hero(String name, int age, String power) {
        super(name,age);
        this.power = power;
    }

    public String getPower() {
        return this.power;
    }

    @Override
    public String toString(){
        return super.toString() + ", Power:"+this.power;
    }
}
