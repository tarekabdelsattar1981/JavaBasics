package com.syntax.class12;

public class IndexOf {
public static void main(String[] args) {
	
	String name="Syntax Technologies";
	int index=name.indexOf("y");
	System.out.println(index);
	
	index= name.indexOf(" ");
	System.out.println(index);
	
	index=name.indexOf("!");
	System.out.println("Index of not existing character "+index);
	
	index=name.indexOf("Technologies");
	System.out.println(index);
			
}
}