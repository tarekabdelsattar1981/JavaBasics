package com.syntax.class10;

public class RetrieveValuesFrom2Darrays {
	public static void main(String[] args) {

		String[][] month = { { "January", "February", "March" },

				{ "April", "May", "June" }, { "July", "August", "September" }, { "October", "November", "December" } };

		//System.out.println(month.length);// how many rows

		int rows = month.length;// how many arrays

		int firstArray = month[0].length;
		
		System.out.println(firstArray);
		
		for(int i=0; i<month.length; i++) {
			
			for(int j=0; j<month[i].length; j++) {
				
				System.out.println(month[i][j]);
			}
		}

	}

}
