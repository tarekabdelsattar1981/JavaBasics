package com.syntax.class07;

import java.util.Scanner;

public class task2 {
public static void main(String[]args) {
	
	//we are playing a lottery and a lucky number is 17;
	// we want to keep asking user any number from 1-20
	//until he guess the lucky number
	
	Scanner scan;
	int number;
	int luckyNumber=17;
	scan=new Scanner(System.in);
	
	do {
		System.out.println("Please enter any number from 1-20");
		number=scan.nextInt();
	}while(number!=luckyNumber);
	
	System.out.println("You got it!!!!!!!1");


	
	
	
	
}
}
