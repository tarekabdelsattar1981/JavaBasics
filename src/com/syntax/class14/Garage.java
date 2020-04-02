package com.syntax.class14;

public class Garage {
	public static void main(String[] args) {
		
//building individual objects
	Car car1=new Car();
	car1.make="Honda";
	car1.model="Accord";
	car1.color="Black";
	car1.year= 2020;
	
	Car car2=new Car();
	car2.make="Toyota";
	car2.model="Camry";
	car2.color="Red";
	car2.year=2019;
	
	Car car3=new Car();
	car3.make="BMW";
	car3.model="M5";
	car3.color="Blue";
	car3.year=2018;
	
	//print BMW
	System.out.println(car1.make); 
	car1.drive();
	car1.accelerate();
	car2.drive();
	car2.accelerate();
	//I drive Red Toyota
	System.out.println("I drive "+car2.color+" "+car2.make);
	}

}
