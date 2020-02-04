package com.yedam.shw.interfaces.control;

import java.util.Scanner;

import com.yedam.shw.interfaces.impl.EmpServiceImpl;
import com.yedam.shw.interfaces.model.EmpService;
import com.yedam.shw.interfaces.model.Employee;

public class EmpProc {

	Employee[] employees = new Employee[10];
	Scanner scn = new Scanner(System.in);
	EmpService service = new EmpServiceImpl();

	public void execute() {
		System.out.println("프로그램 시작. ");
		while (true) {
			System.out.println("==========================");
			System.out.println("1.추가 2.조회 3.리스트 4.삭제 5.종료");
			System.out.println("==========================");
			System.out.println("선택> ");
			int menu = scn.nextInt();
			scn.nextLine();
			if (menu == 1) {
				System.out.println("이름: ");
				String name = scn.nextLine();
				System.out.println("사원번호: ");
				int empNo =  scn.nextInt();
				System.out.println("급여: ");
				int salary = scn.nextInt();
				Employee emp = new Employee(name, empNo, salary);
				service.addEmp(emp, employees);		
			
			
			} else if (menu == 2) {
				System.out.println("사원번호 입력: ");
				int no = scn.nextInt();
				service.searchEmp(no, employees);
				
				
			} else if (menu == 3) {
				System.out.println("리스트 목록");
				service.empList(employees);
				
				
			} else if (menu == 4) {
				System.out.println("삭제할 사원번호 입력: ");
				int no = scn.nextInt();
				service.delEmp(no, employees);
				
				
				
			} else if (menu == 5) {
				break;
				
			} // End of if
		} // End of While
		System.out.println("종료");

	}// End of execute
}// End of Class
