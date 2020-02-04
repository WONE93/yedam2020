package com.yedam.shw.classes;

public class StudentArrayExample {
	static Student[] stdAry = new Student[3];

	public static Student getStudent(String name) {
		Student st1 = null;
		for(int i = 0; i< stdAry.length; i++) {
			if ( stdAry[i].getName().contentEquals(name))
				st1 = stdAry[i];
		}
		return st1;
	}
	
	
	
	public static void main(String[] args) {
		Student[] std = new Student[3]; // 참조유형의 데이터 타입

		Student sn = new Student("choi", 20, 180, 70);

		Student stnt = new Student();
		stnt.setName("hong");
		stnt.setAge(20);
		stnt.setHeight(170);
		stnt.setWeight(65);

		Student snt = new Student();
		snt.setName("seo");
		snt.setAge(27);
		snt.setHeight(160);
		snt.setWeight(65);

		std[0] = sn;
		std[1] = snt;
		std[2] = stnt;

		std[0] = std[1];
		std[1] = std[2];
		std[2] = std[0];

//		for (int i = 0; i < std.length; i++) {
//			// if (std[i].getName().equals("choi")) // 문자를 비교할때는 .equals()로비교
//
//			System.out.println(std[i].getName() + " " + std[i].age);
//
//		}
		
	
	
		
		

		int sortAry[] = { 15, 13, 20, 25, 7, };
		int sortAry2 = 0;
		System.out.println("===================");

		for (int j = 0; j < sortAry.length - 1; j++) {
			for (int i = 0; i < sortAry.length - 1; i++) {
				// System.out.print(sortAry[i] + " ");
				if (sortAry[i] > sortAry[i + 1]) {
					sortAry2 = sortAry[i];
					sortAry[i] = sortAry[i + 1];
					sortAry[i + 1] = sortAry2;
				} else {
					sortAry[i] = sortAry[i];
				}
			}
		}
		for (int j = 0; j < sortAry.length; j++) {
			System.out.print(sortAry[j] + " ");
			
			Student s1 = getStudent("choi");
			System.out.println(s1);
		}
		
		
	}//
		

		
	}

