package com.syntax.class12;

public class MoreStringFunctions {
	public static void main(String[] args) {
		//("---------replace() Function------");
		
		String me="I am a good tester";
		String NewString= me.replace("a", "c");
		System.out.println(NewString);
		
		me=me.replace("good", "amazing");
		System.out.println(me);
		
		me=me.replace("amazing", "great");
		System.out.println(me);
	}

}
