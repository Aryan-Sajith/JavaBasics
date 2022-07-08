package oop.inheritance;

public class ShapesTester {
    public static void main(String[] args) {
        // inheritance= the process where one class acquires the methods and
        // attributes of another class.
        //
        // parent/super class = the one that shares its methods/attributes
        // child/subclass = the one that inherits properties using "extends"
        // keyword.

        Rectangle rectangle = new Rectangle(37,49);
        System.out.println(rectangle.Perimeter());
        System.out.println(rectangle.Area());
        System.out.println(rectangle.isAllSidesEqual());
        System.out.println();
        Square square = new Square(69);
        System.out.println(square.Perimeter());
        System.out.println(square.Area());
        System.out.println(square.isAllSidesEqual());
    }
}
