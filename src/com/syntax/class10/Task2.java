package com.syntax.class10;

public class Task2 {
	public static void main(String[]args) {
		
		String[] country= {"Egypt","USA","Paris"};
		
		for(String countries:country) {
		
		if(countries.equals("Egypt")) {
			
			System.out.println("The capital is Alexandria");
		}else {
			System.out.println(countries);
		}
		
		}
		
	}

}
