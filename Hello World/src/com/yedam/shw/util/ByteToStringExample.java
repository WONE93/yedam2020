package com.yedam.shw.util;

public class ByteToStringExample {
	public static void main(String[] args) {
		byte[] bytes = { 72, 101, 108, 108, 111, 32 , 74, 97, 118, 97};
		
		String st1 = new String(bytes);
		System.out.println(st1); // 32번은 띄어쓰기
		
		String st2 = new String(bytes, 6, 4); // 6번위치한 74번부터 4자리 j a v a 
		System.out.println(st2);
	}

}
