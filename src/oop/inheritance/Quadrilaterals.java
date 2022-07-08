package oop.inheritance;

public class Quadrilaterals {
    double side1;
    double side2;
    double side3;
    double side4;

    public Quadrilaterals(double side1, double side2, double side3, double side4) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
    }

    public double Area() {
        return side1*side2;
    }
    public double Perimeter() {return side1+side2+side3+side4;}
}
