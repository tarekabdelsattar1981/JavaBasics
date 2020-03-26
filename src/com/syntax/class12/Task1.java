package com.syntax.class12;

public class Task1 {
	public static void main(String[] args) {
		//creat a string and print it in reverse order( Sunday-->yadnuS )
		
		String str="Sunday";
		
		char letters;
		
		for(int x=str.length()-1; x>-1; x--) {
			 letters=str.charAt(x);
			System.out.print(letters);
		}
	}

}
