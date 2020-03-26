package com.syntax.class12;

public class SplitFunction {
	public static void main(String[] args) {
		
		String today="Today is my favorite Java class";
		
		String[] array=today.split("my");
		
		System.out.println(array.length);
		System.out.println(array[0]);
		System.out.println(array[1]);
		
		String today1="Today is my favorite Java class";
		
		String[] stringArray= today1.split("a");
		//print all elements from array one by one
		
		for(String arr:stringArray) {
			System.out.print(arr+"   ");
			
		}
		String today2="Today is my favorite Java class";
		
		String[] space=today2.split(" ");
		
		
		for(int x=0; x<space.length; x++) {
			System.out.println(space[x]);
		}
	}

}
