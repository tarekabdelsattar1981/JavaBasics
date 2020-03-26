package com.syntax.class12;

public class StringsRecap {
	public static void main(String[] args) {
		
	//	String str="";//empty value
		//System.out.println(str.isEmpty());
		
		//String str1=null;//no value at all
		//System.out.println(isEmpty());
		
		String str=" Good Morning";
		str=str.trim();
		System.out.println(str);
		
		String str1=" Students";
		//str= str.concat(str1);
		//System.out.println( str );
		String str2=" !";
	str=str.concat(str1).concat(str2);
	
	System.out.println(str);
	}

}
