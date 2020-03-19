package com.syntax.class03;

import java.util.Scanner;

public class ExampleOfScanner {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		String text=scan.nextLine();
		
		System.out.println(text);
		
		System.out.println("Please enter number");
		int number=scan.nextInt();
		System.out.println(number);
		
		System.out.println("End of the program");
	}

}
