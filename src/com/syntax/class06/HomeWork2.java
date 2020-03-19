package com.syntax.class06;

import java.util.Scanner;

public class HomeWork2 {
public static void main(String[]args) {
	 Scanner scan;
	 String country;
	 String language;
	 scan=new Scanner(System.in);
	 System.out.println("Please enter your country");
	country=scan.nextLine();
	switch(country) {
	case"Egypt":
	language="Arabic";
	break;
	case"Sudan":
	language="Arabic";
		break;
	case"USA":
		language="English";
		break;
		default:
			language="unknown";
			break;
	}
	
	System.out.println("Your language is "+language);
}
}
