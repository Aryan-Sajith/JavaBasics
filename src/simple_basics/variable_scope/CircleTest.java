package simple_basics.variable_scope;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        c1.calcArea();
        c1.calcCircumference();
        Circle c2 = new Circle(17);
        c2.calcArea();
        c2.calcCircumference();
    }
}
