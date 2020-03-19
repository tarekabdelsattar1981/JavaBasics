package com.syntax.class05;

public class NewTask {
public static void main (String[] args) {
	
	/*We have 7 days in a week
	 * if day is 2 or 3-->SDLC Class
	 * if day is 6,7-->Java class
	 * if day 1,5-->off day
	 * if day is 4-->review class
	 */
	int day=6;
	
	if (day==2 && day==3) {
		System.out.println("Today is SDLC class");
	}else if (day==6 || day==7) {
		System.out.println("Today is Java class");
	}else if(day==1 && day==5) {
		System.out.println("Today is no class,it is day off");
	}else if(day==4) {
		System.out.println("Today is a review class with Elion");
	}else {
		System.out.println("Invalid day");
	}
	//System.out.println(-----using strings--------------------------);
	//To compare Strings we use equals
	
	String day1="Saturday";
	
	if (day1.equals("Tuseday") || day1.equals("Wednesday")) {
		System.out.println("Today is SDLC class");
	}else if (day1.contentEquals("Saturday") || day1.contentEquals("Sunday")) {
		System.out.println("Today is Java class");
	}
}
}
