package com.yedam.shw;

public class ForSumExample {
	public static void main(String[] args) {
//*****************************************
		
/*	
		int sum = 0;
		for(int i=1; i <=5; i++) {
			sum = sum +i;
			System.out.println("i: " + i +", sum: " +sum);  //i: 얼마, sum: 얼마 보는법
		}
		
*/
		
		int sum = 0;
		for(int i=1; i <= 33; i= i + 3) {
			sum = sum +i;
			System.out.println("i: " + i +", sum: " +sum);  //i:1이고 3씩 더한값의 합계를 보는방법
		}
		
		
        System.out.println("합계는:" + sum);
		//반복문을 쓸때는 규칙이 있어야한다.
        
        
//********************************************
	}

}
