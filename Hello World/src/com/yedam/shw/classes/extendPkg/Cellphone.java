package com.yedam.shw.classes.extendPkg;

public class Cellphone {
	private String model;
	private String color;
	
	public Cellphone() {
	
	}
	
	
	public Cellphone(String model, String color) {
		super(); // object클래스가 최상위 개념
		this.model = model;
		this.color = color;
	}
	
	void powerOn() {
		System.out.println("전원을 켭니다. ");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다. ");
	}
	
	void bell() {
		System.out.println("벨이 울립니다. ");
	}
	
	void sendMessage(String message) {
		System.out.println("자신: " + message);
	}
	
	void receiveMessage(String message) {
		System.out.println("상대방: " + message);
	}
	
	void hangUp() {
		System.out.println("전원을 끊습니다. ");
	}
	
}
