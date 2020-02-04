package com.yedam.shw.classes.abstractPkg;

public class Cat extends Animal {

	Cat(){
		kind = "포유류";
	}
	
	
	@Override
	void sound() {
		System.out.println(kind + "냐옹.");
	}
	
	@Override
	void sleep() {
		System.out.println(kind + "니야옹쿨쿨.");
	}
	
	

}
