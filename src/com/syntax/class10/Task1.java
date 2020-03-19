package com.syntax.class10;

public class Task1 {
	public static void main(String[]args) {
		
		String[] animals= {"Lion","Tiger","Deer","Monkey"};
		
	     for(String animal:animals) {
	    	 
	    	 System.out.print(animal+" ,");
	     }
		
		System.out.println("----------------------------------");
		
		int[] num=new int[3];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		int sum=num[0]+num[1]+num[2];
		System.out.println("The sum of numbers is "+sum);
		
	}

      
}
