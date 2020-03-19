package com.syntax.class06;

import java.util.Scanner;

public class PracticeSale {
public static void main(String[]args) {
	/*write a program to ask user if there is sale
	 * if no sale-->not going shopping
	 * if sale we will ask the price of item
	 * based on the price we will apply discount and calculate final price
	 * 
	 * if price less than 20-->apply 10%
	 * if price between 20 and 100 --> apply 20%
	 * if price between 100 and 500--> apply 30%
	 * if price more than 500--> apply 50%
	 * 
	 * after discount__the price of the item reduced from__to__
	 */
	
	Scanner scan;
	String sale;
	double price;
	double discount;
	double finalPrice;
	
	scan=new Scanner(System.in);
	System.out.println("Is there a sale");
	sale=scan.nextLine();
	if(sale.contentEquals("Yes")) {
		System.out.println("What is the price");
		price=scan.nextDouble();
		
		if(price<=20) {
			discount=price*0.1;
			
		}else if(price>20 && price<=100) {
			discount=price*0.2;
			
		}else if(price>100 && price<500) {
			discount=price*0.3;
			
		}else {
			discount=price*0.5;
			
		}
		
		finalPrice=price-discount;
		
	
	System.out.println("After "+discount+" discount the price of the item from "+price+" to "+finalPrice);
	
	}else {
		System.out.println("No shopping today");
	}
	
}
}
