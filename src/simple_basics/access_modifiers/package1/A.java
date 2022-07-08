package simple_basics.access_modifiers.package1;
import simple_basics.access_modifiers.package2.*;

public class A {
    protected String protectedMessage = "This is protected";
    public static void main(String[] args) {
        //public message displayed to another package
        C c = new C();
        System.out.println(c.publicMessage);

    }
}
