package com.syntax.class18;

public class ConstructorDemo {
	
	static String str="Hello";
	
	ConstructorDemo(){
		System.out.println("I am your constructor");
		System.out.println("I am non argument constructor");
	}
	ConstructorDemo(String str){
		System.out.println("I am a constructor with 1 String parameter "+str);
	}
	ConstructorDemo(int num){
		System.out.println("I am a constructor with 1 integer value="+num);
	}
	
	public static void main(String[] args) {
		//ConstructorDemo obj=new ConstructorDemo();
		System.out.println(str);
		ConstructorDemo obj=new ConstructorDemo();
		
		ConstructorDemo obj1=new ConstructorDemo(12);
	}
	

}
