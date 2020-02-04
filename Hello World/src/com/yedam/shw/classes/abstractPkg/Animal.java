package com.yedam.shw.classes.abstractPkg;

public abstract class Animal {
	
	//필드
	String kind;
	
	
	//기본생성자 존재.
	
	//메소드
	void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	//추상메소드
	abstract void sound();
	abstract void sleep();
}
