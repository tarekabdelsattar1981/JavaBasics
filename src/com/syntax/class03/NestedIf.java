package com.syntax.class03;

public class NestedIf {
	public static void main(String[] args) {

		boolean classToday = true;
		boolean flag = false;

		if (classToday) {
			System.out.println("Hello");

			if (classToday) {
				System.out.println("Hello friends");
			} else {
				System.out.println("Hello family");
			}
		}

	}
}
