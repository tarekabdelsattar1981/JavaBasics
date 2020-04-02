package com.syntax.class14;

public class Car {
	
	//define feature of the car
	String make;
	String model;
	String color;
	int year;
	
	//define behavior
	void drive() {
		
		System.out.println(make+" car can drive");
	}
	void accelerate() {
		System.out.println(make+" car can accelerate");
	}
	void makeNoise() {
		System.out.println(make+" car make noise");
	}
	void stop() {
		System.out.println(make+" car stops when you press break");
		System.out.println(make+" car stops");
	}
	
	
}
