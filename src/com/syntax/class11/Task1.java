package com.syntax.class11;

public class Task1 {
	public static void main(String[] args) {
		//creat array of cars: american,german,korean,italian
		//then reteieve all values from that array using 2 defferent loop
		String[][] cars= {
				{"Ford", "GMC", "Crysler"},
				{"Audi", "BMW", "Benz"},
				{"Hundayi", "Lexus",},
				{"Fiat", "Ferari", "Lamborgeni"}
		};
		for(String[] make:cars) {
			
			for(String model:make) {
				System.out.print(model+" ");
			}
			System.out.println();
		}
	}

}
