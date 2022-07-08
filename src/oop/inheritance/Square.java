package oop.inheritance;

public class Square extends Rectangle{
    public Square(double side1, double side2, double side3, double side4) {
        super(side1, side2, side3, side4);
        allSidesEqual = true;
    }
}
