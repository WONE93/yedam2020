package classes;

public class Method {

	int leftField;
	int RightField;
//*******************************************************************
	public int getLeftField() {
		return leftField;
	}

	public void setLeftField(int leftField) {
		this.leftField = leftField;
	}

	public int getRightField() {
		return RightField;
	}

	public void setRightField(int rightField) {
		RightField = rightField;
	}

	public static void main(String[] args) {

		int num1 = 10, num2 = 15;
		int result = sum(num1, num2) * minus(num1, num2);
		System.out.println(result);
	}

	public int thisSum() {
		return leftField + RightField;
	}

	public int thisMinus() {
		return leftField - RightField; 
	}

	public static int sum(int a, int b) {
		return a + b;
	}
	public static int minus(int a, int b) {
		return a - b;
		
		
	}  
	
//***************************************************************
}
