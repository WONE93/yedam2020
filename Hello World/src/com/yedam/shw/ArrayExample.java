package com.yedam.shw;

public class ArrayExample {
public static void main(String[] args) {
//************************************************
	int[] intAry = { 2, 3, 4, 5 };   // 인트를 담을 수 있는 배열 타입
	int[] int2Ary = new int[5];
	int2Ary[0] = 1;
	int2Ary[4] = 1;
	
	System.out.println(intAry[0]);
	System.out.println(intAry[1]);
	System.out.println(intAry[2]);
	System.out.println(intAry[3]);
	
	// 위의 방식과 같은 방식 (for구문 활용)
	for(int i = 0; i < 4; i++ ) {
		intAry[i] = i * 10 + 10;
		System.out.println(intAry[i]);
	}
	
     int sum = 0;
	 for (int i =0; i<4; i++) {
		 sum = sum + intAry[i];
	 }
	 System.out.println(sum);  

	
/*System.out.println("==================");
	intAry[0] = 20;    //인트타입: 위치값을 설정해 줘야함
	intAry[1] = 30;    //int 1자리에 있는 값을 30으로 바꿈
		
	System.out.println(intAry[0]);
	System.out.println(intAry[1]);
	
   */
	
	
	

	
		
	
//************************************************
}
}
