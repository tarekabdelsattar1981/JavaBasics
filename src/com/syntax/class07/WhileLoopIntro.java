package com.syntax.class07;

public class WhileLoopIntro {
public static void main(String[]args) {
	
	int time=10;
	
	if(time<12) {
		System.out.println("Good morning");
		
	}
	System.out.println("------------while loop--------------");
	
	while(time<12) {
		System.out.println("Good morninig");
		time++;
	}
	// how to print numbers from 1-50?
	
	int num=1;
	while(num<=50) {
		
		System.out.println(num);
		num++;
	}
	// how to print numbers from 20 to 30
	
	int num1=20;
	while(num1<=30) {
		System.out.println(num1);
		num++;
	}
	
	System.out.println("*****************");
	
	// how to print numbers from 5 to 15 all in 1 line
	
	int num2=5;
	while(num2<=5) {
		System.out.print(num2+" ");
		num2++;
	}
}
}
