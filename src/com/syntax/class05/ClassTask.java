package com.syntax.class05;

import java.util.Scanner;

public class ClassTask {
public static void main (String[] args) {
	
	int hight;
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter your hight");
	 hight=scan.nextInt();
	
	if(hight<0 && hight<60) {
		System.out.println("Short");
	}else if(hight>=60 && hight<73) {
		System.out.println("medium");
	}else if(hight>=73) {
		System.out.println("Tall");
	}else
		System.out.println("Very tall");
	
	
	
	
}
}
