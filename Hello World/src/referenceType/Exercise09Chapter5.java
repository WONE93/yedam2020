package referenceType;

import java.util.Scanner;

public class Exercise09Chapter5 {
//******************************************
	
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석| 5.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1 ) {
				System.out.println("학생수> ");					
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
				
			}else if(selectNo == 2) {
				for(int i=0; i<scores.length; i++) {
				   System.out.print("scores[ " +i+ "]>");
				   int score = scanner.nextInt();
				   scores[i] = score;
		
				
				
			}else if(selectNo == 3) {
				for (int i = 0; i)
			
				System.out.println("점수리스트> ");
				int inputSd = scanner.nextInt();
				System.out.println("리스트>" + scores);
				
				
			}else if(selectNo == 4) {
				
				int max = 0;
				sum =0, cnt =0;
				
			}
				System.out.println("분석> ");
				
				
			}else if (selectNo== 5) {
				run = false;
				
		}	
		}
		
		System.out.println("프로그램 종료.");
   }
	
	
//*****************************************
}
