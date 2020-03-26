package com.syntax.class12;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter a string:");
		
		String text= input.nextLine();
		if(!text.isEmpty()) {
			if(text.length()%2==1 && text.length()>=3) {
				System.out.println(text.charAt((text.length())/2));
			}else {
				System.out.println("Even number of characters");
			}
		}
		
	}

}
