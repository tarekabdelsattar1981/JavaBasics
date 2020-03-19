package com.syntax.class07;

public class task1 {
	public static void main(String[]args) {
		
		boolean workDay=true;
		int day=1;
		while(workDay) {
			
			if(day<6) {
				System.out.println("I nedd a day off");
				
			}else {
				System.out.println("I dont need a day off");
				workDay=false;
			}
			day++;
		}
		
		
		
		
		
		
	}

}
