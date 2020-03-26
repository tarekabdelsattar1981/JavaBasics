package com.syntax.class12;

public class ReplaceAllFunction {
	public static void main(String[] args) {
		
		String str="Phone number is 1234567890";
		str=str.replaceAll("[A-Z]", "");
		System.out.println(str);
		
		str=str.replaceAll("[A-Za-z]", "");
		System.out.println(str);
		
		String str1="Hello012345&&$$89";
		str1=str1.replaceAll("[0-9]", "");
		System.out.println(str1);
		
		str1=str1.replaceAll("[^A-Za-z]", "");
		System.out.println(str1);
		
		str1=str1.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(str1);
	}

}
