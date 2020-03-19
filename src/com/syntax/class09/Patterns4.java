package com.syntax.class09;

public class Patterns4 {
	public static void main(String[]args) {
		
		 for(int x=1; x<=5; x++) {
			 
			 for(int y=1; y<=9; y++) {
				 
				 System.out.print(y);
			 }
			 System.out.println();
		 }
		
		System.out.println("---------------------------");
		
		// print 54321 in rows and column
		
		for(int x=1; x<=5; x++) {
			
			for(int y=5; y>=1; y--) {
				
				System.out.print(y);
			}
			System.out.println();
		}
		System.out.println("----------------------------");
		// print 55555
		//print 44444
		
		for(int x=5; x>=1; x--) {
			
			for(int y=5; y>=1; y--) {
				
				System.out.print(x);
			}
			System.out.println();
		}
	}

}
