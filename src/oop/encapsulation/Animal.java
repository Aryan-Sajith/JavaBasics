package oop.encapsulation;

public class Animal {
    private final String name, mealType;
    private int age;

    public Animal(String name, String mealType, int age) {
        this.name = name;
        this.mealType = mealType;
        this.age = age;
    }

    public void Eat() {
        System.out.println("The animal is eating");
    }
    public void Sleep() {
        System.out.println("The animal is sleeping");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", mealType='" + mealType + '\'' +
                ", age=" + age +
                '}';
    }
    public String getName() {
        return name;
    }
    public String getMealType() {
        return mealType;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
