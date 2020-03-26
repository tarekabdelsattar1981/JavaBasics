package com.syntax.class17;

public class StaticKeywordTest {
	public static void main(String[] args) {
		
		//access static members of another class
		StaticKeyWord.brand="Android";
		StaticKeyWord.touchScreen=true;
		StaticKeyword.displayGenealInfo();
		
		//access instance members of another class
		StaticKeyWord sk=new StaticKeyword();
		sk.color="red";
		sk.memory=128;
		sk.displaySpecifications();
		
		
		StaticKeyWord sk1=new StaticKeyword();
		sk1.color="red";
		sk1.memory=128;
	}

}
