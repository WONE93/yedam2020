package referenceType;

public class CalculatorExample {
//***************************************************************
	public static void main(String[] args) {
		printStar(7, "+");
		sum(1,2);  // int result = sum(1,2)하면 에러남, 호출만 가능, 반환은 안됨 
		int r = sum2(1, 2);
		System.out.println("r의 값은: " + r);
		String ret = welcome("박규림");
		System.out.println(ret);
	}
	
	public static String welcome(String name) {
		return "Hello " + name;
	}
	
	public static void sum(int a, int b) {
		int result = a+b;
		System.out.println(result);
	}
	
	public static int sum2(int a, int b) {
		int result;
		result = a+b;
		return result;  //결과를 반환하라는 뜻, 즉 int r = sum2(1,2)하면 값 반환이 됨
	}
		
		
	public static void print(int a, String str) { //print가 메소드의 역할을 함
		for (int i =0; i < 10; i++)
				System.out.println(str);
		}
	
	// *늘어나는거 
	public static void printStar(int k, String s) {
		for (int i =0; i < k; i++) {
			for(int j = 0; j <= i; j++)
				System.out.print(s);
			System.out.println( );
		}
	}
		
		
		
		
		
		/*
		int num1 = 10;
		int num2 = 20;
		sum(num1, num2);
		minus(num1, num2);
		multi(num1,num2);
		divide(num1,num2);
	}
	
	public static void sum(int a, int b) {
		int result = a+b;
		System.out.println("두수의 합은: " + result);
	}
	
	public static void minus(int x, int y) {
		int result = x-y;
		System.out.println("두수의 차이는: " + result);
		
	}
	
	public static void multi(int x, int y){
		int result = x * y;
		System.out.println("두수의 곱으: " + result);
		
	}
	
	public static void divide(int c, int d) {
		double result = (double) c / d;
		System.out.println("나눈 결과는: " + result);
	}
	*/
	
	
//******************************************	
}
