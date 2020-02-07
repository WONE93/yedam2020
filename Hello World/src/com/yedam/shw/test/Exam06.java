package com.yedam.shw.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.yedam.shw.interfaces.model.Employees;

public class Exam06 {
	Student std = new Student();
	Scanner scn = new Scanner(System.in);
	
public void execute() {
	System.out.println("===================");
	System.out.println("1.등록 2.조회 3.리스트 4.수정 ");
	System.out.println("===================");
	System.out.println("선택> ");
	int menu = scn.nextInt();
	//학생등록
	if(menu==1) {
		System.out.println("이름입력> ");
		String name = scn.nextLine();	
		System.out.println("학번입력> ");
		int student_id = scn.nextInt();
		System.out.println("영어점수입력> ");
		int english = scn.nextInt();
		System.out.println("수학점수입력> ");
		int math = scn.nextInt();
		
		Student std = new Student(name, student_id, english, math);
		std.setName(name);
		std.setStudent_id(student_id);
		std.setEnglish(english);
		std.setMath(math);
		
		
	//조회
	}else if(menu==2) {
		System.out.println("학번입력> ");
		int student_id = scn.nextInt();
		Student std = getStudent_id(student_id);
	
		System.out.println(std);
	
	//리스트
	}else if(menu==3) {
		System.out.println("리스트조회> ");
		
		List<Students> stdList = new ArrayList<>();
		
		for(Students std : list) {
			stdList.add(std);
		}
		return stdList;
		}
		
	//수정
	}else if(menu==4) {
		
	}else if(menu==5) {
		break;
		System.out.println("종료 ");
	}
	
	
}

public void List<Employees> getMemberList(List<Employees> list) {
	List<Employees> destList = new ArrayList<>();
	for(Employees emp : list) { 
		destList.add(emp);
	}
	return destList;
}

public void addStd(Student std, Student[] stds) {
	for (int i = 0; i < stds.length; i++) {
		if (stds[i] == null) {
			stds[i] = std;
			break;
		} 
	} 
	System.out.println("입력완료");
}
}
