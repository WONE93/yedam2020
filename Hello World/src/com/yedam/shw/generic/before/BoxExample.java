package com.yedam.shw.generic.before;

public class BoxExample {
	public static void main(String[] args) {
		Box box = new Box();
		box.set(new String("hello"));//어떤 클래스든 다 받을 수 있다
		String str = (String) box.get(); //스트링 타입으로 행변환
		
		Apple apple = new Apple();
		
		box.set(apple);
		Apple apple2 = (Apple) box.get();
		String str2 = (String) box.get();
	}
}
