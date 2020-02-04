package com.yedam.shw.interfaces;

public interface  RemoteControl {
	//(상수)필드 : 항상 그 값
	//인터페이스는 거의 퍼블릭
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	// 생성자(X)
	// (추상)메소드: 메소드이름, 메소드반환값
	public void turnOn();
	public void turnOff();
}
