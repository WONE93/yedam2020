package com.yedam.shw.classes;

public class MethodExample {
	public static void main(String[] args) {
		Method m = new Method();
		m.setLeftField(30);
		m.setRightField(4);
		int result = m.thisSum() + m.thisMinus();
		int result2 = m.sum(20, 10) * m.minus(30, 25);
		
		System.out.println(result2);
		System.out.println(result);
		
		m.setLeftField(100);
		m.setRightField(50);
		result = m.thisSum() + m.thisMinus();
		System.out.println(result);
		
		m = null;
		System.out.println(m.getLeftField());
		
		
	}

}
