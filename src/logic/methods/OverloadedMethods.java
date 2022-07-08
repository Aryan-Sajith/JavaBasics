package logic.methods;

public class OverloadedMethods {

	public static void main(String[] args) {
		//Overloaded methods = Methods that share the same name but have different parameters
		//Allowed because Method Name + Parameters = Method Signature
		double x = multiply(1.23,2.132,3.141516,2.7194);
		System.out.println(x);
	}
	
	//Different parameters could mean number of parameters...
	public static int multiply(int n1, int n2) {
		System.out.println("This is overloaded method #1");
		return n1*n2;
	}
	public static int multiply(int n1, int n2,int n3) {
		System.out.println("This is overloaded method #2");
		return n1*n2*n3;
	}
	public static int multiply(int n1, int n2,int n3,int n4) {
		System.out.println("This is overloaded method #3");
		return n1*n2*n3*n4;
	}
	
	//Different parameters could also mean different parameter types
	public static double multiply(double n1, double n2) {
		System.out.println("This is overloaded method #4");
		return n1*n2;
	}
	public static double multiply(double n1, double n2,double n3) {
		System.out.println("This is overloaded method #5");
		return n1*n2*n3;
	}
	public static double multiply(double n1, double n2,double n3,double n4) {
		System.out.println("This is overloaded method number 6");
		return n1*n2*n3*n4;
	}
}
