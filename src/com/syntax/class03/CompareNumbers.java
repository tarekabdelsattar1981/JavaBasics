package com.syntax.class03;

public class CompareNumbers {
	public static void main(String[]args) {
		double numberOne=10;
		double numberTwo=10;
		
		if(numberOne>numberTwo) {
			System.out.println("Number one is larger than number2");
		}else if(numberOne<numberTwo){
			System.out.println("Number one is smaller than number 2");
		}else {
			System.out.println("Numbers are equal");
		}
		
		
		System.out.println("----------------------------");
		
		//declare variable for a day then based on the value
		//we will provide output
		
		int day=0;
		if(day==1) {
			System.out.println("Its Monday, no class today");
		}else if(day==2) {
			System.out.println("Its is Tuesday, we have SDLC class");
		}else if(day==3) {
			System.out.println("Its is Wednesday,we have SDLC class");
		}else if(day==4) {
			System.out.println("Its is Thursday,we have review");
		}else if(day==5) {
			System.out.println("Its is Friday, no class");
		}else if(day==6) {
			System.out.println("Its is Saturday,we have Java class");
		}else {
			System.out.println("Invalid weekday");
		}
	}
	

}
