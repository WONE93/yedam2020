package com.yedam.shw;

public class VariableClass {     //클래스선언
	   //1. variableclass 클래스선언(main)
    //2. int sum,num1,num2,num3
    //3. num1->100, num2->90, num3->80
    //4. sum-> num1, num2, num3 할당
    //5. sum의 값을 콘솔화면에 출력
	
	
	public static void main (String[] args) {  //메인매소드, 안에있는거 먼저 실행하겠다는 뜻
		
		int sum, num1, num2, num3;
		sum = 0;
	    num1 = 100;
	    num2 = 90;
	    num3 = 80;
	    
	    sum = num1 + num2 + num3;
	      System.out.println("두수의 합은: " + sum); 
	      // sysout 하고 컨트롤 스페이스하면 자동완성
	      	    
	   
		
	}
}
