package com.yedam.shw.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.yedam.shw.interfaces.model.Employees;

public class ServiceProc {

		
	
	List<Employees> list = new ArrayList<>();
	Service service = new ServiceImpl(); // 서비스인터페이스안 기능 사용할 수 있게 해줌
	Scanner scn = new Scanner(System.in);
	//한건입력, 전체조회, 한건조회, 수정, 삭제
	public void execute() {
		System.out.println("=======================");
		System.out.println("1.추가 2.리스트조회 3.한건조회 4.수정 5.종료");
		System.out.println("=======================");
		System.out.println("선택> ");
		int menu = scn.nextInt();
		
		
		// 한건추가 0 
		if( menu==1 ) {
			System.out.print("id 입력: ");
			int employeeId = scn.nextInt();
			scn.nextLine();
			
			System.out.print("이름: ");
			String firstName = scn.nextLine();
			
			Employees emp = new Employees();			
			emp.setEmployeeId(employeeId);
			emp.setFirstName(firstName);	
			
			service.addMember(emp, list);
						
		//전체조회	0		
		}else if ( menu==2 ) {
			System.out.println("전체조회> ");
			List<Employees> list = service.getMemberList(list);
			
			for(Employees lists : list ) {
				System.out.println(lists);
			}
			
			
			
			
		//한건조회	0
		}else if ( menu==3 ) {
			System.out.println("사원번호 입력: ");
			int memberId = scn.nextInt();
			service.getMember(memberId,list);
			
			
			
		//수정	
		}else if ( menu==4 ) {
			System.out.println("조회할 이름 입력: ");
			int empId = scn.nextInt(); scn.hasNextLine();
			
			service.updateMember(emp, list);
			
			System.out.println("조회 사원번호입력> ");
			int empId = scn.nextInt(); scn.nextLine();
			System.out.println("급여 인상분 입력>  ");
			String salNum = scn.nextLine();//엔터
			System.out.println(salNum);
			int sal = 0;
			if(salNum != null && !salNum.equals("")) {
				sal = Integer.parseInt(salNum); // 문자열을 숫자형을 변수 타입으로 바꿔주는 매소드 값은 필수
			}
			System.out.println("변경할 이메일 입력> ");
			String email = scn.nextLine();
			
			 Employees emp = new Employees();
	            
	            emp.setSalary(sal);
	            emp.setEmail(email);
	            emp.setEmployeeId(empId);
	            
	            service.updateDBEmp(emp);
			
		}else if ( menu==5 ) {
			break;
			System.out.println("종료됐습니다. ");
		}
		
	
	}
}
