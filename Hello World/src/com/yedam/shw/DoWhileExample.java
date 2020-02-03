package com.yedam.shw;
import java.util.Scanner;
public class DoWhileExample {

	public static void main(String[] args) {
//*********************************************
	/*
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} 
		while ( i <= 5);
	*/
		
		Scanner scn = new Scanner(System.in); //스캐너타입 변수이름이 scn은 new 의 파일을 scn에 담는다.
		System.out.println("메세지를 입력하세요.");
		System.out.println("종료하려면 q 입력> ");
		String input = "";  //문자열 타입의 변수 인풋을 선언하다. 아무값 없이 설정
		do {
			System.out.println(">");
			input = scn.nextLine();
			System.out.println("==> " + input);
		} while (!input.equals("q")); // 조건. 인풋에 들어있는 값이 q이면 실행하라, !붙이면 반의어, q가아닌값 출력
		System.out.println("프로그램 종료.");
	
		
		
		
		
		
//*********************************************
	}

}
