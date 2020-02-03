package com.yedam.shw.referenceType;

public class Exercise07Chapter5 {
//***********************************
	public static void main(String[] args) {
		int var = 0;
		int[] array = { 1, 5, 3, 8, 2};
		var = max(array);
		System.out.println("최대값은: " + var);
	}
	
	
    public static int max(int[] var) {
    	int mx = 0;
		
		for (int i = 0; i < var.length; i++) {
			if(mx < var[i]) {
				mx = var[i];			
			}
	    }
		return mx;
    }
	
//*************************************
}
