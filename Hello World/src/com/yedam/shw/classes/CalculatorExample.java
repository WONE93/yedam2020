package com.yedam.shw.classes;

import java.util.Scanner;

public class CalculatorExample {
	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();  //시스템이 로딩되는 시점에 만들어줘야 사용가능
		
		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.print("사칙연산부 부호 입력: +,-,*,/ q:종료");
			String operator = scn.nextLine();

			if (operator.equals("q")) {
				break;
			}

			System.out.println("첫번째 수 입력: ");
			int num1 = scn.nextInt();
			System.out.println("두번째 수 입력: ");
			int num2 = scn.nextInt();
			scn.nextLine();
			c1.cal(num1, num2, operator);               //스테이틱 메소드? c1으로 로딩되는 시점에 생성

		}
		System.out.println("종료. ");
		System.out.println("----------------------");

		int a = 10, b = 20;
		int result = sum(a, b);
		result = multi(a, b);

		cal(10, 20, "/");
	}

	public static void cal(int a, int b, String oper) {
		double result = 0;
		if (oper.equals("+"))
			result = sum(a, b);
		else if (oper.contentEquals("*"))
			result = multi(a, b);
		else if (oper.contentEquals("-"))
			result = minus(a, b);
		else if (oper.contentEquals("/"))
			result = divide(a, b);
		System.out.println(result);
	}

	public static int sum(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

	public static int multi(int num1, int num2) {
		return num1 * num2;
	}

	public static int minus(int num1, int num2) {
		return num1 - num2;
	}

	public static double divide(int num1, int num2) {
		return (double) num1 / num2;
	}




} // end of line
