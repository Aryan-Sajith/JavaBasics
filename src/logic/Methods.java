package logic;

public class Methods {
	public static void main(String[] args) {
	//method= a reusable block of code that executes when called
		//example 1 for methods with printHello();
		String name = "Aryan";
		int age = 18;
		printHello(name,age);
		
		//example 2 for methods with doSum();
		int x = 210, y = 1023;
		int sum = doSum(x,y);
		System.out.println("The sum of "+x+" and "+y+" is "+sum);
		
	}
	
	public static void printHello(String name, int age) {
		System.out.println("Hello " +name+ ", you are " +age+ " years old.");
	}
	
	public static int doSum(int x, int y) {
		return x+y;
	}
}
