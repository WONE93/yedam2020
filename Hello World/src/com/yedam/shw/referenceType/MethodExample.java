package com.yedam.shw.referenceType;

public class MethodExample {

	public static void main(String[] args) {
//*********************************************************
		
		int num1, num2;
		int result;
		
		num1 = 10;
		num2 = 20;
//		result = (num1 + num2) *3;
//		System.out.println("결과값은: " + result);
		multiAfterSum(num1,num2);
	
		int a1, a2;
		a1 = 100;
		a2 = 200;
//		result = (a1+a2) *3;  // 만약 계산식이 복잡하다면, 메소드를 호출하여 계산식을 불러온다.
//		System.out.println("결과값은: " +result);
		multiAfterSum(a1, a2);
		
	}
		
	//메소드
	public static void multiAfterSum (int a, int b) {  //여기 들어오는 값은 인트타입이여야 합니다.
		int n1, n2, rslt;
		n1 = a;
		n2 =b;
		rslt = (n1 + n2) * 3;
		System.out.println("결과값은: " + rslt);

//***********************************************************	
	}



}
