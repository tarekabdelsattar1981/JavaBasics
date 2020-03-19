package com.syntax.class03;

public class NestedIfCondinues {
   public static void main(String[]args) {
	   
	   // check if patient has allergies
	   //if no allergies -->you are healthy
	   //otherwise check if patient has:
	     //orange allergy -->do not eat orange
	     //apple allergy -->do not eat apples
	     //Kiwi allergy -->do not eat Kiwis
	boolean allergy=true;
	boolean appleAllergy=false;
	boolean orangeAllergy=true;
	boolean KiwiAllergy=false;
	
	if (allergy) {
		System.out.println("Please answer below");
		
		if (orangeAllergy) {
			System.out.println("Don not eat orange");
		}
		if(appleAllergy) {
			System.out.println("Do not eat apples");
		}
		
		
	}else {
		System.out.println("You are healthy");
	}
			
   }
}
