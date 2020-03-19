package com.syntax.class03;

public class TaskNested {
	public static void main(String[] args) {

		boolean diploma = true;
		double gpa = 3.5;

		if (diploma) {
			System.out.println("Congratulation");

			if (gpa >= 3.5) {
				System.out.println("You are eligible for scholarship");
			} else if (gpa < 3.5) {
				System.out.println("Studied hard");
			}
		} else {
			System.out.println("Get a degree");
		}

	}

}
