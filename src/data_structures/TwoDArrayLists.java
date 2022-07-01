package data_structures;
import java.util.*;

public class TwoDArrayLists {
    public static void main(String[] args) {
        // 2D ArrayList = A dynamic list of lists

        //A bunch of ArrayLists regarding items during our shifting
        //from Natick to New Hampshire
        ArrayList<String> packedItems  = new ArrayList<>();
        packedItems.add("TV");
        packedItems.add("Dressing Table");
        packedItems.add("Kitchen Carpet");

        ArrayList<String> personalItems  = new ArrayList<>();
        personalItems.add("Macbook Pro");
        personalItems.add("Iphone 13 Pro Max");
        personalItems.add("Atomic Habits");

        ArrayList<String> thrownItems  = new ArrayList<>();
        thrownItems.add("Sofas");
        thrownItems.add("TV Stand");

        //This defines a 2-d ArrayList for all items during shifting
        ArrayList<ArrayList<String>> shiftingItems = new ArrayList<>();
        shiftingItems.add(packedItems);
        shiftingItems.add(personalItems);
        shiftingItems.add(thrownItems);

        System.out.println("Here are all the items: ");
        for(ArrayList<String> ListName : shiftingItems ){
            System.out.println(ListName);
        }
    }
}
