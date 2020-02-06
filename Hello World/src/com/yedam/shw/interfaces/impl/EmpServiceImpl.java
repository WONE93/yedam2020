package com.yedam.shw.interfaces.impl;

import java.util.List;

import com.yedam.shw.interfaces.model.EmpService;
import com.yedam.shw.interfaces.model.Employee;
import com.yedam.shw.interfaces.model.Employees;

public class EmpServiceImpl implements EmpService {

	@Override
	public void addEmp(Employee emp, Employee[] emps) {// 이 배열에다 저장하겠다.
		for (int i = 0; i < emps.length; i++) {
			if (emps[i] == null) {
				emps[i] = emp;
				break;
			} // End of if
		} // End of for
		System.out.println("입력완료");
	}// End of addEmp

	@Override
	public void searchEmp(int empNo, Employee[] emps) {
//		System.out.println("조회기능");
		for (Employee emp : emps) {
			if (emp != null && emp.getEmpNo() == empNo) {
				System.out.println(emp.toString2());

			}
		}
	}

	@Override
	public void empList(Employee[] emps) {
//		System.out.println("리스트기능");
		for (Employee emp : emps) {
			if (emp != null) {
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

	@Override
	public void searchEmployees() {
		System.out.println("디비조회");
		empDAO dao = new empDAO();
		Employees[] empArray = dao.getEmployees();
		for (Employees emp : empArray) {
			if (emp != null) {
				System.out.println(emp);
			}
		}

	}

	@Override
	public void insertEmployees(Employees emp) {
		System.out.println("디비 입력 기능");
		empDAO dao = new empDAO();
		dao.insertEmployees(emp);
	}

	@Override
	public List<Employees> getDBEmployees() {
		empDAO dao = new empDAO();
		
		return dao.getEmpList();
	}

	@Override
	public Employees getDBEmployee(int empId) {		
		empDAO dao = new empDAO();
		return dao.getDBEmployee(empId);
	}

	@Override
	public void insertDBEmp(Employees emp) {
		
		
	}

	@Override
	public void updateDBEmp(Employees emp) {
		empDAO dao = new empDAO();
		dao.updateEmployees(emp);
		
	}

	@Override
	public void deleteDBEmp(Employees emp) {
		empDAO dao = new empDAO();
		dao.deleteDBEmp(emp);
		
	}


		
	}


