package com.syntax.class16;

public class LocalVariables {
	void nameInside() {
		
		String name="John";//local variable that visible only within method it was declared
		
	}
	public static void main(String[] args) {
		
		//System.out.println(name);CE name won't be visible to another method
		//since its scope only within nameInside method
		
		boolean flag=true;
		
		if(flag) {
			
			String answer="yes";
		}
		//System.out.println(answer);CE: scope of variable answer is not visible outside of
		
		
	}

}
