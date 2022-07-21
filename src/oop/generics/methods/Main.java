package oop.generics.methods;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5};
        Character[] charArray = {'a','b','c','d','e'};
        String[] stringArray = {"Apple","Banana","Carrot","Dirt","Eggs"};
        // This uses the generic displayArray method to print elements from arrays of different types
        displayArray(intArray);
        displayArray(doubleArray);
        displayArray(charArray);
        displayArray(stringArray);

        // This uses the generic getFirstElement method to print first element from arrays of
        // different types
        System.out.println(getFirstElement(intArray));
        System.out.println(getFirstElement(doubleArray));
        System.out.println(getFirstElement(charArray));
        System.out.println(getFirstElement(stringArray));
    }
    public static <Thing> void displayArray(Thing[] array) {
        for(Thing t : array) {
            System.out.println(t+" ");
        }
        System.out.println();
    }
    public static <Thing> Thing getFirstElement(Thing[] array) {
        return array[0];
    }
}
