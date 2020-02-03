package com.yedam.shw.classes;

public class Singleton {
	
	private static Singleton s1 = new Singleton();
	
	private Singleton(){
	}
	
	static Singleton getInstance(){
		return s1;
	}


}//end of line
