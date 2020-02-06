package com.yedam.shw.interfaces;

import java.util.Scanner;

public class getDigtNumber {
	public static void main(String[] args) {
		
		System.out.println(getDigitNumber(22));
		
//		int n;
//		Scanner scn = new Scanner(System.in);
//		System.out.println("숫자를입력하시옹> ");
//		n = scn.nextInt();
//		int[]b = new int[32];
//		
//		int i = 0;
//		while(n != 1) {
//			b[i++] = n%2;
//			n=n/2;
//		}
//			b[i]=n;	
//			for(int j = i; j>=0; --j) {
//				System.out.print(b[i]);
//			}
//			

		
	}
	
	
	static String getDigitNumber(int num) {
		String result = "";
		int num2 = 0; //나머지
		int num1 = num; //몫
		
		while (true) {
			num2 = num1 %2;
			result = num2 + result ;
			num1 = num1 /2;
			if ( num1 == 0)
				break;
		}//End of if
		return result;
	}// while
}
