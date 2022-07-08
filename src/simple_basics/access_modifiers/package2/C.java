package simple_basics.access_modifiers.package2;
import simple_basics.access_modifiers.package1.*;

public class C {
    String defaultMessage = "This is the default";
    public String publicMessage = "This is public";
    private String privateMessage = "This is private";

    public static void main(String[] args) {
        //private message displayed from within the same class
        C c = new C();
        System.out.println(c.privateMessage);
    }
}
