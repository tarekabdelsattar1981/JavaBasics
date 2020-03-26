package Practice;

import java.util.Scanner;

public class PractceRepel32 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		String gender;
		int age;
		System.out.println("Please enter your gender:");
		gender=scan.next();	
		System.out.println("Please enter your age:");
		age=scan.nextInt();
		
		if(age>25) {
			
			if(gender.equals("M")) {
				System.out.println("Man");
			}else if(gender.equals("F")) {
				System.out.println("Woman");
			}
			if(age<25) {
				if(gender.equals("M")) {
					System.out.println("Boy");
				}else if(gender.equals("F")) {
					System.out.println("Girl");
				}
			}
			
		
		
			}
		
		
	}

}
