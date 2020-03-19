package com.syntax.class07;

public class PostAndPreIncrement {
	public static void main(String[]args) {
		
		// ++,--
		//preincrement ++y, postincrement y++
		
		int y=10;
		y=y++;// postincrement=first use the variable and then increme
		
		System.out.println(y);
		
		int x=10;
		x=++x;//first increment and then use it and assign it
		System.out.println(x);
		
		
		
	}

}
