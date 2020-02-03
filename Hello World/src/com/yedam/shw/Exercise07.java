package com.yedam.shw;
import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
//*********************************************
		boolean run = true;
		int balance = 0;
		Scanner scn = new Scanner(System.in);
		
		while(run) {
			System.out.println("===========================");
			System.out.println("1.예금 2.출금 3.잔액 조회 4.종료");
			System.out.println("===========================");
			System.out.println("선택> ");
			
			int menu = scn.nextInt();
			if(menu==1) {
				System.out.println("예금액 입력.");
				int inputAmt = scn.nextInt();
				balance = balance + inputAmt;
			} else if ( menu== 2) {
				System.out.println("출금액 입력.");
				int inputAmt = scn.nextInt();
				balance = balance - inputAmt;
			} else if ( menu == 3 ) {
				System.out.println("잔액 조회");
				int inputAmt = scn.nextInt();
				System.out.println("잔액은" + balance);
			} else if ( menu == 4) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
		       
//********************************************
	}

}
