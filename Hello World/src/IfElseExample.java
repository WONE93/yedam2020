
public class IfElseExample {
		public static void main(String[] args) {
/**************************************/			
			int result = 80;

			if(result >= 90) {
				System.out.println("A 학점");
			}else if(result >= 80) {
				System.out.println("B 학점");
			}else if (result >= 70) {
				System.out.println("C 학점");
			}else {
				System.out.println("F 학점");
			}
				
			
			if(result >= 90) {
				System.out.println("A 학점");
			} 
			if(result >= 80) {
				System.out.println("B 학점");
			}
			if (result >= 70) {
				System.out.println("C 학점");
			}else {
				System.out.println("F 학점");
			}
			
       int result2 = 85;
       
       if(result2 >= 90) {
    	   if(result2 >= 95) {
    	   System.out.println("A+ 학점");
       } else {
    	   System.out.println("A 학점");
          }                     // If 절안에 if넣기
       } else if (result2 >= 80) {
    	   System.out.println("B 학점");
    	   if (result2 >= 85) {
    		   System.out.println("B+ 학점");
       }        // else if안에 if 넣기
       }  // for구문
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = sum + 1;
		}
		
		int sum2 = 0;
		for (int i =1; i <= 10; i++) {
			 if( i % 2 == 0) {  //무조건 if다음에 와야함
				sum2 = sum2  + i;
				System.out.println(sum2);
				 }
		} // 10까지의 짝수의 값만 더한 값
		
		int varl = 5;
		for (int i=1; i < 10; i++) {
			int varl2 = varl * i;
			System.out.println(varl+ "*" + i + "=" + varl2);
		}  // 5단 출력하는 방법
       
		int varl3 = 5;
		for (int i=1; i < 10; i++) {
			System.out.println(varl3+ "*" + i + "=" + varl3*i);
		} // 간편 5단
       
       /********************************/
	} 
}



					


			