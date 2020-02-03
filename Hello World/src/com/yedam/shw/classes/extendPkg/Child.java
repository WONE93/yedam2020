package com.yedam.shw.classes.extendPkg;

public class Child extends Parent{
	String field2;
	
	void method1() {
		//super.method1(); 부모클래스의 정보를 불러오겠다.
		System.out.println("자식클래스의 메소드1");
	}
	
	
	void method2() {
		System.out.println("자식클래스의 메소드2");
	}
	@Override
	public String toString() {
		return "Child [field2=" + field2 + "]";
	}
	


	
}
