package com.yedam.shw.classes.abstractPkg;

public class Dog extends Animal {
	
	Dog(){
		kind = "몽몽이";
	}
	
	
	@Override
	void sound() {
		System.out.println(kind + "멍멍.");
		
	}
	
	@Override
	void sleep() {
		System.out.println(kind + "몽몽쿨쿨.");
	}
	

}


//// 클래스는 세가지 멤버
//1. 클래스
//2. 매소드
//3. 생성자
