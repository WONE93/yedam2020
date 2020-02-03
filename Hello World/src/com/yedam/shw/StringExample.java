package com.yedam.shw;

public class StringExample {

	public static void main(String[] args) {
		System.out.println(3 + 5 );
		System.out.println("두 수의 합은" +8+ "입니다.");
		System.out.println(3 + 5 + "입니다.");
		System.out.println("두 수의 합" +3+5+ "입니다"); //문자 먼저 나왔기때문에 숫자를 문자로 인식해서 35라고 나옴
		
		if(5 % 3 == 0) {
			System.out.println("입니다.");
		}
		
		int var1 = 11;
		if(var1%2 == 0) {
			System.out.println("짝수입니다");
		} else {
			System.out.println("홀수입니다");
		}
		
		System.out.println(3 >= 1);
		
	    int var3 = 30, var4 = 20;
	    int biggerValue = 0;
		if (var3 >= var4){
			biggerValue = var3;
		} else {
			biggerValue = var4;
		}
			System.out.println("큰수는" + biggerValue);
		
			biggerValue = (var3 >= var4) ? var3 : var4;
			System.out.println("큰수는" + biggerValue );
		}
	}

