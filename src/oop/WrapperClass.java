package oop;

public class WrapperClass {
    public static void main(String[] args) {
        /* Wrapper class = Provides a way to use primitive data types
        as reference data types. Can be used with certain collections.
        (Ex: ArrayList).

        PRIMITIVE     WRAPPER
        boolean       Boolean
        char          Character
        int           Integer
        double        Double


        Autoboxing = The automatic conversion that the Java compiler makes between the
        primitive type and its corresponding object wrapper class.

        Unboxing = Reverse of autoboxing. Automatic conversion of wrapper class to
        primitive type.

        One pro of primitive data types: Faster to access

        One pro of reference data types: Provides useful methods
        Ex: String.equalsIgnoreCase(...),String.compareTo(..),etc.
         */

        //autoboxing, so you can directly assign primitive values to
        //the matching Wrapper Class
        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Aryan";

        //unboxing. so you can treat reference data types as if they
        //were primitive data types
        if(a==true) {System.out.println(true);}
        if(b=='@') {System.out.println("b works!");}
        if(c==140) {System.out.println("c = 140!");}
        if(d==3.14) {System.out.println("d is Pi!");}
        if(e=="Aryan") {System.out.println("e is your name!");}
        
    }
}
