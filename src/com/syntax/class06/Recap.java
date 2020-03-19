package com.syntax.class06;

public class Recap {
public static void main(String[]args) {
	/* if hours between 1-11-->morning
	 * if hours between 12-15-->afternoon
	 * if hours between 16-20-->evening
	 * if hours between 21-24-->night*/
	int hour=13;
	String timeofday;
	
	if(hour>=1 && hour<=11) {
		timeofday="Morning";
	}else if(hour>=12 && hour<=15) {
		timeofday="Afternoon";
	}else if(hour>=16 && hour<=20) {
		timeofday="Evening";
	}else if(hour>=21 && hour<=24) {
		timeofday="Night";
	}else {
		timeofday="Unknown";
	}
	//if time of the day is not known-->only then i want to see the message
	if(!timeofday.contentEquals("Unknown")) {
		System.out.println("Right now is "+timeofday);
	}
	
	
	
	
}
}
