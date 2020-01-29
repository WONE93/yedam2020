
public class WhileAndWhileExample {

	public static void main(String[] args) {
//********************************************************************		
		//int sum = 0;
		int i = 2;
		int j = 1;
		
		// 5단 while 구문으로 만들기 
		//방법1
		
	/*	sum = 5;
		i = 1;
		while ( i <= 9) {
			System.out.println(sum +"*"+ i + "=" + sum*i);
			i++;
		
		}
		
		// 방법2
		i = 1;
		while(true) {
			System.out.println(sum + "*" + i + "=" + sum*i);
			
			if ( i >= 9 ) {
				break;
			}
			i++;
			
			}  */
		
		//sum >= 2;
		//i <= 9;
	/*	while(true) {
			System.out.println(sum + "*" + i + "=" + sum*i);
		     
			if ( i >= 9) {
			  break;
		} i++;
		
		} */
	
		//while 구문으로 2~9단까지 만들기
		while(i <= 9) {
			while(j <= 9) { 
				System.out.println(i + "*" + j + "=" + i*j);
			 	if (j == 10) {
				 break;
			 	} 
			 	j++;
			} 
			j = 1;
			if (i == 10 ) {
				break;	
			}
			i++;
			System.out.println("  ");
		}


		
//****************************************************************
	}
}
