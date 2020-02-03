package com.yedam.shw.classes;

import java.util.Scanner;

public class BankApplication {
	
	
	public static void main(String[] args) {
		Account[] acntAry = new Account[10];
		Scanner scn = new Scanner(System.in);

		boolean run = true;

		while (run) {
			System.out.println("============");
			System.out.println("1.계좌생성 2.예금 3.출금 4.계좌목록 5.계좌조회 9.종료");
			System.out.println("============");
			System.out.print("선택> ");
			int selectNo = scn.nextInt();
			scn.nextLine();

			if (selectNo == 1) { // 계좌생성
				System.out.println("계좌번호를 입력: ");
				String ano = scn.nextLine();
				System.out.println("이름입력: ");
				String owner = scn.nextLine();
				System.out.println("금액입력: ");
				int balance = scn.nextInt();
				Account acnt = new Account(ano, owner, balance);

				for (int i = 0; i < acntAry.length; i++) {
					if (acntAry[i] == null) {
						acntAry[i] = acnt;
						break;
					}
				}

			} else if (selectNo == 2) {
				System.out.print("조회 계좌 입력: ");
				String acntNo = scn.nextLine();
				Account acnt = findAccount(acntNo, acntAry);
				System.out.print("금액입력: ");
				int amount = scn.nextInt();
				acnt.setBalance(amount);

			} else if (selectNo == 3) {
				System.out.print("조회 계좌 입력: ");
				String acntNo = scn.nextLine();
				Account acnt = findAccount(acntNo, acntAry);
				System.out.print("출금액입력: ");
				int amount = scn.nextInt();
				acnt.withdrawBalance(amount);
				

			} else if (selectNo == 4) {
				for (int i = 0; i < acntAry.length; i++) {
					if (acntAry[i] != null)
						System.out.println(acntAry[i]);
				}

			} else if (selectNo == 5) { //계좌조회
				System.out.print("조회 계좌 입력: ");
				String acntNo = scn.nextLine();
				Account acnt = findAccount(acntNo, acntAry);
				System.out.println(acnt.toString2());
		

			} else if (selectNo == 9) {
				run = false;
				System.out.println("종료. ");
			}

		} // end of while
	}// end of main

	public static Account findAccount(String acntNo, Account[] ary) {
		Account acnt =null;
		for(int i=0; i<ary.length; i++) {
			if(ary[i] != null && acntNo.equals(ary[i].getAno() ) ) {
				acnt = ary[i];
			}            
		}
		return acnt;
	}

}// end of class
