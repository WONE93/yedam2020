
public class WhileSumExample {
	public static void main(String[] args) {
//********************************************
		
		/*
		int sum = 0;
		int i = 1;
		while(i<=5) {
			sum = sum+i;
			i++;
		}                     //FOR구문이 범위를 지정해줄때 더 눈에 잘 들어온다
		                      //WHILE은 조건이 참인지 거짓인지 무한반복 시킬때 사용
		System.out.println("합계는"+ sum);  
		*/
		
		//1~100 수중에서 짝수의 합을 구하는  while
		
		/*
		int sum = 0;
		int i = 1;
		while(i<=100) {
			if(i % 2 == 0) {
			 sum = sum+i;
			}
		i++;
		}
		
		System.out.println("i: " +i+", sum: " +sum);
		*/
		
		//구구단 5단을 출력하는 프로그램 
		
	
		int sum = 0;
		int i = 1;
		
		// 5단 while 구문으로 만들기 
		/* 방법1
		sum = 5;
		i = 1;
		while ( i <= 9) {
			System.out.println(sum +"*"+ i + "=" + sum*i);
			i++;
		
		}
		*/
		/* 방법2
		i = 1;
		while(true) {
			System.out.println(sum + "*" + i + "=" + sum*i);
			
			if ( i >= 9 ) {
				break;
			}
			i++;
			
			}
			
	*/
		
		
		
		
		
//**************************************************
	}

}
