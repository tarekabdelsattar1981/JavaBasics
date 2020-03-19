package com.sytax.class08;

import java.util.Scanner;

public class task3 {
public static void main(String[]args) {
	
	Scanner scan;
	int x;
	int y;
	int sumx;
	int sumy;
	scan=new Scanner(System.in);
	for(x=1; x<=10; x++) {
		
		if(x%2 ==0) {
			sumx=sumx+x;
		}else {
			sumy=sumy+x;
		}
	}
	System.out.println("Sum of evens="+sumx);
	System.out.println("Sum of odds="+sumy);
	
	
}
}
