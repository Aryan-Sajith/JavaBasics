package useful_classes;

public class StringClassMethods {
    public static void main(String[] args) {
        /* String = A reference data type that can store one or more characters.
           Reference data types also have access to useful methods.
        */

        String name = "Aryan Sajith";

        //equals methods compare String variables
        boolean strComp = name.equals("Aryan");
        boolean strComp2 = name.equalsIgnoreCase("Aerian");
        //System.out.println(strComp + ", " + strComp2);

        //length method returns number of characters in string
        int strLength = name.length();
        //System.out.println("The string \"" + name + "\" is " + strLength + " characters long.");

        //charAt(index) returns the character at index
        char firstOccurrence = name.charAt(0);
        //System.out.println(firstOccurrence);

        //indexOf(Text) returns the first occurrence of Text in a String
        int whereItShows = name.indexOf("A");
        //System.out.println(whereItShows);

        //isEmpty() returns a boolean value based on if a string is empty
        boolean stringEmpty = name.isEmpty();
        //System.out.println(stringEmpty);

        //toUppercase()/toLowerCase() returns respectively changed version of a string
        String capitalName = name.toUpperCase();
        //System.out.println(capitalName);
        String lowercase = name.toLowerCase();
        //System.out.println(lowercase);

        //trim() removes empty space before and after characters in a string
        String cleanName = name.trim();
        //System.out.println(cleanName);

        //replace(oldChar, newChar) does what it says lol
        String newName = name.replace("a","z");
        System.out.println(newName);
    }
}
