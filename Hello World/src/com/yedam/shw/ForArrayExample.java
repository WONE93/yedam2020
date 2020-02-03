package com.yedam.shw;

public class ForArrayExample {
public static void main(String[] args) {
//*********************************
	//1) 배열크기가 100인 배열 intAry
	// 1~100 값을 담아주세요
	int[] intAry = new int[100]; // 0의 값으로 초기화
	for (int i=0; i<100; i++) {
		intAry[i] = i+1;
		System.out.println(intAry[i]);
		
	}
	//2) 배열의 홀수번째 위치에 있는 값을
	// 합하는 for구문
	
     int sum = 0;
	 for (int i =0; i<100; i++) {
		 if (i % 2 == 0) {   //0부터 시작이라 홀수번째 위치를 구하려면 나누기 2값으로 출력
		 sum = sum + intAry[i];
		 }
	  }
	 System.out.println(sum); 
	
//***********************************
	}
}
