package com.yedam.shw.classes;

import java.util.Scanner;

public class BaseballGame {
	public static void main(String[] args) {
		
		
		int[] com = new int[3];
		int[] user = new int[3];
		int num = 0;
		int count = 0;
	
		int strike = 0;
		int ball = 0;
		
		
		// process1 : 배열의 길이만큼 for반복문으로 중복 있는지 확인
				for (int i = 0; i < com.length; i++) {
					com[i] = (int) (Math.random() * 9) +1;
					for(int j = 0; j <com.length; j++) {
						if(com[i] == com[j]) {
							i--;
							break;
						}
					}
				} 
					
				Scanner scn = new Scanner(System.in);
				System.out.println("1~9까지의 정수를 입력하시오> ");
				// process2 : 1~9까지 입력하도록
				
		
			while(true) {
				for(int i=0; i<user.length; i++) {
					num = scn.nextInt();
					user[i] = num;
					if(user[i]<0 || user[i]>10) {			
					}
					System.out.println("1~9까지 정수를 입력하시오> ");
		
				}
				
				for(int i=0; i<answer.length; i++) {
					for (int j=0; j<user.length; j++) {
						if(answer[i] == user[j] && i==j) {
							strike++;						
					} else if (answer[i] == user[j] && i != j) {
						ball++;
					}					
				}
				}
				
				System.out.println("스트라이크: " + strike + "볼: " + ball);
				strike = 0;
				ball = 0;
				
				if(strike >= 3) {
					break;
				}
				count = count+1;
				
				System.out.println("Game Over");
			}
			
			
			
			
		}// main
	}// end of line
	
	
	
	

