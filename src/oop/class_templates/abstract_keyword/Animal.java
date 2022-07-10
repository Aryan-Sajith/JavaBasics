package oop.class_templates.abstract_keyword;

public abstract class Animal {
    //general method for all animals
    public void toSleep() {
        System.out.println("The animal is sleeping");
    }

    //unique method based on diet
    public abstract void toEat();
}
