package com.syntax.class09;

public class MoreArray {
	public static void main(String[]args) {
		// array are fixed in size
		// if we add more values then we declared-->ArrayIndexOutOfBoundsException
		String[]students=new String[3];
		students[0]="Hassna";
		students[1]="Faisal";
		students[2]="Kemal";
	//	students[3]="Aaron";//error//java.lang.ArrayIndexOutOfBoundsException:
		
	//System.out.println(students[3]);
		
		//if we store less elements than we declared
		//compiler will add default values
		
		String[]inClassStudents=new String[5];
		
		inClassStudents[0]="Hichem";
		inClassStudents[1]="Tetteh";
		
		System.out.println(inClassStudents[2]);
		
		
		
		
		
		
	}

}
