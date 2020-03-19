package com.syntax.class11;

public class MoreExamples {
	public static void main(String[] args) {
		
		//lets creat 2D array in which we store professions
		
		String[][] professions= {
				{"QA Testers", "Developers", "Product owner", "Scrum Master"},
				{"Math Teacher", "Science Teacher", "ESL Teacher"},
				{"Dentist", "Surgeon"}
		};
		//get elements using advance for loop
		
		for(String[] occupation:professions) {
			
			for(String title:occupation) {
				
				System.out.print(title+" ");
			}
			System.out.println();
			
		}
	}

}
