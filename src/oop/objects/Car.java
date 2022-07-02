package oop.objects;

public class Car {
	//attributes of our class
	private String company, model, color;
	private int year;
	private double price;
	
	//constructor = special method called when an object is instantiated
	public Car(String company,String model, String color, int year, double price) {
		//this. keyword assigns constructor parameter value to object attributes
		this.company=company;
		this.model=model;
		this.color=color;
		this.year=year;
		this.price=price;
	}
	
	//methods of our class
	public void drive() {
		System.out.printf("You are driving your %s %s %s",color,company,model);
		System.out.println();
	}
	public void brake() {
		System.out.printf("Your have stopped driving your %s %s %s",color,company,model);
		System.out.println();
	}

	public String getCompany() {
		return company;
	}
	public String getModel() {
		return model;
	}
	public String getColor() {
		return color;
	}
	public int getYear() {
		return year;
	}
	public double getPrice() {
		return price;
	}
}
