package com.syntax.class10;

public class RetrieveElements {
	public static void main(String[] args) {

		char[] grades = { 'A', 'B', 'C', 'D', 'E', 'F' };

		// getting all elements

		for (int b = 0; b < grades.length; b++) {

			System.out.println(grades[b]);
		}

		System.out.println("----printing using advanced for loop---");

		for (char grade : grades) {

			System.out.print(grade + " ");
		}
		// create an array of fruites and retrieve all elements

		String[] fruits = { "Banana", "Kiwi", "Apple", "Mango" };
		// if fruit is Apple--> that is your favorite fruit
		// advanced for loop, enhanced for loop,for each loop

		for (String fruit : fruits) {

			if (fruit.contentEquals("Apple")) {
				System.out.println(fruit + " is your favorite fruit");
			} else {

				System.out.println(fruit);
			}

		}
		System.out.println("----------------");
		// regular for loop
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);

		}

	}

}
