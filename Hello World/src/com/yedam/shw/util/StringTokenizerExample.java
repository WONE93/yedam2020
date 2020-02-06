package com.yedam.shw.util;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		String text = "홍길동/이수홍/박연수";

		StringTokenizer st = new StringTokenizer(text, "/");
		// how1
		int countTokens = st.countTokens();
		for (int i = 0; i < countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}

		
		//how2
//		st = new StringTokenizer(text,"/");
//		while( st.hasMoreTokens()) {
//			String token = st.nextToken();
//			System.out.println(token);
//		}



	} // end of main
} // end of class
