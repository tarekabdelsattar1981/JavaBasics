package com.syntax.class14;

public class Dog {
	String breed;
	String color;
	String size;
	int age;
	
	public static void main(String[] args) {
		
		Dog dog1=new Dog();
		dog1.breed="Germanshephard";
		dog1.color="black";
		dog1.size="large";
		dog1.age=3;
		
		Dog dog2=new Dog();
		dog2.breed="Kangal";
		dog2.color="brown";
		dog2.size="giant";
		dog2.age=5;
		
		System.out.println(dog1.breed);
		System.out.println(dog2.breed);
		System.out.println("I have a "+dog1.color+" "+dog1.breed);
		System.out.println("I have a "+dog2.size+" "+dog2.color+" "+dog2.breed+" and he is "+dog2.age+" years old");
	}

}
