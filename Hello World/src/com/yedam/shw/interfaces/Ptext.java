package com.yedam.shw.interfaces;

import java.util.Scanner;

public class Ptext {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("사용 전기량을 입력하시오> ");
		int no = scn.nextInt();
		int r = Electric(no);
		System.out.println("사용한 전기요금은 " + r + " 원 입니다. ");
	

	}// end of main

	public static int Electric(int no) {
		
		int r = 0;
	
		for (int i = 1; i <= no; i++) {
			if (i <= 100) {
				r += 100;
			} else if (i > 100 && i <= 200) {
				r += 150;
			} else if (i > 200 && i <= 300) {
				r += 230;
			} else if (i > 300) {
				r += 300;
			}
		}
	
		return r;

//		int r = 0;
//		
//		if(no <=100 && no >=1 ) {
//			r= no*100;
//		}else if(no <=200 && no >= 101) {
//			r= (no-100) * 150 + 10000;
//			
//		}else if(no <=300 && no >201) {
//			r= (no-200)*230 + 25000;
//			
//		}else if(no <= 301) {
//			r = (no-300)*300 + 48000;
//		}
//		
//		return r;		
//		
//	}
//	
//	
	}
} // end of class
