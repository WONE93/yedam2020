package com.yedam.shw.referenceType;

public class Exercise08Chapter5 {

	public static void main(String[] args) {
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		double avg = 0.0;
		int i = 0;
		int sum = 0;
		for(i=0; i < array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
		   sum += array[i][j];
		   
		}
			avg = avg+ array[i].length;
		}
		    avg = sum / avg;
		    
		System.out.println("총 합은" + sum);
		System.out.println("평균 값은" + avg);
		  
	}
	
		
	
//*********************************************
}
