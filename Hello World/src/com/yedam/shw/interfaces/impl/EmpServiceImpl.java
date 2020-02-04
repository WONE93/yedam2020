package com.yedam.shw.interfaces.impl;

import com.yedam.shw.interfaces.model.EmpService;
import com.yedam.shw.interfaces.model.Employee;

public class EmpServiceImpl implements EmpService {

	@Override
	public void addEmp(Employee emp, Employee[] emps) {//이 배열에다 저장하겠다.
		for(int i = 0; i < emps.length; i++) {
			if(emps[i] == null) {
				emps[i] = emp;
				break;
			}// End of if
		}// End of for
		System.out.println("입력완료");
	}// End of addEmp

	@Override
	public void searchEmp(int empNo, Employee[] emps) {
//		System.out.println("조회기능");
		for(Employee emp : emps) {
			if(emp != null && emp.getEmpNo() == empNo) {
				System.out.println(emp.toString2());
				
			}		
		}
	}

	@Override
	public void empList(Employee[] emps) {
//		System.out.println("리스트기능");
		for(Employee emp : emps) {
			if(emp != null) {
				System.out.println(emp);
			}
		}
		
		
	}// End of empList

	@Override
	public void delEmp(int empNo, Employee[] emps) {
//		System.out.println("삭제기능");
		for (int i = 0; i < emps.length; i++) {
			if (emps[i] != null && emps[i].getEmpNo() == empNo) {
				emps[i] = null;
			}
		}
		

	}

	@Override
	public void delEmp(int empNo) {
		// TODO Auto-generated method stub
		
	}



}
