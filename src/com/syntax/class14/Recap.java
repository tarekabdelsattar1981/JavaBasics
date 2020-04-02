package com.syntax.class14;

public class Recap {
	public static void main(String[] args) {
		
		int[] numbers= {16, 89, 74, 89, 25 };
		int smallest=numbers[0];
		int largest=numbers[0];
		int largest2=numbers[0];
		
		for(int x=1; x<numbers.length; x++) {
			int element=numbers[x];
			
			if(element>largest) {
				largest2=largest;
				largest=element;
			}else if(element>largest2 && element!=largest) {
				largest2=element;
			}
			if(element<smallest) {
				smallest=element;
			}
		}
		System.out.println("Smallest "+smallest);
		System.out.println("Biggest "+largest);
		System.out.println("Second largest "+largest2);
	
	}
}
