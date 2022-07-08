package oop.super_keyword;

public class HeroesTester {
    public static void main(String[] args) {
        // super = Keyword that refers the parent class of an object(superclass)
        //

        Hero hero1 = new Hero("Superman",42,"Super Strength");
        Hero hero2 = new Hero("Green Lantern",36,"Reality " +
                "Manipulation");

        System.out.println(hero1);
        System.out.println(hero2);

    }
}
