package com.yedam.shw.genelic;

public class BoxingExample {
	public static void main(String[] args) {
		Box<Integer> box = Util.boxing(new Integer(10));
		Integer i = box.get();
		System.out.println(i);

	}
}
