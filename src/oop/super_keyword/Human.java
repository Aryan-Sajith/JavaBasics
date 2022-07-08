package oop.super_keyword;

public class Human {
    private final String name;
    private final int age;

    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }

    @Override
    public String toString(){
        return this.name+", Age:"+this.age;
    }
}
