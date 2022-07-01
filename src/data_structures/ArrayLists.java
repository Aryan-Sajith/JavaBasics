package data_structures;
import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        /*
        ArrayList =
        A resizable array.
        Elements    can be added and removed(dynamic data structure)
        Only store reference data types
         */

        ArrayList<String> subjects = new ArrayList<String>();

        //add method to insert element into the arraylist
        subjects.add("Linear Algebra");
        subjects.add("Intro to C");
        subjects.add("US History");

        //set(index, value) method changes value at specified index
        subjects.set(2, "French Studies");

        //remove(index, value) method deletes value at specified index
        subjects.remove(2);

        //clear() method removes all elements from the ArrayList
        subjects.clear();

        //size() provides the length of the arraylist, technically
        //arraylist does not have a capacity(size is changeable)
        int length = subjects.size();

        if (length == 0) {
            System.out.println("I am not taking any courses right now. Thanks for asking!");}
        else {System.out.println("I am studying " + length + " subjects. Here they are: ");}


        for(int i = 0; i < length; i++) {
            //get() method to retrieve values from certain indices
            System.out.println(subjects.get(i));
        }


    }
}
