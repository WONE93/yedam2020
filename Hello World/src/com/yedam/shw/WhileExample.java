package com.yedam.shw;

public class WhileExample {
	public static void main(String[] args) {
//*********************************************
	
		
		
		int i= 0;
		while(true) {
			i = (int) (Math.random()* 6) +1;
			System.out.println(i);
			if(i == 6) {
				break;   //최종 결과값이 6이 나올때까지 무한 반복, while을 쓰는 보편적인 방법
			}
		}
		
		
		
		
//***********************************************
	}

}
