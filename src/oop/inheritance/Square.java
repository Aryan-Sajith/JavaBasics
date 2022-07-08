package oop.inheritance;

public class Square extends Rectangle{
    public Square(double sideLength) {
        super(sideLength, sideLength);
        setAllSidesEqual(true);
    }
}
