package com.syntax.class16;

public class Dog {
	
	String name, size;
	int age;
	
	public static void main(String[] args) {
		
		Dog dog1=new Dog();
		dog1.name="pepsi";
		dog1.size="Big";
		dog1.age=5;
		
		System.out.println("Dog 1 name is "+dog1.name);
		
		Dog dog2=new Dog();
		dog2.name="Lucy";
		dog2.size="Small";
		dog2.age=2;
		
		System.out.println("Dog 2 name is "+dog2.name);
	}

}
