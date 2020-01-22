
public class VariableTest {
	/*1. variabletest 클래스 생섯
	 *2. 정수연산을 위해서 sum,avg, num1, num2 의 변수선언,
	 *3. sum에는 num1, num2의 값을 합한 결과를
	 *4. avg에는 num1, num2의 평균값을 저장할 수 있도록.
	 *5. 콘솔에는 아래 내용 출력
	 *-> 두 수 num1(값)과 num2(값)의 합은 sum(값)입니다.
	 *-> 두 수의 평균은 avg(값) 입니다.
	 *(단, 평균은 소수로 출력이 되도록 하세요)
	 *
	 *예) 30과 45의 경우 아래 처럼 결과가 나오도록 하세요.
	 *두수의 30과 45의 합은 75입니다.
	 *두 수의 평균은 38.5 입니다. 
	 *  
	 */
	
	public static void main (String[] args) {
		int sum, num1, num2;
		double avg;
		num1 = 11;
		num2 = 20;
		sum = num1 + num2;
		avg = (double) sum /2;
				// avg = (double)(((double)num1+(double)num2)/2);  
		        // avg = sum/2.0;
				System.out.println("두 수" +num1 +"과" +num2 +"의 합은" +sum +"입니다.");
		     	System.out.println("두 수의 평균은" +avg +"입니다");
		       
	}
		 
		 
}
