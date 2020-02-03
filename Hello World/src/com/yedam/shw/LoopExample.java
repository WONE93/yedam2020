package com.yedam.shw;

public class LoopExample {
public static void main(String[] args) {
//**************************************
	
	
	//1~100 수중에서 3의 배수이면서 7의 배수 출력.
	// &&: AND,  ||: OR
	// 1) for
	
	
	for (int i = 1; i <=100; i++) {
		if (i % 3 == 0 && i % 7 == 0) {
			System.out.println("i: " + i );
		}
	}
	
	
	
	//2)while 이용한 3과 7의 배수 구하기   
	
	int i = 1;
	while(i<=100) {
	 if ( i % 3 == 0 && i % 7 == 0) {
	   System.out.println("i: " + i);
	   }
	 i++;	  
	}
	
	
	
	
	
	
	
	
	
	
//***************************************
}
}
