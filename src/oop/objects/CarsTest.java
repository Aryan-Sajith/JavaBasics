package oop.objects;

public class CarsTest {
	public static void main(String[] args) {
		//object = an instance of a class that contain certain attributes and methods
		//example: (phone, desk, computer, etc.)
		// Class name = new Class(...);
		Car myCar1 = new Car("Tesla","Model X","Blue",2022,120000);
		Car myCar2 = new Car("Lamborghini","Huracan","Red",2022,330000);
		
		//Use .notation to access attributes/methods... usually we use getters/setters
		System.out.println(myCar1.getCompany());
		System.out.println(myCar1.getModel());
		myCar1.drive();
		myCar1.brake();
		System.out.println();
		System.out.printf("Your %s %s %s was made in %d and costs $%,.0f \n",
				myCar2.getColor(),myCar2.getCompany(),myCar2.getModel(),myCar2.getYear(),
				myCar2.getPrice());
		System.out.println("It is "+myCar2.getColor());
		myCar2.drive();
		myCar2.brake();
	}
}
