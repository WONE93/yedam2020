package com.yedam.shw.referenceType;

public class ArrayMethodExample {
//*****************************************************
	public static void main(String[] args) {
		int[] intAry = { 3, 7, 5, 8, 4};
		int sum = 0;
		for (int i = 0; i < intAry.length; i++) { 
			sum += intAry[i];				
		}
		sum = sumArrayMethod(intAry);
		System.out.println("합은: " + sum);	
		
		int[] intAry2 = { 13, 5, 17, 18, 4};
		int sum2 = 0;
		for (int i = 0; i < intAry2.length; i++) { 
			sum2 += intAry2[i];	
		}
		sum2 = sumArrayMethod(intAry2);
		System.out.println("합은: " + sum2);	
		
		int[] intAry3 = { 35, 75, 52, 82, 45};
		int sum3 = 0;
		for (int i = 0; i < intAry3.length; i++) { 
			sum3 += intAry3[i]; 
			
		}
		  sum3 = sumArrayMethod(intAry3);
		  System.out.println("합은: " + sum3);	
	
	
	
	}
	
	//배열의 요소의 합을 계산하는 method.
	
	    public static int sumArrayMethod(int[] ary) {
	    	
	    
		int sum = 0;
		for (int i = 0; i < ary.length; i++) {
			sum += ary[i];
		
		}
		return sum;
	    }

//*************************************************
}
