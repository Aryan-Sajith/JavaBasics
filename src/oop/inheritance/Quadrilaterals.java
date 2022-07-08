package oop.inheritance;

public class Quadrilaterals {
    private double side1, side2, side3, side4;
    private boolean allSidesEqual;

    public Quadrilaterals(double side1, double side2, double side3, double side4) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
        allSidesEqual = false;
    }

    public double Area() {return side1*side2;}
    public double Perimeter() {return side1+side2+side3+side4;}

    public boolean isAllSidesEqual() {
        return allSidesEqual;
    }
    public void setAllSidesEqual(boolean allSidesEqual) {
        this.allSidesEqual = allSidesEqual;
    }
}
