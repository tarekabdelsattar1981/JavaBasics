package com.sytax.class08;

public class ForLoop {
public static void main(String[]args) {
	
	//write a program to calculate sum of odds and sum of even numbers
	//1 to 99
	int evensSum;
	int oddsSum;
	
	for(int i=1; i<=99; i++) {
		
		if(i%2==0) {
			evenSum=evensSum+i
		}else {
			oddsSum=oddsSum+i;
		}
		
	}
	System.out.println("Sum of evens ="+evensSum);
	System.out.println("Sum of odds ="+oddsSum);
}
}
