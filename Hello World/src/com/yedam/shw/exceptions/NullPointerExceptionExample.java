package com.yedam.shw.exceptions;

import java.util.Scanner;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		String str = "H";
		Object obj = new Object();
		int num = 10;
		Integer i = num;
		Double d = 3.0;
		
		obj.equals(1);

		
//		try {
//			System.out.println(str.toString()); // 여기에 에러가 있으면
//		} catch (Exception e) { // 예외로
////			e.printStackTrace(); // 이 구문을 실행하라
//			System.out.println("에러발생. 관리자 문의.");
//		}
//
		// 예외처리방법 1
		while (true) {
			System.out.println("숫자입력: ");

			try {
				int num2 = scn.nextInt();
				System.out.println("입력하신 값은: " + num2);
				if (num2 == 9)
					break;
			} catch (Exception e) { // 예외라면
//				e.printStackTrace(); // 정확한 내용을 출력하고 싶을때
				System.out.println("!!! 입력값을 확인하세요 !!! "); // 이걸 실행하라
				scn.nextLine();
			} finally {
				System.out.println("## 반드시 실행이 되어야 할 내용 ##");
			}
		} // End of while

		// 예외처리 할 필요 없음. 예외처리방법1
		findClass();

		// 예외처리방법2

		try {
			findClass2();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("프로그램 종료. ");
	} // End of Main

	static void findClass() {
		Class t;
		try {
			t = Class.forName("java.lanf.String2");
			System.out.println(t.getName());
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

	}

	static void findClass2() throws ClassNotFoundException {
		Class t = Class.forName("java.lang.String2");
		System.out.println(t.getName());
	}

}// End of Class
