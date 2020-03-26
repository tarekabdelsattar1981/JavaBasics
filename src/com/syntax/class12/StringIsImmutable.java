package com.syntax.class12;

public class StringIsImmutable {
	public static void main(String[] args) {
		
		String str="Hello ";
		String str1=" World";
		String str2=" hello";
		str.concat(str1).concat(str2);
		System.out.println(str);
		
		str=str.concat(str1).concat(str2);
		System.out.println(str);
		
		str=str.toUpperCase();
		System.out.println(str);
	}

}
