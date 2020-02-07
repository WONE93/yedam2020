package com.yedam.shw.test;

import com.yedam.shw.interfaces.model.Employee;

public class Student {
	String name;
	int student_id;
	int english;
	int math;

	//생성자
	public Student() {

	}

	public Student(String name) {
		this.name = name;

	}

	public Student(String name, int student_id, int english, int math) {
		this.name = name;
		this.student_id = student_id;
		this.english = english;
		this.math = math;
	}
	


	//get and set 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStudent_id(int student_id) {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", student_id=" + student_id + ", english=" + english + ", math=" + math + "]";
	}
	

}
