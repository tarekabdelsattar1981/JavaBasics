package com.syntax.class11;

public class Task2 {
	public static void main(String[] args) {
		//creat an array of countries
		//north america, south america, europe countries, asia, africa
		//then print all values from that array using 2 defferent loops
		// and calculate how many total countries been stored
		
		String[][] countries= {
				{"USA", "Canada"},
				{"Brazil", "mexico", "salvador"},
				{"France", "Germany", "Italy"},
				{"China", "Pakistan", "India"},
				{"Egypt","Sudan", "Morroco"}
		};
		for(int x=0; x<countries.length; x++) {
			
			for(int y=0; y<countries[x].length; y++) {
				System.out.print(countries[x][y]+" ");
			}
			System.out.println();
			
		}
		
	}

}
