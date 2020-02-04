package com.yedam.shw.interfaces.model;

public class Employee {
	String name;
	int empNo;
	int salary;
	
	public Employee(String name, int empNo, int salary) {
		super();
		this.name = name;
		this.empNo = empNo;
		this.salary = salary;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "이름: " + name + " 사원번호: " + empNo + " 월급: " + salary ;
	}
	
	
	public String toString2() {
		return "이름: " + name + " \n사원번호: " + empNo + " \n월급: " + salary ;
	}
	
}
