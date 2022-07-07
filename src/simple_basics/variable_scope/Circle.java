package simple_basics.variable_scope;

public class Circle {
    //global variables because we utilize radius and pi for many calculations
    //with circles!
    private final double pi = Math.PI;
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void calcArea() {
        System.out.println("The area of the circle with radius "+this.radius+" is "+Math.round(pi * Math.pow(this.radius,2)));
    }
    public void calcCircumference() {
        System.out.println("The circumference of the circle with radius "+this.radius+" is "+Math.round(2*pi*this.radius));
    }

}
