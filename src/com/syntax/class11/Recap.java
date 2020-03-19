package com.syntax.class11;

public class Recap {
	public static void main(String[] args) {
		
		String[][] grocries= {
				{"cucumber", "potato", "carrot"},
				{"mango", "apple", "banana","kiwi"},
				{"milk", "cheese", "yogurt"}};
		System.out.println(grocries[1][2]);
		
		//get all values from 2D array
		//loop through rows
		
		for(int r=0; r<grocries.length; r++) {
			//loop through columns
			
			for(int c=0; c<grocries[r].length; c++) {
			
			System.out.print(grocries[r][c]+" ");
		}
		System.out.println();
		}
		System.out.println("--GETTING ELEMENTS USING ADVANCE FOR LOOP--");
		//loop through all arrays
		
		for(String[] array:grocries) {
			
			//loop through each single array
			
			for(String items:array) {
				
				System.out.print(items+" ");
			}
			System.out.println();
		}
}
}