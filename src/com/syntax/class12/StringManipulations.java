package com.syntax.class12;

public class StringManipulations {

	public static void main(String[] args) {
		String str="Good Morning Students !";
		
		char letter1=str.charAt(0);
		System.out.println(letter1);
		
		char letter2=str.charAt(4);
		System.out.println("Letter at index 4 is "+letter2+".");
		
		char letters;
		
		for(int x=0; x<str.length(); x++) {
			letters=str.charAt(x);
			System.out.print(letters+" ");
		}

	}

}
