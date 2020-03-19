package com.syntax.class07;

public class Practice {
public static void main(String[]args) {
// how to print 50 to 1	

	
	int num=50;
	while(num>=1) {
		System.out.println(num);
		num--;
	}
	// how to print odds numbers from 1 to 20
	
	int num2=1;
	while(num2<20) {
		System.out.println(num2);
		num2 +=2;
	}
	// another way
	
	int num3=1;
	while(num3<=20) {
		if(num3 % 2 !=0) {
			System.out.println(num3);
	
			
			}
		num3++;
	}
}
}
