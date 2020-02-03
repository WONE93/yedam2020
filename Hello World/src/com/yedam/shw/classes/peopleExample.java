package com.yedam.shw.classes;

public class peopleExample {
	public static void main(String[] args) {
		People pe = new People();
		System.out.println(pe.name);
		System.out.println(pe.age);
		System.out.println(pe.height);
		System.out.println(pe.weight);

		System.out.println("=======================");

		People peo = new People();
		peo.name = "kim";
		peo.age = 27;
		peo.height = 160;
		peo.weight = 50;

		System.out.println(peo.name);
		System.out.println(peo.age);
		System.out.println(peo.height);
		System.out.println(peo.weight);

		peo.study();
		peo.hobby();
		System.out.println(peo.getAge());

	}
}
