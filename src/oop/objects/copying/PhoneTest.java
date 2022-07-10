package oop.objects.copying;

public class PhoneTest {
    public static void main(String[] args) {
        Phone iPhone = new Phone("Apple","Iphone 13 Pro Max",
                1200);
        //Phone android = new Phone("Samsung","Galaxy S22 Ultra",
        //        1300);
        //android.copy(iPhone);
        Phone android = new Phone(iPhone);

        System.out.println(iPhone);
        System.out.println(android);
        System.out.println();
        System.out.println(iPhone.getCompany());
        System.out.println(iPhone.getModel());
        System.out.println(iPhone.getCost());
        System.out.println();
        System.out.println(android.getCompany());
        System.out.println(android.getModel());
        System.out.println(android.getCost());
    }
}
