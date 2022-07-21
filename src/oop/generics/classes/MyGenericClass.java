package oop.generics.classes;

public class MyGenericClass <Thing extends Number, Thing2 extends Number> {
    Thing t1;
    Thing2 t2;
    public MyGenericClass(Thing t1, Thing2 t2) {
        this.t1 = t1;
        this.t2 = t2;
    }
    public Thing2 getValue() {
        return t2;
    }
}
