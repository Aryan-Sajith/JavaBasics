package useful_classes;

public class StringClassMethods {
    public static void main(String[] args) {
        /* String = A reference data type that can store one or more characters.
           Reference data types also have access to useful methods.
        */

        String name = "Aryan Sajith   ";

        //equals methods compare String variables
        boolean strComp = name.equals("Aryan");
        System.out.println(strComp);
        boolean strComp2 = name.equalsIgnoreCase("Aerian");
        System.out.println(strComp2);
        //System.out.println(strComp + ", " + strComp2);

        //length method returns number of characters in string
        int strLength = name.length();
        System.out.println("The length of the string is "+strLength);
        //System.out.println("The string \"" + name + "\" is " + strLength + " characters long.");

        //charAt(index) returns the character at index
        char firstOccurrence = name.charAt(0);
        System.out.println("The first character in the string is "+firstOccurrence);
        //System.out.println(firstOccurrence);

        //indexOf(Text) returns the first occurrence of Text in a String
        int whereItShows = name.indexOf("y");
        System.out.println("y occurs at the index "+whereItShows);
        //System.out.println(whereItShows);

        //isEmpty() returns a boolean value based on if a string is empty
        boolean stringEmpty = name.isEmpty();
        System.out.println("The string is empty: "+stringEmpty);
        //System.out.println(stringEmpty);

        //toUppercase()/toLowerCase() returns respectively changed version of a string
        String capitalName = name.toUpperCase();
        System.out.println("My name capitalized is "+capitalName);
        
        //System.out.println(capitalName);
        String lowerName = name.toLowerCase();
        System.out.println("My name lowercase is "+lowerName);
        //System.out.println(lowercase);

        //trim() removes empty space before and after characters in a string
        String cleanName = name.trim();
        System.out.println("The cleaned up name is "+cleanName);
        //System.out.println(cleanName);

        //replace(oldChar, newChar) does what it says lol
        String newName = name.replace("a","z");
        System.out.println("My name replacing a's with z's is "+newName);
    }   
}
