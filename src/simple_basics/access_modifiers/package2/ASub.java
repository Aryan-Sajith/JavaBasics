package simple_basics.access_modifiers.package2;
import simple_basics.access_modifiers.package1.*;

public class ASub extends A {
    public static void main(String[] args) {
        //protected message from a subclass
        ASub asub = new ASub();
        System.out.println(asub.protectedMessage);

        //default message from the same package
        C c = new C();
        System.out.println(c.defaultMessage);
    }
}
